package L8;

import java.util.Scanner;

public class L8Q3 {
	public static void main(String[] args) {
		WeightCalculator cal=new WeightCalculator();
		cal.input();
		cal.calRWeight();
		cal.display();
	}
}

class WeightCalculator{
	double height;
	int age;
	double r_weight;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your age and height :");
		age=sc.nextInt();
		height=sc.nextDouble();
		
	}
	
	public void calRWeight() {
		r_weight=(height-100+(age/10))*0.9;
	}
	
	public void display() {
		System.out.printf("Age : %d Height : %.2f Recommend weight : %.2f",age,height,r_weight);
	}
}
