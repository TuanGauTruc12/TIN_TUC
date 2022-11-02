package TinTuc.Controller.ADMIN;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Text {
public static void main(String[] args) {
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	long millis = System.currentTimeMillis();  
    Date date = new Date(millis);
    //System.out.println(Date.valueOf(dateFormat.format(date)));
    Date d = Date.valueOf(dateFormat.format(date));
    System.out.println(d);
}
}
