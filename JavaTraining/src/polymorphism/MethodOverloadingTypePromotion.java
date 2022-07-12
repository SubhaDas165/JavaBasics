package polymorphism;

public class MethodOverloadingTypePromotion {

	void sum(int a,long b)
	{
		System.out.println(a+b);
	}  
	void sum(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}  

	public static void main(String args[]){  
		MethodOverloadingTypePromotion obj=new MethodOverloadingTypePromotion();  
		obj.sum(52,845);
		obj.sum(270,841,824);  

	}  


}
