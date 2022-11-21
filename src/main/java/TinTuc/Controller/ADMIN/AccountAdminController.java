package TinTuc.Controller.ADMIN;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Entity.Role;
import TinTuc.Entity.User;

@Controller
@RequestMapping(value = "/admin/account")
public class AccountAdminController extends BaseAdminController{
	@RequestMapping(value = {"/insertAccount/"}, method = RequestMethod.GET)
	public ModelAndView showAllAccount() {
		_mvShare.setViewName("/admin/account/insertaccount");
		_mvShare.addObject("roles", roleAdminServiceImp.getAllRole());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/showAccount/{id}"}, method = RequestMethod.GET)
	public ModelAndView showAccount(@PathVariable int id) {
		_mvShare.setViewName("admin/account/showaccount");
		User user = userAdminServiceImp.getUserByID(id); 
		_mvShare.addObject("userShow", user);
		_mvShare.addObject("nameRole",roleAdminServiceImp.getRoleByID(user.getId_role()).getName());		
		return _mvShare;
	}
	
	@RequestMapping(value = {"/updateAccount/{id}"}, method = RequestMethod.GET)
	public ModelAndView updateAccount(@PathVariable int id) {
		_mvShare.setViewName("admin/account/updateAccount");
		User user = userAdminServiceImp.getUserByID(id); 
		_mvShare.addObject("userUpdate", user);		
		_mvShare.addObject("roleAll", roleAdminServiceImp.getAllRole());
		return _mvShare;
	}
	
	@RequestMapping(value = {"/insert/"}, method = RequestMethod.POST, consumes = {"application/x-www-form-urlencoded"})
	public String insertAccount(@RequestParam(name = "name", required = true) String name,@RequestParam(name = "phone", required = false) String phone, @RequestParam(name = "email", required = true) String email, @RequestParam(name = "password", required = true) String password, @RequestParam(name = "role_select", required = true) int role_select, @RequestParam(name = "email_accuracy", required = false) String email_accuracy) {
		userAdminServiceImp.insertUser(name, email, password, email_accuracy, phone, role_select);
		return "redirect:/admin/account/insertAccount/";
	}
	
	@RequestMapping(value = "/updateAccount/", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
	public String updateUser( @RequestParam(name = "id") int id,@RequestParam(name = "name") String name,@RequestParam(name = "role_select") int id_role,@RequestParam(name = "email") String email, @RequestParam(name = "password") String password,@RequestParam(name = "phone") String phone, @RequestParam(name = "email_accuracy") String email_accuracy ) {
		userAdminServiceImp.updateUser(id, name, email, password, email_accuracy, phone, id_role);
		return "redirect:/admin/1/";
	}
	
	@RequestMapping("/delete/{id}")
	public String deleteUser(@PathVariable int id) {
		userAdminServiceImp.deleteUser(id);
		return "redirect:/admin/account/insertAccount/";
	}
}