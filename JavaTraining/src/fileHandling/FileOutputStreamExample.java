package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fo=new FileOutputStream("E:\\Java\\Subha.txt");
		fo.write(65);
		System.out.println("Successful");
		fo.close();

	}

}
