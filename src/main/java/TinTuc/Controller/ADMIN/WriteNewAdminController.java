package TinTuc.Controller.ADMIN;

import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import TinTuc.Entity.Category;
import TinTuc.Entity.Property;

@Controller
@RequestMapping(value = "/admin/new-admin/write-new")
public class WriteNewAdminController extends BaseAdminController {

	@RequestMapping("/{id_user}/")
	// Người viết bài
	// show thêm xóa sửa tin tức
	public ModelAndView showNew(@PathVariable int id_user) {
		List<Category> list = categoryServiceImp.getAllDataCategories();
		_mvShare.setViewName("admin/new/showNew");
		_mvShare.addObject("newAdmins", newAdminServiceImp.getDataNewAdminByIDAuthor(id_user));
		_mvShare.addObject("categoriesAdmin", list);
		return _mvShare;
	}

	@RequestMapping(value = "/selectproperty/", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String selectWithCategory(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(name = "category") int category) {
		response.setContentType("text/html;charset=UTF-8");
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		List<Property> listProperty = propertyServiceImp.getDataAllProperty();
		StringBuffer sb = new StringBuffer();
		sb.append("<option  value = \"").append(0).append("\">--Chon thuộc tính danh mục--</option>");
		for (Property property : listProperty) {
			if (property.getId_category() == category) {
				sb.append("<option  value=\"");
				sb.append(property.getId());
				sb.append("\">").append(property.getTitle()).append("</option>");
			}
		}
		return sb.toString();
	}

	@RequestMapping("/addNew/")
	public ModelAndView addNew() {
		_mvShare.setViewName("admin/new/insertNew");
		List<Category> list = categoryServiceImp.getAllDataCategories();
		_mvShare.addObject("categoriesAdmin", list);
		return _mvShare;
	}

	@RequestMapping(value = "/addNew/", method = RequestMethod.POST)
	//copy image or video to project
	public String addNew(@RequestParam(name = "title", required = true) String title,
			@RequestParam(name = "slug", required = true) String slug,
			@RequestParam(name = "tomtat", required = true) String summary,
			@RequestParam(name = "content", required = true) String content,
			@RequestParam(name = "id_role", required = true) int id_role,
			@RequestParam(name = "author", required = true) int author,
			@RequestParam(name = "hinhanh", required = true) String image,
			@RequestParam(name = "video", required = false) String video,
			@RequestParam(name = "thuoctinh", required = true) int id_property,
			@RequestParam(name = "danhmuc", required = true) int id_category) {
		 Date date = Calendar.getInstance().getTime();  
         DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
         newAdminServiceImp.insertNew(title, slug, summary, content, author, dateFormat.format(date), image, video, id_property, id_category);
		return "redirect://admin/new-admin/write-new/" + id_role + "/";
	}

	@RequestMapping("/showNew/{id}")
	public ModelAndView detailNewById(@PathVariable int id) {
		_mvShare.setViewName("admin/new/detail-new-admin");
		_mvShare.addObject("newDetail", newAdminServiceImp.getNewDetailAdmin(id));
		_mvShare.addObject("idNew", id);
		return _mvShare;
	}

	@RequestMapping("/updateNew/{idNew}")
	public ModelAndView updateNew(@PathVariable int idNew) {
		_mvShare.setViewName("admin/new/updateNew");
		_mvShare.addObject("newUpdate", newAdminServiceImp.getNewByID(idNew));
		_mvShare.addObject("categories", categoryServiceImp.getAllDataCategories());
		_mvShare.addObject("properties", propertyServiceImp.getDataAllProperty());
		return _mvShare;
	}

	@RequestMapping(value = "/updateNew/", method = RequestMethod.POST)
	public String updateNew(int id, String title, String slug, String summary, String content, String posting_date,
			String approval_date, String image, String video, int id_property, int id_category, int idAdmin) {
		newAdminServiceImp.updateNew(id, title, slug, summary, content, posting_date, approval_date, image, video,
				id_property, id_category);
		return "redirect:///admin/new-admin/write-new/" + idAdmin + "/";
	}

	@RequestMapping("/deleteNew/{id_role}/{idNew}")
	public String deleteNew(@PathVariable int id_role, @PathVariable int idNew) {
		newAdminServiceImp.deleteNew(idNew);
		return "redirect://admin/new-admin/write-new/" + id_role + "/";
	}
}
