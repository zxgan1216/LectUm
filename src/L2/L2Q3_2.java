package L2;
import java.util.Random;
public class L2Q3_2 {
	public static void main(String[] args) {
		int x1,x2,x3;
		int MAX;
		float sum,average;
		Random x=new Random();
		MAX=41;
		x1=10+x.nextInt(41);
		x2=10+x.nextInt(41);
		x3=10+x.nextInt(41);
		sum=x1+x2+x3;
		average=sum/3;
		System.out.printf("The three numbers are %d,%d,and %d.\n", x1, x2, x3);
		System.out.printf("The sum of the three numbers is%.2f ", sum);
		System.out.printf("\nThe average of the three numbers is%.2f ", average);
	}
}
