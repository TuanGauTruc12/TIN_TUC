package TinTuc.DTO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCommentDTO implements RowMapper<CommentDTO>{

	@Override
	public CommentDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setUserName(rs.getString(1));
		commentDTO.setCommentDate(rs.getDate(2));
		commentDTO.setContentComment(rs.getString(3));
		return commentDTO;
	}
}
