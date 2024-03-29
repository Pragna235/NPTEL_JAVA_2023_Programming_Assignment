//The program in this assignment is attempted to print the following output: 

//-----------------OUTPUT-------------------
//This is small
//This is medium
//This is large
//This is extra-large
//-------------------------------------------------

//However, the code is intentionally injected with some bugs. Debug the code to execute the program successfully.
interface ExtraLarge{
	static String extra = "This is extra-large";
	void display();
}

class Large {
    public void Print() {
        System.out.println("This is large");
    }
}
 
class Medium extends Large {
    public void Print() {
        System.out.println("This is medium");
    	super.Print();  
    }
}
class Small extends Medium {
    public void Print() {
        System.out.println("This is small");
        super.Print();  
    }
}
class Question43 implements ExtraLarge{
    public static void main(String[] args) {
        Small s = new Small();
        s.Print();
		Question43 q = new Question43();
		q.display();
    }
	public void display(){
		System.out.println(extra);
	}
} 
