package TinTuc.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseDAO {
	@Autowired
	protected JdbcTemplate jdbcTemplate;
	
	protected abstract void delete(int id);
	
	public StringBuffer delete(int id, String tableName) {
		StringBuffer sqlDelete = new StringBuffer();
		sqlDelete.append("DELETE FROM ");
		sqlDelete.append(tableName);
		sqlDelete.append(" WHERE id = ");
		sqlDelete.append(id);
		return sqlDelete;
	}
	
	protected StringBuffer getAll(String tableName) {
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("SELECT * FROM ");
		sqlBuffer.append(tableName);
		return sqlBuffer;
	}
}

