package Cincai;

import java.util.Scanner;

public class tester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int height,weight;
		
		String name1;
		name1="ali";
		int bmi_ali=100/45;
		System.out.print("bmi =" + bmi_ali);
		
		printBmi("ali",100,45);
		printBmi("Ahmeng",200,50);
		
		System.out.print("\n"+calBmi(100,45));
		
		
	}
	
	public static void printBmi(String name,int height,int weight) {
		int bmi=height/weight;
		System.out.printf("\n%s bmi = %d",name,bmi);
	}
	
	public static int calBmi(int height,int weight) {
		int bmi;
		return bmi=height/weight;
	}
}
