package TinTuc.DTO;

import java.sql.Date;

public class CommentDTO {
	private String userName;
	private Date commentDate;
	private String contentComment;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getCommentDate() {
		return commentDate;
	}
	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}
	public String getContentComment() {
		return contentComment;
	}
	public void setContentComment(String contentComment) {
		this.contentComment = contentComment;
	}
}
