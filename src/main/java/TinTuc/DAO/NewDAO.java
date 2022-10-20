package TinTuc.DAO;

import java.util.ArrayList;
import java.util.List;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Repository;

import TinTuc.DTO.MapperNewDTO;
import TinTuc.DTO.NewDTO;
import TinTuc.Entity.MapperNew;
import TinTuc.Entity.New;

@Repository
public class NewDAO extends BaseDAO{

	@Override
	public void delete(int id) {
		jdbcTemplate.execute(delete(id, "new").toString());
	}
	
	public List<New> getAllNew(){
		return jdbcTemplate.query(getAll("new").toString(), new MapperNew());
	}
	
	public List<New> getDataNewUpdate(){
		String sql = getAll("new ").append("ORDER BY `new`.`approval_date` DESC LIMIT 10;").toString();
		return jdbcTemplate.query(sql, new MapperNew());
	}
	
	public List<NewDTO> getDataLimitSix(){
		String sql = "SELECT image, user.name AS author, new.title AS newTitle, property.title AS propertyTitle, new.approval_date AS approvalDate, property.slug AS propertySlug, new.slug AS newSlug, category.slug AS categorySlug FROM new, property, category, user WHERE new.id_property = property.id AND property.id_category = category.id AND category.id = new.id_category AND new.author = user.id ORDER BY RAND() LIMIT 6;";
		List<NewDTO> list = jdbcTemplate.query(sql, new MapperNewDTO());
		return list;
	}
}
