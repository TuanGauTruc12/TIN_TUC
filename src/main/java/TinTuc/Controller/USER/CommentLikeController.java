package TinTuc.Controller.USER;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommentLikeController extends BaseController{
	@RequestMapping("/likes/{idNew}/{idUser}")
	public String likeNew(HttpServletRequest request,@PathVariable int idNew, @PathVariable int idUser ) {
		/*
		if(_commentLikeServiceImp.checkDataLike(idNew, idUser).size() > 0 && _commentLikeServiceImp.checkDataLike(idNew, idUser).get(0) != null) {
			_commentLikeServiceImp.updateLikeNew(idNew, idUser, true);
		}else {
			_commentLikeServiceImp.insertLikeNew(idNew, idUser);
		}
		*/
		return "redirect:" + request.getHeader("Referer");
	}
}
