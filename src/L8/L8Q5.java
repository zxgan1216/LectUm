package L8;

import java.util.Random;

public class L8Q5 {
	public static void main(String [] args) {
		new Game("Ali","Ahmad").diceGame();
	}
}

class Game{
	String name1;
	String name2;
	
	Game(String name1,String name2){
		this.name1=name1;
		this.name2=name2;
	}
	
	public void diceGame() {
		int num1=0;
		int num2=0;
		int total1=0;
		int total2=0;
		Random rnd=new Random();
		
		for (num1=rnd.nextInt(1,7),num2=rnd.nextInt(1,7);total1<100&&total2<100;num1=rnd.nextInt(1,7),num2=rnd.nextInt(1,7)) {
			System.out.printf("%spoints: %d \n%s points : %d",name1,num1,name2,num2);
			total1+=num1;
			total2+=num2;
			System.out.printf("\n%s total points: %d \n%s total points : %d\n\n",name1,total1,name2,total2);
		}
		
		if(total1>total2) System.out.printf("\n%s win",name1);
		else if (total1<total2) System.out.printf("\n%s win",name2);
		else System.out.print("Draw");
	}
}