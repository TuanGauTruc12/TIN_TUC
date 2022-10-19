package TinTuc.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class NewDAO extends BaseDAO{

	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "new").toString());
	}
}
