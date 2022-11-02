package TinTuc.Controller.ADMIN;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeAdminController{
	@RequestMapping("/admin/{id_role}")
	public ModelAndView index(@PathVariable int id_role) {
		
		return new ModelAndView("admin/index");
	}
}
