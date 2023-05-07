//In the following program, a thread class Question62 is created using the Runnable interface Complete the main() to create a thread object of the class Question62 and run the thread. It should print the output as given below.

 

//-----------------OUTPUT-------------------

//Welcome to Java Week 6 New Question.

//Main Thread has ended.

//-------------------------------------------------
public class Question62 implements Runnable {  
  
    @Override  
    public void run() {  
        System.out.print(Thread.currentThread().getName()+" has ended.");  
    }

public static void main(String[] args) {  
        Question62 ex = new Question62();  
        Thread t1= new Thread(ex);  
        t1.setName("Main Thread");
        t1.start();  
        System.out.println("Welcome to Java Week 6 New Question.");  
        t1.setName("Main Thread");
    }

}
