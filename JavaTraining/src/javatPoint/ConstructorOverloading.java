package javatPoint;

public class ConstructorOverloading {
  
	    int id;  
	    String name;  
	    int age;  
 
	    ConstructorOverloading(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    
	    ConstructorOverloading(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name+" "+age);
	   	}  
	   
	    public static void main(String args[]){  
	    ConstructorOverloading c1l = new ConstructorOverloading(952,"Raam");  
	    ConstructorOverloading cl2 = new ConstructorOverloading(935,"Sham",1);  
	    c1l.display();  
	    cl2.display();  
	   }  
 
}
