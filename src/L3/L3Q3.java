package L3;
import java.util.Scanner;
public class L3Q3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sales,commision;
		do {
			System.out.print("Enter your sales volume");
			sales=sc.nextDouble();
			if(sales<0) {
				System.out.print("Enter your sales volume");
			}
		}while (sales<0);
		
		if(sales<=100){
			commision=0.05;
		}	
		else if(sales>100 && sales<=500){
			commision=0.075;
		}	
		else if(sales>500&&sales<=1000){
			commision=0.1;
		}	
		else {
			commision=0.125;
		}	
		System.out.print("Your commision is =" + sales*commision);
	}

}
