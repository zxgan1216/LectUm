package L9;

import java.util.Random;
import java.util.Scanner;

public class L9Q4 {
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter player 1 name : ");
		String n1=sc.nextLine();
		System.out.print("Enter player 2 name : ");
		String n2=sc.nextLine();
		System.out.print("Game 1 start ");
		game2(n1,n2);
	}
	
	public void game1(String n1,String n2) {
		Game1 p1=new Game1(n1);
		Game1 p2=new Game1(n2);
		p1.game();
		p2.game();
		System.out.print("\nFinal result : \n");
		System.out.print(p1.getTotal_dice()>p2.getTotal_dice()? n1+ " wins":n2+" wins");
	}
	
	public static void game2(String n1,String n2) {
		Game2 p1=new Game2(n1);
		Game2 p2=new Game2(n2);
		p1.game();
		p2.game();
	}
}

class Dice{
	Random rn=new Random();
	protected String name;
	
	Dice(String n){
		this.name=n;
	}
	 public int rollDice() {
		 return rn.nextInt(1,7);
	 }
}

class Game1 extends Dice{
	private int dice1,dice2,dice3;
	private int total_dice=0;
	
	Game1(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void game() {
		System.out.println("\n\nGame start ");
		while(total_dice<100) {
			dice1=rollDice();
			dice2=rollDice();
			total_dice+=(dice1+dice2);
			System.out.printf("\nDice 1 =%d \nDice 2 =%d",dice1,dice2);
			if (dice1==dice2) {
				dice3=rollDice();
				total_dice+=dice3;
				System.out.printf("\nDice 3 = %d",dice3);
			}
			System.out.printf("\nTotal point = %d",total_dice);
		}
		System.out.printf("\nGame ends ,Player %s total point =%d",this.name,total_dice);
	}
	
	public int getTotal_dice() {
		return total_dice;
	}
}

class Game2 extends Dice{
	
	private int dice;
	private int total_dice=0;
	
	Game2(String n) {
		super(n);
		// TODO Auto-generated constructor stub
	}
	
	public void game() {
		System.out.println("\n\nGame start ");
		while(total_dice!=100) {
			dice=rollDice();
			total_dice+=dice;
			System.out.printf("\nDice = %d",dice);
			if (dice==6) {
				dice=rollDice();
				System.out.printf("\nDice = %d",dice);
				total_dice=(dice==6 ? total_dice:+dice);
				total_dice=deduce(total_dice,dice);
			}
			total_dice=deduce(total_dice,dice);
		}
		System.out.printf("\nGame ends ,Player %s total point =%d",this.name,total_dice);
	}
	
	public int deduce(int total,int num) {
		int deduce = (total>100)? total-num:total;
		return deduce;
		
	}
	
	public int getTotal_dice() {
		return total_dice;
	}
	
}