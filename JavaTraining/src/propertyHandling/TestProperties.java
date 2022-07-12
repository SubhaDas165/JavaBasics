package propertyHandling;

import java.io.IOException;
import java.util.Scanner;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ProperyExample p=new ProperyExample();
		String un=p.getUsername();
		String pw=p.getPassword();
		String url=p.getUrl();
		System.out.println(un);
		System.out.println(pw);
		System.out.println(url);
	
	}

}
