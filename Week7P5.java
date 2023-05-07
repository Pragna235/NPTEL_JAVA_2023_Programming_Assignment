//Complete the code segment to catch the exception in the following, if any. On the occurrence of such an exception, your program should print “Please enter valid data” .If there is no such exception, it will print the "square of the number".
import java.io.*;  
public class Question2{  
public static void main(String args[]){ 
try {  
   InputStreamReader r=new InputStreamReader(System.in);  
   BufferedReader br=new BufferedReader(r);  
   String number=br.readLine();  
   int x = Integer.parseInt(number);
   System.out.println(x*x);
    }
   catch (Exception e){
       System.out.println("Please enter valid data");
    }
}  
}
