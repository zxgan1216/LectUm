package L8;

import java.util.Scanner;

public class L8Q6 {
	public static void main(String[] args) {
		bugerStall buger1=new bugerStall();
		buger1.sold();
		bugerStall buger2=new bugerStall();
		buger2.sold();
		bugerStall buger3=new bugerStall();
		buger3.sold();
		
		System.out.printf("Sales for %s is %.2f",buger1.getID(),buger1.getDaily_sales());
		System.out.printf("\nSales for %s is %.2f",buger2.getID(),buger2.getDaily_sales());
		System.out.printf("\nSales for %s is %.2f",buger3.getID(),buger3.getDaily_sales());
		
		System.out.printf("\nTotal sales = %.2f",bugerStall.getTotal_sales()); //if static can directly call
	}
}

class bugerStall{
	Scanner sc=new Scanner (System.in);
	private String ID;
	private double daily_sales;
	private static double total_sales;
	
	bugerStall(){
		System.out.print("Enter ID:");
		this.ID=sc.nextLine();
		this.daily_sales=0;
	}
	
	public void sold() {
		System.out.print("Enter sales :");
		this.daily_sales=sc.nextDouble();
		total_sales+=daily_sales;
	}

	public String getID() {
		return ID;
	}

	public double getDaily_sales() {
		return daily_sales;
	}
	
	public static double getTotal_sales() {
		return total_sales;
	}
	
}