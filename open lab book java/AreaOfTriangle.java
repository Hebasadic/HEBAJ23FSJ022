
import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String args[]) {
		Scanner Scanner = new Scanner(System.in);
		
		System.out.println("enter the width of the triangle;");
		double base = Scanner.nextDouble();
		
		System.out.println("enter the height of the triangle:");
		double height = Scanner.nextDouble();
		
		double area =(base*height)/2;
		System.out.println("Area of the triangle..:"+area);
	}

}
