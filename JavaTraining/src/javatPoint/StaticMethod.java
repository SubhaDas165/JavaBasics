package javatPoint;

public class StaticMethod {
	 int rollno;  
     String name;  
     static String college = "ITS";   
     static void change(){  
     college = "BBDIT";  
     }    
     StaticMethod(int r, String n){  
     rollno = r;  
     name = n;  
     }  
     void display(){
    	 System.out.println(rollno+" "+name+" "+college);
    }  


}
