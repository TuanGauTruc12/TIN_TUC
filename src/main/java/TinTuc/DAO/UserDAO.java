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
	
	public List<User> logIn(String email, String password) {
		String sql = "SELECT user.id, user.name, user.email, user.password, user.id_role, user.mobile, user.email_accuracy FROM user, role WHERE email = '" + email + "' AND password = '" + password + "' LIMIT 1";
		return jdbcTemplate.query(sql, new MapperUser());
	}
	
	public void signUp(String name, String email, String password, String email_accuracy) {
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO user (name, email, password, email_accuracy) VALUES ('");
		sb.append(name);
		sb.append("', '");
		sb.append(email);
		sb.append("', '");
		sb.append(password);
		sb.append("', '");
		sb.append(email_accuracy);
		sb.append("')");
		jdbcTemplate.execute(sb.toString());
	}
}
