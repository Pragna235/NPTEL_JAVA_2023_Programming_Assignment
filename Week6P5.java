//Given a snippet of code, add necessary codes to print the following:


//-----------------OUTPUT-------------------

//Name of thread 't1':Thread-0

//Name of thread 't2':Thread-1

//New name of thread 't1':Week 6 Assignment Q5

//New name of thread 't2':Week 6 Assignment Q5 New

//-------------------------------------------------
public class Question65 extends Thread{  
  public void run(){  
      
  }  
 public static void main(String args[]){  
    Question65 t1=new Question65();  
    System.out.println("Name of thread 't1':"+ t1.getName());  

Question65 t2=new Question65();  
    System.out.println("Name of thread 't2':"+ t2.getName());

// start the thread-1  
  t1.start();  
// set the name of thread-1
  t1.setName("Week 6 Assignment Q5");  

// start the thread-2  
  t2.start();  
// set the name of thread-2
  t2.setName("Week 6 Assignment Q5 New");  

   System.out.println("New name of thread 't1':"+ t1.getName()); 
   System.out.println("New name of thread 't2':"+ t2.getName());
 
 }  
}
