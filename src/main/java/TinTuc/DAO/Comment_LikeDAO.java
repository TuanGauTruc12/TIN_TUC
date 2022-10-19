package TinTuc.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class Comment_LikeDAO extends BaseDAO{

	@Override
	protected void delete(int id) {
		jdbcTemplate.execute(delete(id, "comments_likes").toString());
	}
}
