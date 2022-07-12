package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="E:\\Java\\FileWriter.txt";
		FileReader fr=new FileReader(s);
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();

	}

}
