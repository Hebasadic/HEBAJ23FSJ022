
import java.util.Scanner;

public class FindTheAreaOfCircle {
	public static void main(String args[]) {
		java.util.Scanner Scanner = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		
		double radius = Scanner.nextDouble();
		double area = Math.PI* (radius*radius);
		System.out.println("the area od circle is; "+ area);
		double circumference =Math.PI* 2*radius;
		System.out.println("the circumference of the circle is :"+ circumference);
		
	}

}
