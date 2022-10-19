package TinTuc.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import TinTuc.Entity.MapperRole;
import TinTuc.Entity.Role;

@Repository
public class RoleDAO extends BaseDAO{

	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "role").toString());
	}
	
	public List<Role> getAllRole(){
		List<Role> roles = new ArrayList<>();
		roles = jdbcTemplate.query(getAll("role").toString(), new MapperRole());
		return roles;
	}
	
}
