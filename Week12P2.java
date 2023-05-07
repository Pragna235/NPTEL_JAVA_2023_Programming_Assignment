/*A partial code fragment is given. The URL class object is created in try block.You should write appropriate method( )  to print the protocol name and host name from the given url string.
For example:


https://www.xyz.com:1080/index.htm

 

protocol://host:port/filename*/
import java.net.*;  
public class Question2{  
   public static void main(String[] args){
try{  
     URL url=new URL("http://www.Nptel.com/java-tutorial");  
      
//use appropriate code to print the protocol name and host name from url 
    
     System.out.println("Protocol: "+url.getProtocol());  
     System.out.println("Host Name: "+url.getHost());  
   
      }
       catch(Exception e){System.out.println(e);}  
   }  
}
