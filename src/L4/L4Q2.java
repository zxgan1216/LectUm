package L4;
import java.util.Scanner;
public class L4Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter a number :");
		int n=sc.nextInt(), sum=0, cum_sum=0;
		for (int i=0;i<=n;i++) {
			cum_sum+=i;
			sum+=cum_sum;
		}
		System.out.print(sum);
		sc.close();
	}
}
