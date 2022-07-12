package createFile;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;




public class Demo {
	public static void main(String[] args) {
		try {
			File  file =new File("Subha.text");
			if(!file.exists()) {
				file.createNewFile();
			}
			PrintWriter pw=new PrintWriter(file);
			pw.println("this is my content of text");
			pw.println(1000000);
			pw.close();
			System.out.println("Done");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
