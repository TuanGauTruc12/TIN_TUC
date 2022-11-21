package TinTuc.Controller.ADMIN;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Entity.Role;
import TinTuc.Entity.User;

@Controller
@RequestMapping("/admin")
public class HomeAdminController extends BaseAdminController {
	
	@RequestMapping("/{id_role}")
	public ModelAndView index(HttpSession session,@PathVariable int id_role) {
		session.setAttribute("role", roleAdminServiceImp.getRoleByID(id_role));
		switch (id_role) {
		case 1:
			_mvShare.setViewName("admin/account/account");
			List<User> users = userAdminServiceImp.getAllUser();
			List<Role> roles = roleAdminServiceImp.getAllRole();
			_mvShare.addObject("roles", roles);
			_mvShare.addObject("users", users);
			break;
		case 2: 
			_mvShare.setViewName("admin/new/showNew");
			
		}
		return _mvShare;
	}
}
