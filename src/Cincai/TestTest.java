package Cincai;
import java.util.Random;
import java.util.Scanner;
public class TestTest {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int num1=r.nextInt();
		System.out.print(num1);
		System.out.print("Guess the number:");
		int num2=sc.nextInt();
		while (num2!=num1) {
			System.out.print("Guess the number again:");
			num2=sc.nextInt();
		}
		System.out.print("Congratulations");
	}
}
