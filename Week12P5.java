/*Write a recursive function to print the sum of  first n odd integer numbers. The recursive function should have the prototype
 " int sum_odd_n(int n) ".

For example :

input : 5
output: 25 

input : 6
output : 36*/
import java.util.*;
public class Question5 { 
    static int sum_odd_n(int n){ 
          if(n==1)
              return 1;
           if (n <= 0) 
                return 0;
  int nce=n,sumit=0;
 
  if(nce==n)  
    {
  sumit=n*2-1;
 }

   return sumit+sum_odd_n(n-1);
   
}
   public static void main(String[] args) {  
      Scanner in=new Scanner(System.in);
      int count=in.nextInt();      
      int r=sum_odd_n(count);
      System.out.println(r); 	  
    }  
}
