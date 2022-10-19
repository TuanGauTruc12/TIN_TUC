package TinTuc.Entity;

public class Category extends BaseEntity{
	private String title;
	private String slug;
	private String created_at;
	private String updated_at;
	private int chubien;
	
	public Category() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSlug() {
		return slug;
	}

	public void setSlug(String slug) {
		this.slug = slug;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(String updated_at) {
		this.updated_at = updated_at;
	}

	public int getChubien() {
		return chubien;
	}

	public void setChubien(int chubien) {
		this.chubien = chubien;
	}
}
