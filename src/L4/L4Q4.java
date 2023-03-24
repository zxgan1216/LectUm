package L4;
import java.util.Scanner;
public class L4Q4 {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the year :");
		int year=sc.nextInt();
		
		System.out.print("Enter the first day of the year(0 for Sunday, 1 for Monday, … , 6 for Saturday) :");
		int day1=sc.nextInt();
		
		int day_M=0;
		for (int m=0;m<=12;m++) {
			switch (m) {
			case 1->{
				day_M=31;
				System.out.println("January = "+day_M);
			}
			
			case 2->{
				if (year%4==0&&year%100==0||year%400==0) {
					day_M=29;
				}
				else {
					day_M=28;
				}
				System.out.println("Febuary = "+day_M);
			}
			
			case 3->{
				day_M=31;
				System.out.println("March = "+day_M);
			}
			
			case 4->{
				day_M=30;
				System.out.println("April=" + day_M);
			}
			case 5->{
				day_M=31;
				System.out.println("May = "+day_M);
			}
			case 6->{
				day_M=30;
				System.out.println("June = "+day_M);
			}
			case 7->{
				day_M=31;
				System.out.println("July = "+day_M);
			}
			case 8->{
				day_M=31;
				System.out.println("August = "+day_M);
			}
			case 9->{
				day_M=30;
				System.out.println("September = "+day_M);
			}
			case 10->{
				day_M=31;
				System.out.println("October = "+day_M);
			}
			case 11->{
				day_M=30;
				System.out.println("November = "+day_M);
			}
			case 12->{
				day_M=31;
				System.out.print("December = "+day_M);
			}
			}
			
			for (m=0;m <=12;m++) {
				System.out.println("-----------------------------");
                System.out.println(" Sun Mon Tue Wed Thu Fri Sat ");
                
                for (int i=1;i<=day1;i++) {
					System.out.print("    ");
				}
                
				for (int i=1;i<=day_M;i++) {
					if (i<10) { //after 10 got two digit
						System.out.print("   "+i);
					}
					else {
						System.out.print("  "+i);
					}
					if ((i+day1)%7==0) {
						System.out.println("");
					}
			}
				System.out.println("");
			}
		}
		sc.close();
	}
}
