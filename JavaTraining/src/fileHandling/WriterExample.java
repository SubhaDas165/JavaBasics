package fileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="E:\\Java\\Output1.txt";
		Writer wr=new FileWriter(s);
		String s1="THis is the example of write";
		wr.write(s1);
		System.out.println("Successful");
		wr.close();

	}

}
