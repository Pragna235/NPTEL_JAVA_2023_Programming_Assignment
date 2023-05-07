//Complete the following code fragment to read three integer values from the keyboard and find the sum of the values. Declare a variable "sum" of type int and store the result in it.
import java.util.*;
        public class Question1{ 
        public static void main (String[] args){ 
	        
             int i,n=0,sum=0;
             Scanner inr = new Scanner(System.in);
		for (i=0;i<3;i++)
		{
		    n = inr.nextInt();
		    
  		sum =sum+n;
         	}
System.out.println(sum);
  }
}
