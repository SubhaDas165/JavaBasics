package inheritance;

public class Test1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recctangle r=new Recctangle();
		Triangle t=new Triangle();
		r.setValue(8, 8);
		t.setValue(6, 8);
		System.out.println("Area of rectangle"+r.area());
		System.out.println("Area of triangle is"+t.area());

	}

}
