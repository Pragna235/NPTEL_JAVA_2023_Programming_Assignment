import java.util.Scanner;
public class Exercise1_3 {
       public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int n=sc.nextInt();
	  int sum=0;
//Use for or while loop do the operation.
int i=0;
for(i=0;i<=2*n;i=i+2)
      {
if(i%3==0)
    sum+=i;
}
System.out.print(sum);
 }
}
