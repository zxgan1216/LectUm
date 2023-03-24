package L6;

import java.util.Scanner;

public class L6Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n=sc.nextInt();
		for (int i=1;i<=n;i++) {
			System.out.println(Triangular(i));
		}
		sc.close();
	}
	
	static int Triangular(int n) {
		return (n*(n+1))/2;
	}

}
