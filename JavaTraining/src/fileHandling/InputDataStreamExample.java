package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDataStreamExample {
	public static void main(String[] args) throws IOException {
		String s="E:\\Java\\TextExample.txt";
		FileInputStream fis=new FileInputStream(s);
		int i=fis.read();
		System.out.println((char)i);
		fis.close();
		
	}

}
