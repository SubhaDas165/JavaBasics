package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="E:\\Java\\Subha.txt";
		FileOutputStream fo=new FileOutputStream(s);
		String s1="File output example ";
		byte[] b=s1.getBytes();
		fo.write(b);
		System.out.println("Done");
		fo.close();
		

	}

}
