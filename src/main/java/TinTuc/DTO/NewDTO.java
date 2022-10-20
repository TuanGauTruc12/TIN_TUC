package TinTuc.DTO;

import java.sql.Date;

public class NewDTO {
	private String image;
	private String author;
	private String newTitle;
	private String propertyTitle;
	private Date approvalDate;
	private String propertySlug;
	private String newSlug;
	private String categorySlug;
	
	public String getCategorySlug() {
		return categorySlug;
	}
	public void setCategorySlug(String categorySlug) {
		this.categorySlug = categorySlug;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getNewTitle() {
		return newTitle;
	}
	public void setNewTitle(String newTitle) {
		this.newTitle = newTitle;
	}
	public String getPropertyTitle() {
		return propertyTitle;
	}
	public void setPropertyTitle(String propertyTitle) {
		this.propertyTitle = propertyTitle;
	}
	public Date getApprovalDate() {
		return approvalDate;
	}
	public void setApprovalDate(Date approvalDate) {
		this.approvalDate = approvalDate;
	}
	public String getPropertySlug() {
		return propertySlug;
	}
	public void setPropertySlug(String propertySlug) {
		this.propertySlug = propertySlug;
	}
	public String getNewSlug() {
		return newSlug;
	}
	public void setNewSlug(String newSlug) {
		this.newSlug = newSlug;
	}
}
