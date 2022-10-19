package TinTuc.Controller.USER;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Entity.Category;
import TinTuc.Services.USER.HomeServiceImp;

@Controller
public class BaseController {
	
	public ModelAndView _mvShare = new ModelAndView();
	
	@Autowired
	protected HomeServiceImp __homeServiceImp;
	
	@PostConstruct
	public ModelAndView Init() {
		List<Category> list = __homeServiceImp.getDataCategories();
		
		_mvShare.addObject("categories", __homeServiceImp.getDataCategories());
		return _mvShare;
	}
}
