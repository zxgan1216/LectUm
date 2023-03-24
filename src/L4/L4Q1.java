package L4;
import java.util.Scanner;
public class L4Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number:");
		int n1=sc.nextInt();
		System.out.print("The factors are: ");
		for (int i=1;i<=n1;i++) {
			if(n1%i==0) {
				System.out.print(i + " ");
			}
		}
		sc.close();
	}
}
