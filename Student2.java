 
 import java.util.*;
 
  public class Student2 {
       public static void main (String[] args)
     {
       Scanner sc = new Scanner(System.in);
	   System.out.println("Enter a first no");
         int a =sc.nextInt();
		  System.out.println("Enter a second no");
         int b = sc.nextInt();
		   System.out.println("Enter Your choice (Addition press 1 , Substraction press 2 , Multipilcation press 3  , Division press 4 )");
         int c = sc.nextInt();
		 switch (c){
			 case 1:
			 System.out.println(a+b);
			 break;
			 case 2:
			 System.out.println(a-b);
			 break;
			 case 3:
			 System.out.println(a*b);
			 break;
			 case 4:
			 System.out.println(a/b);
			 break;
			
			 
		 }
		
		   
		   
		 
    
     
     }
    } 