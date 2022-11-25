package TinTuc.Controller.ADMIN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Text extends BaseAdminController{
	
	@RequestMapping(value = "/haha/kkkk/huhu", method = RequestMethod.GET)
	public ModelAndView Text() {
		_mvShare.setViewName("user/text");
		return _mvShare;
	}
	
	@RequestMapping(value = "/haha/kkk//huhu", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String text(@RequestParam(name = "fileName", required = true) String fileName, @RequestParam(name = "base64", required = true) String base64) {
		coopyFile(base64, fileName);
		System.out.println(base64);
		System.out.println(fileName);
		return "<h1>Thành công</h1>";
	}
	
	public void coopyFile(String textBase64, String textFileName) {
		System.out.println(textBase64);
		System.out.println("\n");
		System.out.println(textFileName);
		/*
		byte[] decryptBase64 = Base64.getDecoder().decode(textBase64.getBytes());
		try {
			FileOutputStream out = new FileOutputStream("C:\\Data\\" + textFileName);
			out.write(decryptBase64);
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}
}
