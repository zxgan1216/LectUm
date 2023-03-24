package L4;
import java.util.Scanner;
public class L4Q7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter principal amount = ");
		int p=sc.nextInt();
		System.out.print("Enter ineterst in % = ");
		int i=sc.nextInt();
		System.out.print("Enter total number of month(s) = ");
		int N=sc.nextInt();
		double s=0;
		
		System.out.printf("%-5s%21s%15s%14s%20s%20s\n","Month","Monthly Payment","Principal","Interest","Unpaid balance","Total inetrest");
		
		for (int c=1;c<=N;c++) {
			System.out.printf("%-5s", c);
			
			double M= (p*i/(12*100.0))/(1-Math.pow((1+(i/(12*100.0))),-N));
			System.out.printf("%21.2f", M);
			
			double c_n=M*Math.pow(1+(i/(12*100.0)), -(1+N-c));
			System.out.printf("%15.2f", c_n);
			
			double l=M-c_n;
			System.out.printf("%14.2f", l);
			
			double r_n=(l/(i/(12*100.0)))-c_n;
			System.out.printf("%20.2f", r_n);
			
			s+=l;
			System.out.printf("%20.2f", s);
			
			System.out.println("");
			
		}
		sc.close();
	}
}
