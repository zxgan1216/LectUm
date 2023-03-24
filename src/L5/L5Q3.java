package L5;

import java.util.Random;
import java.util.Scanner;

public class L5Q3 {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of employees :");
		int n=sc.nextInt();
		int sum=0;
		
		for (int i=0;i<n;i++) {
			System.out.println("\nWorker "+ (i+1));
			System.out.printf("%7s%7s%7s%7s%7s%7s%7s%20s\n", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun", "Total Work Hours");
			for (int s=0;s<7;s++) {
				int temp=r.nextInt(1,8);
				System.out.printf("%7s",temp);
				sum+=temp;
			}
			System.out.printf("%20s", sum);
		}
		sc.close();
	}

}
