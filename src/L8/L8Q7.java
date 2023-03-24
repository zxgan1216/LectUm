package L8;

import java.util.Scanner;

public class L8Q7 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("The amount : ");
		double amount=sc.nextDouble();
		money obj=new money(amount);
		do {
			System.out.println("Enter 1 to add, Enter to to subtract, Enter 3 to display, Enter four to exit : ");
			int n=sc.nextInt();
			switch(n) {
				case 1 ->{
					System.out.println("Enter amount to add");
					double add=sc.nextDouble();
					obj.add(add);
				}
				
				case 2 ->{
					System.out.println("Enter amount to subtract");
					double sub=sc.nextDouble();
					obj.sub(sub);
				}
				
				case 3 ->{
					obj.cal();
					obj.roundUp();
					obj.display();
				}
				
				case 4 -> System.exit(0);
				default -> System.out.println("Invalid choice!");
			}
		}while(true);
	}
}

class money{
	private int rm100;
	private int rm50;
	private int rm10;
	private int rm5;
	private int rm1;
	
	private int sen50;
	private int sen20;
	private int sen10;
	private int sen5;
	
	private int amount;
	
	money(double amount){
		this.amount=(int)(amount*100);
	}
	
	public void roundUp() {
		switch (this.amount%10) {
			case 1,6 ->this.amount+=1;
			case 2,7 -> this.amount -= 2;
			case 3,8 -> this.amount += 2;
			case 4,9 -> this.amount += 1;
		}
	}
	
	public void sub(double amt) {
		this.amount-=(int)(amt*100);
	}
	
	public void add(double amt) {
		this.amount+=(int)(amt*100);
	}
	
	public void cal() {
		int calcAmt = this.amount;
		this.rm100 = calcAmt /10000;
		calcAmt %= 10000;
		this.rm50 = calcAmt /5000;
		calcAmt %= 5000;
		this.rm10 = calcAmt /1000;
		calcAmt %= 1000;
		this.rm5 = calcAmt /500;
		calcAmt %= 500;
		this.rm1 = calcAmt /100;
		calcAmt %= 100;
		this.sen50 = calcAmt /50;
		calcAmt %= 50;
		this.sen20 = calcAmt /20;
		calcAmt %= 20;
		this.sen10 = calcAmt /10;
		calcAmt %= 10;
		this.sen5 = calcAmt /5;
	}
	
	 public void display(){
	        System.out.println("--------------------------------");
	        System.out.println("RM100:\t" + this.rm100);
	        System.out.println("RM50:\t" + this.rm50);
	        System.out.println("RM10:\t" + this.rm10);
	        System.out.println("RM5:\t" + this.rm5);
	        System.out.println("RM1:\t" + this.rm1);
	        System.out.println("50 sen:\t" + this.sen50);
	        System.out.println("20 sen:\t" + this.sen20);
	        System.out.println("10 sen:\t" + this.sen10);
	        System.out.println("5 sen:\t" + this.sen5);
	    }
	 
}