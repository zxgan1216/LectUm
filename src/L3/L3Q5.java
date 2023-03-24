package L3;
import java.util.Scanner;
public class L3Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of A");
		double a=sc.nextDouble();
		System.out.print("Enter the value of B");
		double b=sc.nextDouble();
		System.out.print("Enter the value of C");
		double c=sc.nextDouble();
		System.out.print("Enter the value of D");
		double d=sc.nextDouble();
		System.out.print("Enter the value of E");
		double e=sc.nextDouble();
		System.out.print("Enter the value of F");
		double f=sc.nextDouble();
		
		double x=(e*d-b*f)/(a*d-b*c),y=(a*f-e*c)/(a*d-b*c);
		if ((a*d-b*c)==0) {
			System.out.print("This equation has no solution.");
		}
		else {
			System.out.print("The value of x is "+x+". The value of y is "+y+".");
		}
	}
}
