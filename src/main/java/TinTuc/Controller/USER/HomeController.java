package TinTuc.Controller.USER;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController extends BaseController{
	@RequestMapping(value = "/")
	public ModelAndView index() {
       	_mvShare.setViewName("user/index");
       	_mvShare.addObject("newSixs", _homeServiceImp.getDataLimitSix());
    	return _mvShare;
    }
}
