package propertyHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class SetPropertiesExample {
	public static void main(String[] args) throws IOException {
		String s="C:\\Users\\SUBHA DAS\\eclipse-workspace\\JavaTraining\\PropertyFile\\LoginFiles.properties";
		FileReader f=new FileReader(s);
		Properties p=new Properties();
		p.load(f);
		System.out.println(p);
		p.setProperty("password", "Subha12345");
		System.out.println(p);
		FileWriter fw=new FileWriter(s);
		p.store(fw, "update the password");
	}

}
