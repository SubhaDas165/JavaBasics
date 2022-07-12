package propertyHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ProperyExample {
	String s;
	FileReader fr;
	Properties po;
	public ProperyExample() throws IOException{
		s="C:\\Users\\SUBHA DAS\\eclipse-workspace\\JavaTraining\\PropertyFile\\LoginFiles.properties";
		fr=new FileReader(s);
		po=new Properties();
		po.load(fr);
	}

	public String getUsername() {
		return po.getProperty("username");
	}
    public String getPassword() {
		return po.getProperty("password");
	}
    public String getUrl() {
		return po.getProperty("baseurl");
	}
    

}
