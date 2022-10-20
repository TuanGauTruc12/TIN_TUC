package TinTuc.Controller.USER;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Entity.Category;
import TinTuc.Entity.Property;
import TinTuc.Services.USER.HomeServiceImp;

@Controller
public class BaseController {
	
	public ModelAndView _mvShare = new ModelAndView();
	
	@Autowired
	protected HomeServiceImp _homeServiceImp;
	
	
	@PostConstruct
	public ModelAndView Init() {		
		_mvShare.addObject("categories", _homeServiceImp.getDataCategories());
		_mvShare.addObject("properties",_homeServiceImp.getDataProperties());
		_mvShare.addObject("newUpdates", _homeServiceImp.getDataNewUpdate());
		return _mvShare;
	}
}
