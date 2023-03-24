package L2;
import java.util.Scanner;
public class L2Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double P,D,R,Y,M;
		System.out.print("Enter the price of car,down payment,interest rate in %,loan duration in year");
		P=sc.nextDouble();
		D=sc.nextDouble();
		R=sc.nextDouble();
		Y=sc.nextDouble();
		M = (P-D)*(1 + R*Y/100) / (Y *12);
		System.out.format("Monthly payment = %.2f", M);
	}

}
