package TinTuc.DAO;

import java.sql.Date;
import java.util.List;

import org.springframework.stereotype.Repository;

import TinTuc.Entity.Comment;
import TinTuc.Entity.Like;
import TinTuc.Entity.MapperComment;
import TinTuc.Entity.MapperLike;

@Repository
public class Comment_LikeDAO extends BaseDAO{

	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "comments_likes").toString());
	}
	
	public void insertCommentNew(int idNew, int idUser, String content, Date commentDate) {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO comments(content, comment_date, id_user, id_new, status) VALUES ('");
		sb.append(content);
		sb.append("', '");
		sb.append(commentDate);
		sb.append("',");
		sb.append(idUser);
		sb.append(", ");
		sb.append(idNew);
		sb.append(", ");
		sb.append(false);
		sb.append(")");
		jdbcTemplate.execute(sb.toString());
	}
	
	public void updateCommentNew(int idNew, int idUser, String content, Date commentDate) {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE comments SET id_new = ");
		sb.append(idNew);
		sb.append(", id_user = ");
		sb.append(idUser);
		sb.append(", content = '");
		sb.append("'");
		sb.append(content);
		sb.append(", '");
		sb.append(commentDate);
		sb.append("'");
		jdbcTemplate.execute(sb.toString());
	}
	
	public void updateLikeNew(String newSlug, int idUser, boolean like) {		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE likes SET likes.like = ");
		sb.append(like);
		sb.append(" WHERE likes.id IN (SELECT likes.id FROM new, likes, user WHERE new.id = likes.id_new AND likes.id_user = user.id AND new.slug = '");
		sb.append(newSlug);
		sb.append("' AND likes.id_user = ");
		sb.append(idUser).append(")");
		jdbcTemplate.execute(sb.toString());
	}
	
	public void insertLikeNew(int idNew, int idUser) {
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO likes (likes.id_user,likes.like,likes.id_new) VALUES (");
		sb.append(idUser);
		sb.append(", ");
		sb.append(true);
		sb.append(", ");
		sb.append(idNew);
		sb.append(");");
		jdbcTemplate.execute(sb.toString());
	}
	
	
	public List<Like> checkDataLike(String slug, int idUser){
		StringBuffer sb = getAll("likes").append(", new, user ").append("WHERE likes.id_user = user.id ");
		sb.append("AND likes.id_new = new.id");
		sb.append(" AND likes.like = 1 AND new.slug = '");
		sb.append(slug).append("' AND likes.id_user = ").append(idUser);
		sb.append(" LIMIT 1");
		return jdbcTemplate.query(sb.toString(), new MapperLike());
	}
	
	public List<Comment> checkDataComment(String slug, int idUser){
		StringBuffer sb = getAll("comments").append(", new ").append("WHERE comments.id_user = user.id ");
		sb.append("AND comments.id_new = new.id");
		sb.append(" AND new.slug = ");
		sb.append(slug).append("AND comments.id_user = ").append(idUser);
		return jdbcTemplate.query(sb.toString(), new MapperComment());
	}
}
