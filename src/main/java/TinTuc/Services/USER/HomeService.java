package TinTuc.Services.USER;

import java.util.List;

import org.springframework.stereotype.Service;

import TinTuc.Entity.Category;

@Service
public interface HomeService {
	public List<Category> getDataCategories();
	
	public Category getCategoryByID(String slug);
}
