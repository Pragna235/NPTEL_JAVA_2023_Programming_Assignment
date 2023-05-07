//Complete the code segment to call the method  print() of class given class Printer to print the following.

//--------------------------------
//Hi! I am class SCHOOL
//Hi! I class STUDENT.
//--------------------------------

//NOTE: Don't provide any INPUT in Sample Test Cases
// This is the class named Printer
class Printer { 
    // This are the methods in class Printer
    public void print() { 
		System.out.println("Hi! I class SCHOOL."); 
    } 
    public void print(String s) { 
		System.out.println(s); 
    } 
} 

public class Question22{ 
    public static void main(String[] args) {    

// Create an object of class Printer

Printer p = new Printer();

// Call 'print()' methods for desired output

p.print();
p.print("Hi! I am class STUDENT");

    }
}
