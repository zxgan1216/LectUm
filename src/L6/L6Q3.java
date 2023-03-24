package L6;

import java.util.Random;

public class L6Q3 {
	public static void main(String[] args) {
		Random rand=new Random();
		int [] num= new int [10];
		for (int i=0;i<num.length;i++) {
			num [i]=rand.nextInt(1000);
		}
		
		for (int i=0;i<num.length;i++) {
			int a=num[i];
			System.out.print("Original:");
			System.out.print(a);
			System.out.print("\nReversed:");
			reverse(a);
			System.out.println("\n");
		}
	}
	
	public static void reverse(int a) {
		int temp;
		while (a>0) {
			temp=a%10;
			a/=10;
			System.out.print(temp);
		}
	}
}
