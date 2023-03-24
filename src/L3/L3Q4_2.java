package L3;
import java.util.Random;
import javax.swing.JOptionPane;
public class L3Q4_2 {
	public static void main(String [] args) {
		JOptionPane.showMessageDialog(null, "The Game begins!");
		Random rRange=new Random();
		String n1="Player 1";
		String n2="Player 2";
		int x1=rRange.nextInt(1,7);
		int x2=rRange.nextInt(1,7);
		int x3=rRange.nextInt(1,7);
		int x4=rRange.nextInt(1,7);
		
		JOptionPane.showMessageDialog(null, n1+" is rolling the dice\n\n");
		JOptionPane.showMessageDialog(null, "First dice = "+ x1+ "\nSecond dice = "+x2+"\nTotal point = "+(x1+x2));
		
		JOptionPane.showMessageDialog(null, n2+" is rolling the dice\n\n");
		JOptionPane.showMessageDialog(null, "First dice = "+ x3+ "\nSecond dice = "+x4+"\nTotal point = "+(x3+x4));
		
		int z= (x1+x2)-(x3+x4);
		
		if(z>0) {
			JOptionPane.showMessageDialog(null, n1+" wins");
		}
		else if(z<0) {
			JOptionPane.showMessageDialog(null, n2+" wins");
		}
		else {
			JOptionPane.showMessageDialog(null, "Draw");
		}
		
		
	}

}
