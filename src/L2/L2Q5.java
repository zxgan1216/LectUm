package L2;
import java.util.Random;
public class L2Q5 {
	public static void main(String[] args) {
		int num = rRange(0,10000);
		System.out.println("The random number is "+num);
		int sum=0;
		while (num>0) {
			int digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println("The sum of the digit of the number is "+sum);
	}
	
	public static int rRange(int start, int finish) {
		return (start + new Random().nextInt(finish + 1 - start));
	}
}