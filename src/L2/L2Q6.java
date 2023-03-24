package L2;
import java.util.Scanner;
public class L2Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double m,c1,c2,Q;
		System.out.print("Enter the amount of water in gram:");
		m=sc.nextDouble()/1000;
		System.out.print("Enter initial temperature in Fahrenheith:");
		c1=(sc.nextDouble()-32)/1.8;
		System.out.print("Enter final temperature in Fahrenheith:");
		c2=(sc.nextDouble()-32)/1.8;
		Q=m*(c2-c1)*4184;
		System.out.printf("The energy needed is %.6e",Q);
	}
}
