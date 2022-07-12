package propertyHandling;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyNameMethod {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="C:\\Users\\SUBHA DAS\\eclipse-workspace\\JavaTraining\\PropertyFile\\LoginFiles.properties";
		FileReader f=new FileReader(s);
		Properties p=new Properties();
		p.load(f);
		Enumeration e=p.propertyNames();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
			
		}
		
		


	}

}
