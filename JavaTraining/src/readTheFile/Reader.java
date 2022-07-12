package readTheFile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br=null ;
		try {
			br=new BufferedReader(new FileReader("Subha.text"));
			String s;
			while((s=br.readLine())!=null) {
				System.out.println(s);
				
			}
			
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
