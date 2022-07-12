package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputDataStreamExample1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String s="E:\\Java\\TextExample.txt";
		FileInputStream fis=new FileInputStream(s);
		 int i=0;    
         while((i=fis.read())!=-1){    
          System.out.print((char)i);    
         }   
		fis.close();

	}

}
