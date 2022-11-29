package TinTuc.Controller.ADMIN;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

public class Text {
	public static void coopyFile(String textBase64,String textFileName) {
		byte[] decryptBase64 = Base64.getDecoder().decode(textBase64.getBytes());
		try {
			FileOutputStream out = new FileOutputStream(System.getProperty("user.dir") + "\\src\\main\\webapp\\public\\user\\uploads\\tintuc" + textFileName);
			out.write(decryptBase64);
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		coopyFile(null, null);
	}

}
