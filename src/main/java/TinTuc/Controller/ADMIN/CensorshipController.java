package TinTuc.Controller.ADMIN;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin/new-admin/censorship-new")
//Người kiểm duyệt: duyệt tin, check bình luận
public class CensorshipController extends BaseAdminController{
	@RequestMapping("/")
	public ModelAndView index() {
		_mvShare.setViewName("admin/censorship/news-censorship-all");
		_mvShare.addObject("newAdmins", newAdminServiceImp.getDataNewAdminAll());
		return _mvShare;
	}
	@RequestMapping("/checkCommentAll/")
	public ModelAndView checkComments() {
		_mvShare.setViewName("admin/censorship/comments");
		_mvShare.addObject("comments", newAdminServiceImp.getCommentToCensorship());
		return _mvShare;
	}
	
	@RequestMapping(value = "/update-status/{id_new}/{status}")
	public String updateStatus(@PathVariable int id, @PathVariable boolean status) {
		
		return "redirect://admin/new-admin/censorship-new/";
	}
	
	@RequestMapping("/delete-comment-new/{id}")
	public String deleteComment(@PathVariable int id) {
		
		return "redirect://admin/new-admin/censorship-new/checkCommentAll/";
	}
}
