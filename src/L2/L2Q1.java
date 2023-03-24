package L2;
import java.util.Scanner;
public class L2Q1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter degree celcius");
		double fahrenheit=sc.nextDouble();
		double celcius = (fahrenheit-32)/1.8;
		System.out.format("Degree Celcius= %.2f", celcius);
	}

}
