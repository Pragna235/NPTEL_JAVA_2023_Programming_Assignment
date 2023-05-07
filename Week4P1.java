//Complete the code segment to execute the following program successfully. You should import the correct package(s) and/or class(s) to complete the code.
// Import of pre-defined package java.util and class Scanner
import java.util.Scanner;
// Import of pre-defined package java.lang and class System and all of its member
import static java.lang.System.*;
// Import linked list class
import java.util.LinkedList;
// main class Question is created
public class Question41{
  public static void main(String[] args) {
	// Scanner object is created
    Scanner scanner = new Scanner(System.in);
     // Read String input using scanner class
    String courseName = scanner.nextLine(); 
     // Print the scanned String
    out.println("Course: " + courseName); 

    LinkedList<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
  }
}
