package fileHandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("Subha111.txt");
		if(f.createNewFile()) {
			System.out.println("new file created");
		}else {
			System.out.println("file already exists");
		}
		

	}

}
