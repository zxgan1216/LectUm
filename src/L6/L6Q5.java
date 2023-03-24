package L6;

import java.util.Random;
import java.util.Scanner;

public class L6Q5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		int n3,points=0;
		
		do {
			int n1=rn.nextInt(0,13);
			int n2=rn.nextInt(0,13);
			System.out.println("Enter neagtive number to quit.");
			System.out.printf("%d x %d = ",n1,n2);
			n3=sc.nextInt();
			if(compareNumber(n1,n2,n3)) {
				points++;
			}
			
		}while (n3>=0);
		
		System.out.print("Your point is = "+points);
		
		sc.close();
		
	}
	
	public static boolean compareNumber(int n1,int n2,int n3) {
		return (n1*n2==n3);
	}
}
