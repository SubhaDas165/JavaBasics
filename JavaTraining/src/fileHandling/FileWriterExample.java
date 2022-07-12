package fileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="E:\\Java\\FileWriter.txt";
		
		FileWriter fw=new FileWriter(s);
		fw.write("This is the example of file writer");
		System.out.println("successful");
		fw.close();
		

	}

}
