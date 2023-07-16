package readPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadtheDataFromProperty {

	public static void main(String[] args) throws IOException {
		//Read the data from config property file
		
		FileInputStream fis=new FileInputStream("./data/config.properties");
		
		//Create a object of properties class
		 Properties prop = new Properties();
		//make a file ready to read
		prop.load(fis);
		//read the perticular properties from file
		String data=prop.getProperty("Password");
		System.out.println(data);

	}

}
