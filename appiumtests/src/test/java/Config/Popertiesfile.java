package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class Popertiesfile {
	
	public static void readPropertiesfile() {
		Properties prop = new Properties();
		try {
			
			InputStream input = new FileInputStream("C:\\Users\\pravallikan\\eclipse-workspace\\appiumtests\\src\\test\\java\\Config\\config.properties");
		} 
		
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
