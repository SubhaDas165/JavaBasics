package javatPoint;

public class StaticBlock {
	int x;
	int y;
	public StaticBlock(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		System.out.println(this.x);
		System.out.println(this.y);
	}
	public void isMethod() {
		System.out.println("method is calling");
		
	}
	
	static {
		System.out.println("Static block is called........................");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticBlock sb=new StaticBlock(85, 82);
		sb.isMethod();
	

	}

}
