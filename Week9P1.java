/*Write suitable code to develop a 2D Flip-Flop Array with dimension 5 × 5, which replaces all input elements with values 0 by 1 and 1 by 0. An example is shown below:

INPUT:
               00001
               00001
               00001
               00001
               00001

OUTPUT:

               11110
               11110
               11110
               11110
               11110

Note the following points carefully:
1. Here, the input must contain only 0 and 1.

2. The input and output array size must be of dimension 5 × 5.
3. Flip-Flop: If 0 then 1 and vice-versa.*/
import java.util.Scanner;
public class Question95{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
// Declare the 5X5 2D array to store the input
		char original[][]= new char[5][5];
		
		// Input 2D Array using Scanner Class and check data validity
		for(int line=0;line<5; line++){
			String input = sc.nextLine();
			char seq[] = input.toCharArray();
			if(seq.length==5){
				for(int i=0;i<5;i++){
					if(seq[i]=='0' || seq[i]=='1'){
						original[line][i]=seq[i];
						if(line==4 && i==4)
							flipflop(original);
					}
					else{
						System.out.print("Only 0 and 1 supported.");
						break;
					}
				}
			}else{
				System.out.print("Invalid length");
				break;
			}

		}
	}
	static void flipflop(char[][] flip){
		// Flip-Flop Operation
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				if(flip[i][j]=='1')
					flip[i][j]='0';
				else
					flip[i][j]='1';
			}
		}
	
		// Output the 2D FlipFlopped Array
		for(int i=0; i<5;i++){
			for(int j=0; j<5;j++){		
				System.out.print(flip[i][j]);
			}
			System.out.println();
		}
} // The main() ends here
} // The main class ends here
