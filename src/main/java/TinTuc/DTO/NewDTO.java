package TinTuc.DTO;

public class NewDTO extends BaseDTO{
	private int idCategory;
	private String newSlug;
	private String categoryTitle;
	private String summary;
	
	public int getIdCategory() {
		return idCategory;
	}
	public void setIdCategory(int idCategory) {
		this.idCategory = idCategory;
	}
	public String getNewSlug() {
		return newSlug;
	}
	public void setNewSlug(String newSlug) {
		this.newSlug = newSlug;
	}
	public String getCategoryTitle() {
		return categoryTitle;
	}
	public void setCategoryTitle(String categoryTitle) {
		this.categoryTitle = categoryTitle;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
}
