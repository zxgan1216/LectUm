package Cincai;
import java.util.Scanner;
import java.text.DecimalFormat;
public class L2Q7_2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("#.00");
	System.out.print("Enter the value in inches: ");
	double inches=sc.nextDouble();
	double meter=inches*2.54/100;
	System.out.print(inches +"inches="+ df.format(meter));
	        
	}

}
