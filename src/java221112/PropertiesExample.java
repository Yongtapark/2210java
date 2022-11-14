package java221112;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesExample {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties =new Properties();
		String path=PropertiesExample.class.getResource("database.properties").getPath();
		path = URLDecoder.decode(path,"UTF-8");
		properties.load(new FileReader(path));
		
		String driver =properties.getProperty("driver");
		String url = properties.getProperty("url");
		String username2 =properties.getProperty("username");
		String password = properties.getProperty("password");
		String country = properties.getProperty("country");
		
		System.out.println("driver : "+driver);
		System.out.println("url : "+url);
		System.out.println("username : "+username2);
		System.out.println("password : "+password);
		System.out.println("country : "+country);
	}

}
