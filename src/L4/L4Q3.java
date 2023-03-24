package L4;
import java.util.Scanner;
public class L4Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int sum=0,n=0,max=-99999999,min=999999999;
		double sum_sq=0;
		System.out.print("Enter a score[negative score to quit]: ");
		for (int score=sc.nextInt();score>0;score=sc.nextInt()) {
			sum=sum+score;
			sum_sq=sum_sq+Math.pow(score, 2);
			n=n+1;
			if(score>max) {
				max=score;
			}
			
			if(score<min) {
				min=score;
			}
			System.out.print("Enter a score[negative score to quit]: ");
		}
		
		System.out.println(sum);
		System.out.println(sum_sq);
		System.out.println("Maximum score = "+ max);
		System.out.println("Minimum score = "+ min);
		System.out.println("Average score = "+ (sum/n));
		double sd=Math.sqrt((sum_sq-(Math.pow(sum, 2)/n))/(n-1));
		System.out.format("Standrad deviation = %.2f", sd);
		sc.close();
	}
}