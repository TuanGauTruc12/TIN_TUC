package TinTuc.Controller.ADMIN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Services.ADMIN.NewAdminServiceImp;
import TinTuc.Services.ADMIN.RoleAdminServiceImp;
import TinTuc.Services.ADMIN.UserAdminServiceImp;
import TinTuc.Services.USER.CategoryServiceImp;
import TinTuc.Services.USER.PropertyServiceImp;

@Controller
public class BaseAdminController {
	@Autowired
	protected UserAdminServiceImp userAdminServiceImp;
	@Autowired
	protected RoleAdminServiceImp roleAdminServiceImp;
	@Autowired
	protected NewAdminServiceImp newAdminServiceImp;
	@Autowired
	protected CategoryServiceImp categoryServiceImp;
	@Autowired
	protected PropertyServiceImp propertyServiceImp;
	
	protected ModelAndView _mvShare = new ModelAndView();
}
