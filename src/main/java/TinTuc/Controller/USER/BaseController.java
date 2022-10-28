package TinTuc.Controller.USER;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Services.USER.CategoryServiceImp;
import TinTuc.Services.USER.CommentLikeServiceImp;
import TinTuc.Services.USER.HomeServiceImp;
import TinTuc.Services.USER.NewServiceImp;
import TinTuc.Services.USER.PropertyServiceImp;

@Controller
public class BaseController {
	
	public ModelAndView _mvShare = new ModelAndView();
	
	@Autowired
	protected PropertyServiceImp _propertyServiceImp;
	
	@Autowired
	protected CategoryServiceImp _categoryServiceImp;
	
	@Autowired
	protected HomeServiceImp _homeServiceImp;
	
	@Autowired
	protected NewServiceImp _newServiceImp;
	
	@Autowired
	protected CommentLikeServiceImp _commentLikeServiceImp;
	
	//@Autowired
	//protected UserSe
	
	
	@PostConstruct
	public ModelAndView Init() {		
		_mvShare.addObject("categories", _homeServiceImp.getDataCategories());
		_mvShare.addObject("properties",_homeServiceImp.getDataProperties());
		_mvShare.addObject("newUpdates", _homeServiceImp.getDataNewUpdate());
		return _mvShare;
	}
}
