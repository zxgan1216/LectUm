package L6;

import java.util.Scanner;

public class L6Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		do {
		System.out.print("Enter a number (enter -1 to quite)");
		num=sc.nextInt();
		System.out.print(isEmrip(num)+"\n");
		}while (num!=-1);
		
		int i=0;
		int count=0;
		System.out.println("\nFirst 20 palindromic prime and emirp");
		while (i<20) {
			if (isEmrip(count)==true) {
				System.out.print(count+" ");
				i++;
			}
			count++;
		}
		sc.close();
	}
	
	public static boolean isPrime(int num) {
		int counter=0;
		for (int i=2;i<num;i++) {
			if (num%i==0) {
				counter++;
			}
		}
		
		if (counter!=0) return false;
		else return true;
	}
	
	public static int reverse(int num) {
		int temp = 0;
		while (num>0){
			temp=(num%10)+(temp*10);
			num/=10;
		}
		return temp;
	}
	
	public static boolean isPalindromic(int num) {
		if (reverse(num)==num&&isPrime(num)) return true;
		else return false;
	}
	
	public static boolean isEmrip(int num) {
		if (isPrime(num)&&isPrime(reverse(num))&&!(isPalindromic(num))) return true;
		else return false;
	}
}
