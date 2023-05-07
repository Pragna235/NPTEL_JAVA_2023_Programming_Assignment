//Complete the code segment to call print() method of class Question by creating a method named ‘student()’.
// This is the main class Question
public class Question23{ 
    public static void main(String[] args) { 
		// Object of the main class is created
		Question23 q = new Question23();
		// Print method on object of Question class is called
		q.student();
    }
	
	// 'print()' method is defined in class Question
	void print(Question23 object){
		System.out.print("Well Done!");
	}

	// 'studentMethod()' method is defined in class Question23
	void student(){
	// Calling a method named 'print()' in class Question23
		print(this);
	}

}
