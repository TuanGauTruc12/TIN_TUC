package TinTuc.DAO;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import TinTuc.Entity.Category;
import TinTuc.Entity.MapperCategory;

@Repository
public class CategoryDAO extends BaseDAO{
	
	public List<Category> getDataCategories(){
		List<Category> categories = new ArrayList<Category>();
		String sql = getAll("category").toString();
		categories = jdbcTemplate.query(sql, new MapperCategory());
		return categories;
	}
	
	/*
	public Category getCategoryBySlug(String slug) {
		Category category = new Category();
		String sqlString = "SELECT * FROM ";
		return category;
	}
	 */
	
	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "category").toString());
	}
}
