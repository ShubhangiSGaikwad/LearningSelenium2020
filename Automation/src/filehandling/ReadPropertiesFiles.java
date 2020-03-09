package filehandling;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class ReadPropertiesFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	FileInputStream file = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\filehandling\\OR.properties");
	
	Properties or =new Properties();
	
	or.load(file);
	
	System.out.println(or.get("name"));
	System.out.println(or.get("surname"));
	System.out.println(or.get("age"));
	//System.out.println(or.get("name"));
	
	}

}
