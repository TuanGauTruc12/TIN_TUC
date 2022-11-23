package TinTuc.Controller.USER;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.google.protobuf.Internal.ProtobufList;

import TinTuc.Entity.User;
import TinTuc.Services.USER.UserServiceImp;

@Controller
@RequestMapping("/login-signup")
public class UserController extends BaseController {
	ModelAndView mv = new ModelAndView();

	@Autowired
	UserServiceImp userServiceImp;

	@RequestMapping("/login/")
	public ModelAndView dangNhap() {
		mv.setViewName("/login-signup/login");
		return mv;
	}

	@RequestMapping(value = "/login/", method = RequestMethod.POST)
	public String dangNhap(HttpSession session, Model model, @RequestParam(name = "email", required = true) String email, @RequestParam(name = "password", required = true) String pass) {
		List<User> users = userServiceImp.logIn(email, pass);
		if (users.size() == 0) {
			model.addAttribute("login", "Đăng nhập thất bại");
			return "login-signup/login";
		}
		String url = "";
		User user = users.get(0);
		switch(user.getId_role()) {
		case 0:
			session.setAttribute("user", user);
			url = "redirect:/";
			break;
		case 1:
			//admin account
			session.setAttribute("admin", user);
			url = "redirect://admin/account/showALL/" + user.getId_role();
			break;
		case 2:
			//admin kiem duyet
			session.setAttribute("admin", user);
			url = "redirect:/";
			break;
		case 3:
			//admin new
			session.setAttribute("admin", user);
			url = "redirect:/admin/new-admin/write-new/" + user.getId_role() + "/";
			break;
		}
		return url;
	}

	@RequestMapping("/signup/")
	public ModelAndView dangKi() {
		mv.setViewName("/login-signup/signUp");
		return mv;
	}

	@RequestMapping(value = "/login-signup/signUp/", method = RequestMethod.POST)
	public String dangKy(@RequestParam(name = "name", required = true) String name, @RequestParam(name = "email", required = true) String email, @RequestParam(name = "password", required = true) String password) {
		 userServiceImp.signUp(name, email, password, email);
		return "redirect:" + "/login-signup/login/";
	}

	@RequestMapping("/signOut/")
	public String dangXuat(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/";
	}
}
