package TinTuc.DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperNewDTO implements RowMapper<NewDTO>{

	@Override
	public NewDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		NewDTO newDTO = new NewDTO();
		newDTO.setImage(rs.getString(1));
		newDTO.setAuthor(rs.getString(2));
		newDTO.setNewTitle(rs.getString(3));
		newDTO.setPropertyTitle(rs.getString(4));
		newDTO.setApprovalDate(rs.getDate(5));
		newDTO.setPropertySlug(rs.getString(6));
		newDTO.setNewSlug(rs.getString(7));
		newDTO.setCategorySlug(rs.getString(8));
		newDTO.setIdCategory(rs.getInt(9));
		newDTO.setCategoryTitle(rs.getString(10));
		newDTO.setView(rs.getInt(11));
		newDTO.setSummary(rs.getString(12));
		newDTO.setIdProperty(rs.getInt(13));
		return newDTO;
	}

}
