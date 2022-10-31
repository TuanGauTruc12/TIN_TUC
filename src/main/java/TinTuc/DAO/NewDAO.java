package TinTuc.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import TinTuc.DTO.CommentDTO;
import TinTuc.DTO.MapperCommentDTO;
import TinTuc.DTO.MapperNewDTO;
import TinTuc.DTO.MapperNewDetailDTO;
import TinTuc.DTO.NewDTO;
import TinTuc.DTO.NewDetailDTO;
import TinTuc.Entity.MapperNew;
import TinTuc.Entity.New;

@Repository
public class NewDAO extends BaseDAO{
	
	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "new").toString());
	}
	
	public List<New> getAllNew(){
		return jdbcTemplate.query(getAll("new").toString(), new MapperNew());
	}
	
	public New getNewBySlug(String slug) {
		return jdbcTemplate.query(getAll("new").append(" WHERE new.slug = '").append(slug).append("' LIMIT 1;").toString(), new MapperNew()).get(0);
	}
	
	public List<New> getDataNewUpdate(){
		String sql = getAll("new ").append("ORDER BY `new`.`approval_date` DESC LIMIT 10;").toString();
		return jdbcTemplate.query(sql, new MapperNew());
	}
	
	public List<NewDTO> getDataLimitSix(){
		StringBuffer sb = sqlDataNewDTO().append(" ORDER BY RAND() LIMIT 6;");
		List<NewDTO> list = jdbcTemplate.query(sb.toString(), new MapperNewDTO());
		return list;
	}
	
	public List<CommentDTO> getCommentByNew(String slug){
		//String sql = "SELECT user.name AS author, new.title AS newTitle, property.title AS propertyTitle, new.approval_date AS approvalDate, category.slug AS categorySlug, property.slug AS propertySlug, category.title AS categoryTitle, new.view AS view, new.content AS content, (SELECT COUNT(comments_likes.like) FROM new, comments_likes WHERE new.id = comments_likes.id_new AND new.slug = '" + slug + "') AS likes, (SELECT COUNT(comments_likes.content) FROM comments_likes, new WHERE new.id = comments_likes.id AND new.slug = '" + slug + "') AS countComment FROM user, new, category, property WHERE user.id = new.author AND property.id = new.id_property AND new.id_category = category.id AND status = 1 AND new.slug = '" + slug + "';";
		//return jdbcTemplate.query(sql, new MapperCommentDTO());
		return null;
	}
	
	public NewDetailDTO getNewDetailBySlug(String slug) {
		String sql = "SELECT user.name AS author, new.title AS newTitle, property.title AS propertyTitle, new.approval_date AS approvalDate, category.slug AS categorySlug, property.slug AS propertySlug, category.title AS categoryTitle, new.view AS view, new.content AS content, (SELECT COUNT(likes.like) FROM new, likes WHERE new.id = likes.id_new AND new.slug = '" + slug + "' AND likes.like = true) AS likes, (SELECT COUNT(comments.id) FROM comments, new WHERE new.id = comments.id_new AND new.slug = '" + slug + "' AND new.status = 1) AS countComment, new.image, new.author AS authorID, new.id_property AS idProperty, new.slug AS newSlug FROM user, new, category, property WHERE user.id = new.author AND property.id = new.id_property AND new.id_category = category.id AND new.status = 1 AND new.slug = '" + slug + "' LIMIT 1;";
		return jdbcTemplate.query(sql, new MapperNewDetailDTO()).get(0);
	}
	
	public List<NewDTO> getNewByAuthor(int author){
		String sql = sqlDataNewDTO().append(" AND new.author = " + author + "  LIMIT 3;").toString();
		return jdbcTemplate.query(sql, new MapperNewDTO());
	}
	
	public List<NewDTO> getNewByProperty(int propertyID){
		String sql = sqlDataNewDTO().append(" AND new.id_property = ").append(propertyID).append(" LIMIT 3;").toString();
		return jdbcTemplate.query(sql, new MapperNewDTO());
	}
}
