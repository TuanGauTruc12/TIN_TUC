package TinTuc.Services.USER;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TinTuc.DAO.CategoryDAO;
import TinTuc.Entity.Category;

@Service
public class HomeServiceImp implements HomeService{
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Override
	public List<Category> getDataCategories() {
		return categoryDAO.getDataCategories();
	}

	@Override
	public Category getCategoryByID(String slug) {
		
		return null;
	}
}
