package TinTuc.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import TinTuc.Entity.MapperProperty;
import TinTuc.Entity.Property;

@Repository
public class PropertyDAO extends BaseDAO{

	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "property").toString());
	}
	
	public List<Property> getAllProperty(){
		return jdbcTemplate.query(getAll("property").toString(), new MapperProperty());
	}
}
