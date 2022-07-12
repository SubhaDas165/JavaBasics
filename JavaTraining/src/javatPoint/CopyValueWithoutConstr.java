package javatPoint;

public class CopyValueWithoutConstr {  
	    int id;  
	    String name;  
	    CopyValueWithoutConstr(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    CopyValueWithoutConstr()
	    {
	    	
	    }  
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }  
	   
	    public static void main(String args[]){  
	    CopyValueWithoutConstr cc1 = new CopyValueWithoutConstr(63552,"Dj");  
	    CopyValueWithoutConstr cc2= new CopyValueWithoutConstr();  
	    cc2.id=cc1.id;  
	    cc2.name=cc1.name;  
	    cc1.display();  
	    cc2.display();  
	   }  
 


}
