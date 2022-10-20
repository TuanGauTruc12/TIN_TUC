package TinTuc.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import TinTuc.Entity.MapperUser;
import TinTuc.Entity.User;

@Repository
public class UserDAO extends BaseDAO{
	
	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "user").toString());
	}
	
	public List<User> getAllUser(){
		return jdbcTemplate.query(getAll("user").toString(), new MapperUser());
	}
}
