package TinTuc.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO{
	
	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "user").toString());
	}
}
