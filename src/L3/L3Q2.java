package L3;
import java.util.Random;
public class L3Q2 {
	public static void main(String[] args) {
		Random r=new Random();
		int num=rRange(0,5);
		if (num==0) {
			System.out.print(num + " is zero");
		}
		else if (num==1) {
			System.out.print(num + " is one");
		}
		else if (num==2) {
			System.out.print(num + " is two");
		}
		else if (num==3) {
			System.out.print(num + " is three");
		}
		else if (num==4) {
			System.out.print(num + " is four");
		}
		else if (num==5) {
			System.out.print(num + " is five");
		}
	}
	
	
	public static int rRange(int start, int finish) {
		return (start + new Random().nextInt(finish + 1 - start));
	}
}
