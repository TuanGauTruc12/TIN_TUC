package TinTuc.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class PropertyDAO extends BaseDAO{

	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "property").toString());
	}
}
