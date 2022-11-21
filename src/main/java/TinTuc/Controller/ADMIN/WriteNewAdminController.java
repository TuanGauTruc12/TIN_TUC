package TinTuc.Controller.ADMIN;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Entity.Category;
import TinTuc.Entity.Property;

@Controller
@RequestMapping("/admin/new-admin/write-new")
public class WriteNewAdminController extends BaseAdminController{
		
	@RequestMapping("/{id_user}")
	//Người viết bài
	//show thêm xóa sửa tin tức
	public ModelAndView showNew(@PathVariable int id_user) {
		_mvShare.setViewName("admin/new/showNew");
		_mvShare.addObject("newAdmin", newAdminServiceImp.getDataNewAdminByIDAuthor(id_user));
		List<Category> list = categoryServiceImp.getAllDataCategories();
		_mvShare.addObject("categoriesAdmin", list);
		_mvShare.addObject("id_user", id_user);
		//newAdminServiceImp.insertNew("Hoa đẹp", "hoa-dep", "Hoa đẹp", "Hoa đẹp quá", id_user, "2022-11-20", "", "4.jpg", null, 3, 2);
		return _mvShare;
	}
	
	@RequestMapping(value = "/selectproperty/", method = RequestMethod.POST, consumes = "application/x-www-form-urlencoded")
	public @ResponseBody String selectWithCategory(@RequestParam(name = "category") int category) {
		List<Property> listProperty = propertyServiceImp.getDataAllProperty();
		List<Property> properties = new ArrayList<>();
		for (Property property : listProperty) {
			if(property.getId_category() == category) {
				properties.add(property);
			}
		}
		System.out.println(category);
		StringBuffer sb = new StringBuffer();
		for (Property property : properties) {
			sb.append("<option  value=\"");
			sb.append(property.getId());
			sb.append("\">").append(property.getTitle()).append("</option>");
		}
		return sb.toString();
	}
	
	@RequestMapping("/{id_user}/addNew/")
	public ModelAndView addNew(@PathVariable int id_user) {
		_mvShare.setViewName("admin/new/insertNew");
		List<Category> list = categoryServiceImp.getAllDataCategories();
		_mvShare.addObject("categoriesAdmin", list);
		_mvShare.addObject("id_user", id_user);
		return _mvShare;
	}
}
