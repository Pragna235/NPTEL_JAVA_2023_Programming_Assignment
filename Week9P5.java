/*Complete the code to develop a BASIC CALCULATOR that can perform operations like Addition, Subtraction, Multiplication and Division.

Note the following points carefully:
1. Use only double datatype to store calculated numeric values.
2. Assume input to be of integer datatype.
3. The output should be rounded using Math.round() method.
4. Take care of the spaces during formatting output (e.g., single space each before and after =).
5. The calculator should be able to perform required operations on a minimum of two operands as shown in the below example:

Input:
                       5+6 

Output:
                       5+6 = 11*/
import java.util.Scanner;
public class Question91{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6
// Declare and initialize the required variable(s)
		int i=0;
		int j=0;
		double output=0;
		// Split the input string into character array
		char seq[] = input.toCharArray();
		/*
		Use some method to separate the two operands
		and then perform the required operation.
		*/
		for(int a=0; a<seq.length; a++){
			if(seq[a]=='+'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i+j;
			}else if(seq[a]=='-'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i-j;
			}else if(seq[a]=='/'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i/j;
			}else if(seq[a]=='*'){
				i= Integer.parseInt(input.substring(0,a));
				j= Integer.parseInt(input.substring(a+1,seq.length));
				output = (double)i*j;
			}
		}
		// Print the output as stated in the question
		System.out.print(input+" = " + Math.round(output));
}
}
