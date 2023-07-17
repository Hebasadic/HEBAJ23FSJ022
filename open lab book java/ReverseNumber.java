
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 0;
		int reversenum = 0;
		Scanner sc = new Scanner (System.in);
		System.out.println("input your number:");
		
		num = sc.nextInt();
		
		
		do{
			reversenum = reversenum*10;
			reversenum = reversenum+ num%10;
			num = num/10;
	    }while(num != 0);
		System.out.println("reverse of input number is:"+ reversenum);
		
		sc.close();
		
	}
}
