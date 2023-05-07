//Complete the code segment to check whether the number is an Armstrong number or not.

//Armstrong Number:

//A positive number is called an Armstrong number if it is equal to the sum of cubes of its digits for example 153 = 13+53+33, 370, 371, 407, etc.

import java.util.Scanner;
public class Exercise1_4 {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
           int result=0;
//Use while loop check the number is Armstrong or not.
//store the output(1 or 0) in result variable.
int sum=0;
int m=n;
int d;
while(m!=0)
{
  d=m%10;
  sum+=d*d*d;
  m/=10;
}
if(sum == n )
  result=1;
else
  result=0;
System.out.print(result);
 }
}
