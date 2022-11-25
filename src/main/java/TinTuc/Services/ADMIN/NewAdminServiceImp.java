package TinTuc.Services.ADMIN;

import java.util.List;

import org.springframework.stereotype.Service;

import TinTuc.DTO.Admin.CommentDTOAdmin;
import TinTuc.DTO.Admin.NewDTOAdmin;
import TinTuc.DTO.User.NewDetailDTO;
import TinTuc.Entity.New;
import TinTuc.Services.USER.BaseService;

@Service
public class NewAdminServiceImp extends BaseService implements NewAdminService{
	public List<NewDTOAdmin> getDataNewAdminByIDAuthor(int id_user){
		return newDAO.getDataNewAdminByIDAuthor(id_user);
	}

	@Override
	public void insertNew(String title, String slug, String summary, String content, int author, String posting_date, String image, String video, int id_property, int id_category) {
		newDAO.insertNew(title, slug, summary, content, author, posting_date, image, video, id_property, id_category);
	}

	@Override
	public void updateNew(int id, String title, String slug, String summary, String content,
			String posting_date, String approval_date, String image, String video, int id_property,
			int id_category) {
		newDAO.updateNew(id, title, slug, summary, content, posting_date, approval_date, image, video, id_property, id_category);
	}

	@Override
	public void updateNew(int id, boolean status, String approval_date) {
		newDAO.updateNew(id, status, approval_date);
	}

	@Override
	public void deleteNew(int id) {
		newDAO.delete(id);
	}

	@Override
	public NewDetailDTO getNewDetailAdmin(int id) {
		return newDAO.getNewDetailAdmin(id);
	}

	@Override
	public New getNewByID(int id) {
		return newDAO.getNewByID(id);
	}

	@Override
	public List<NewDTOAdmin> getDataNewAdminAll() {
		return newDAO.getDataNewAdminAll();
	}

	@Override
	public List<CommentDTOAdmin> getCommentToCensorship() {
		return commentLikeDAO.getCommentToCensorship();
	}
}
