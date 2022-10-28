package TinTuc.Services.USER;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import TinTuc.Entity.Comment;
import TinTuc.Entity.Like;

@Service
public class CommentLikeServiceImp extends BaseService implements CommentLikeService{

	@Override
	public void insertCommentNew(int idNew, int idUser, String content, Date commentDate) {
		commentLikeDAO.insertCommentNew(idNew, idUser, content, commentDate);
	}

	@Override
	public void updateCommentNew(int idNew, int idUser, String content, Date commentDate) {
		commentLikeDAO.updateCommentNew(idNew, idUser, content, commentDate);
	}

	@Override
	public void updateLikeNew(int idNew, int idUser, boolean like) {
		commentLikeDAO.updateLikeNew(idNew, idUser, like);
	}

	@Override
	public void insertLikeNew(int idNew, int idUser) {
		commentLikeDAO.insertLikeNew(idNew, idUser);
	}

	@Override
	public List<Like> checkDataLike(int idNew, int idUser) {
		return commentLikeDAO.checkDataLike(idNew, idUser);
	}

	@Override
	public List<Comment> checkDataComment(int idNew, int idUser) {
		return commentLikeDAO.checkDataComment(idNew, idUser);
	}
}
