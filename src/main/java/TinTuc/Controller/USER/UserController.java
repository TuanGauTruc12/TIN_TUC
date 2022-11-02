package TinTuc.Controller.USER;

import java.util.List;

import javax.faces.flow.ReturnNode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import TinTuc.Entity.User;
import TinTuc.Services.USER.UserServiceImp;

@Controller
public class UserController extends BaseController{
	ModelAndView mv = new ModelAndView();
	
	@Autowired
	UserServiceImp userServiceImp;
	
	@RequestMapping("/login-signup/login/")
	public ModelAndView dangNhap() {
		mv.setViewName("/login-signup/login");
		return mv;
	}
	
	@RequestMapping("/login-signup/login/email={email}&password={pass}")
	public String dangNhap(HttpSession session, Model model, @PathVariable String email, @PathVariable String pass) {
		List<User> users = userServiceImp.logIn(email, pass);
		if(users.size() == 0) {
			model.addAttribute("login", "Đăng nhập thất bại");
			return "login-signup/login";
		}
		User user = users.get(0);
		if(user.getId_role()  == 0) {
			session.setAttribute("user", user);
			return "redirect:/";
		}
		return "redirect:/admin/" + user.getId_role() + "/";
	}

	@RequestMapping("/login-signup/signup/")
	public ModelAndView dangKi() {
		mv.setViewName("/login-signup/signUp");
		return mv;
	}

	@RequestMapping("/login-signup/signUp/{email}&{pass}&{name}&{mobile}&{age}")
	public String dangKy(@PathVariable String email, @PathVariable String pass, @PathVariable String name,
			@PathVariable String mobile, @PathVariable int age) {
		//.dangKy(email, pass, name, mobile, age);
		return "redirect:" + "/login-signup/login";
	}

	@RequestMapping("/login-signup/signOut/")
	public String dangXuat(HttpSession session) {
		session.removeAttribute("user");
		return "redirect:/";
	}
}
