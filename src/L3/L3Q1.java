package L3;
import java.util.Scanner;
public class L3Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter two numbers :");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.print("Enter the operant :");
		char operand=sc.next().charAt(0);
		double result=0;
		
		if (operand =='+') {
			result=num1+num2;
		}
		else if (operand =='-') {
			result=num1-num2;
		}
		else if (operand=='*') {
			result=num1*num2;
		}
		else if (operand=='/') {
			result=num1/num2;
		}
		else {
			System.out.print("Invalid operand");
		}
		
		System.out.print("The result is " + result);
	}
}