package Cincai;
import java.util.Scanner;

public class Seven_Nov_Cincai{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String grade = null;
		System.out.print("Enter your mark:");
		int mark=sc.nextInt();
		while (mark<0||mark>101){
			System.out.println("Invalid mark");
			System.out.print("Enter your mark:");
			mark=sc.nextInt();
		}
		if (mark>=80) {
			grade="A";
		}
		else if (mark>=75) {
			grade="A-";
		}
		else if (mark>=70) {
			grade="B+";
		}
		else if (mark>=80) {
			grade="A";
		}
		System.out.print("Your grade is" + grade);
	}

}
