package TinTuc.Controller.USER;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController extends BaseController{
	@RequestMapping(value = "/dangNhap")
	public ModelAndView dangNhap() {
		_mvShare.setViewName("user/login");
		return _mvShare;
	}

	@RequestMapping(value = "/dangKi")
	public ModelAndView dangKi() {
		_mvShare.setViewName("user/signup");
		return _mvShare;
	}

	@RequestMapping("/signUp/{email}&{pass}&{name}&{mobile}&{age}")
	public String dangKy(@PathVariable String email, @PathVariable String pass, @PathVariable String name,
			@PathVariable String mobile, @PathVariable int age) {
		//.dangKy(email, pass, name, mobile, age);
		return "redirect:" + "/dangNhap";
	}

	@RequestMapping("/signOut")
	public String dangXuat(HttpSession session) {
		session.removeAttribute("khachhang");
		return "redirect:/";
	}

	/*
	@RequestMapping("/logIn/?email={email}&password={pass}")
	public ModelAndView dangNhap(HttpSession session, @PathVariable String email, @PathVariable String pass) {
		//User user = khachHangService.dangNhap(email, pass);
		if (user == null) {
			_mvShare.setViewName("user/login");
			_mvShare.addObject("fail", "Đăng nhập không thành công. Xin vui lòng kiểm tra lại!!!");
		} else {
			session.setAttribute("user", user);
			_mvShare.setViewName("user/index");
		}
		return _mvShare;
	}
	*/
}
