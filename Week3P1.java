//Define a class Point with two fields x and y each of type double. Also, define a method distance(Point p1, Point p2) to calculate the distance between points p1 and p2 and return the value in double.

//Complete the code segment given below. Use Math.sqrt( ) to calculate the square root.
import java.util.Scanner;

public class Circle extends Point{
	
public static void main(String[] args) {

	 Scanner sc = new Scanner(System.in);
	 Point p1=new Point();
	 p1.x=sc.nextDouble();
	 p1.y=sc.nextDouble();
	 Point p2=new Point();
	 p2.x=sc.nextDouble();
	 p2.y=sc.nextDouble(); 
	 Circle c1=new Circle();
	c1.distance(p1,p2);
	
  }

}

class Point{
  double x;
  double y;

public static void distance(Point p1,Point p2){
        double d;
	  d=Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y));
	  System.out.println(d);
  }	
}  
