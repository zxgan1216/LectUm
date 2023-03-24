package L5;
import java.util.Random;
import java.util.Scanner;
public class L5Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n=sc.nextInt();
		int[] score=new int[n];
		Random r=new Random();
		for (int i=0;i<n;i++) {
			score[i]=r.nextInt(101);
		}
		
		int min=100;
		int max=0;
		int total=0;
		
		for (int i=0;i<n;i++) {
			System.out.println("Score = " + score[i]);
			min = Math.min(min, score[i]);
            max = Math.max(max, score[i]);
			total+=score[i];
		}
		
		System.out.println("Highest mark= "+max);
		System.out.println("Lowest mark= "+min);
		System.out.println("Average mark ="+ (total/n));
		
		sc.close();
	}
}
