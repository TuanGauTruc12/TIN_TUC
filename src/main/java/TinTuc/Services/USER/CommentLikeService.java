package TinTuc.Services.USER;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import TinTuc.Entity.Comment;
import TinTuc.Entity.Like;

@Service
public interface CommentLikeService{
	public void insertCommentNew(int idNew, int idUser, String content, Date commentDate);
	public void updateCommentNew(int idNew, int idUser, String content, Date commentDate);
	public void updateLikeNew(int idNew, int idUser, boolean like);
	public void insertLikeNew(int idNew, int idUser);
	public List<Like> checkDataLike(int idNew, int idUser);
	public List<Comment> checkDataComment(int idNew, int idUser);
}
