package L2;
import java.util.Scanner;
public class L2Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the numberof seconds:");
		int s=sc.nextInt();
		int h=s/3600;
		int m=s%3600/60;
		int s2 =s%3600%60;
		System.out.print(s+" seconds is "+h+" hours "+m+" minutes"+s2+" seconds");
	}
}
