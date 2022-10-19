package TinTuc.Entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class MapperCommentLike implements RowMapper<ComentLike>{

	@Override
	public ComentLike mapRow(ResultSet rs, int rowNum) throws SQLException {
		ComentLike comentLike = new ComentLike();
		comentLike.setId(rs.getInt(1));
		comentLike.setContent(rs.getString(2));
		comentLike.setComment_date(rs.getDate(3));
		comentLike.setId_user(rs.getInt(4));
		comentLike.setId_new(rs.getInt(5));
		comentLike.setStatus(rs.getBoolean(6));
		return comentLike;
	}
}
