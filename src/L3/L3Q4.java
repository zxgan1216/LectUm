package L3;
import java.util.Random;
//without GUI
public class L3Q4 {
	public static void main(String[] args) {
		Random rRange=new Random();
		System.out.println("The game starts");
		String n1="Player 1";
		String n2="Player 1";
		int x1=rRange.nextInt(1,7);
		int x2=rRange.nextInt(1,7);
		int x3=rRange.nextInt(1,7);
		int x4=rRange.nextInt(1,7);
		
		System.out.println(n1+"is rolling the dice.\nThe first dice is "+x1+" and the second dice is "+x2+".\nThe total is " +(x1+x2));
		System.out.println(n2+"is rolling the dice.\nThe first dice is "+x3+" and the second dice is "+x4+".\nThe total is " +(x3+x4));
		int z= (x1+x2)-(x3+x4);
		
		if(z>0) {
			System.out.println(n1+" wins");
		}
		else if(z<0) {
			System.out.println(n2+" wins");
		}
		else {
			System.out.println("draw");
		}
	}
}
