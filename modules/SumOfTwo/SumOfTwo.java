import java.util.*;

public class SumOfTwo {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		System.out.print("Enter Number 01: ");
		number1 = scan.nextInt();
		System.out.print("Enter Number 02: ");
		number2 = scan.nextInt();
		int sum = number1 + number2;
		System.out.println("Sum of two numbers is: " + sum);
	}
}
