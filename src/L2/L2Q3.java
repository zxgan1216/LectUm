package L2;
import java.util.Random;
public class L2Q3 {
	public static void main(String[] args) {
		int n1 = rRange(10,50);
		int n2 = rRange(10,50);
		int n3 = rRange(10,50);
		System.out.println(n1 + " "+ n2+ " "+ n3);
		int sum= n1+n2+n3;
		double avarage= sum/3;
		System.out.println("Sum=" + sum);
		System.out.format("Average= %.2f", avarage);
	}
	
	//create a method to generate a number in a range
	//start:min num, finish: max num
	public static int rRange(int start, int finish) {
		return (start + new Random().nextInt(finish + 1 - start));
		//need to plus 1 for max num ,(0<num<21) : num from 1 to 20
	}
}
