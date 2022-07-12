package fileHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="E:\\Java\\Output1.txt";
		Reader r=new FileReader(s);
		int c=r.read();
		while(c!=-1) {
			System.out.print((char)c);
			c=r.read();
		}
		r.close();

		
	}

}
