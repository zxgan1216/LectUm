package L4;
import java.util.Random;

import javax.swing.JOptionPane;
public class L4Q5 {
	public static void main(String[] args) {
		int sum_1=0;
		int sum_2=0;
		JOptionPane.showMessageDialog(null, "The Game begins!");
		while (sum_1<=100&&sum_2<=100) {
			sum_1=dice(sum_1);
			sum_2=dice(sum_2);
		}
		JOptionPane.showMessageDialog(null,"Sum of player 1 : "+sum_1 );
		JOptionPane.showMessageDialog(null,"Sum of player 2 : "+sum_2 );
		if (sum_1>sum_2) {
			JOptionPane.showMessageDialog(null,"Player 1 wins");
		}
		else {
			JOptionPane.showMessageDialog(null,"Player 2 wins");
		}
	}
	public static int rRange(int start, int finish) {
		return (start + new Random().nextInt(finish + 1 - start));
	}
	
	public static int dice(int sum) {
		int dice=rRange(0,6);
		System.out.println("DiceGame number: " + dice);
			sum+=dice;
		if (dice==6) {
			dice=rRange(0,6);
			sum+=dice;
		}
		return sum;
	}
}
