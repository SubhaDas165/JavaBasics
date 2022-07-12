package javatPoint;

public class ParamConstructor {
  
	    int id;  
	    String name;  
	    ParamConstructor(int i,String n){  
	    id = i;  
	    name = n;  
	    }   
	    void display()
	    {
	    	System.out.println(id+" "+name);
	    }  	   
	    public static void main(String args[]){  	  
	    ParamConstructor s1 = new ParamConstructor(666,"Subha");  
	    ParamConstructor s2 = new ParamConstructor(554288,"Das");  
	    s1.display();  
	    s2.display();  
	   }  


}
