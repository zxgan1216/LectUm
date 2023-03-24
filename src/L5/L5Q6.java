package L5;
import java.util.Scanner;
public class L5Q6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of row of Pascal Triangle to generate: ");
		int n=sc.nextInt();
		sc.close();
		
		int [][] triangle=new int [n][n];
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<=i;j++) {
				if(j==0||j==i){
					triangle[i][j]=1;
				}
				else {
					triangle[i][j]=triangle[i-1][j-1] + triangle[i-1][j];
				}
			}
		}
		
		System.out.println("The Pascal Triangle with "+n+" row(s)");
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				System.out.printf("%4d",triangle[i][j]);
			}
			System.out.println("");
		}
		
	}

}
