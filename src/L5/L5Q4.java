package L5;

import java.util.Arrays;
import java.util.Scanner;

public class L5Q4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter 9 numbers");
		int[][] arrMatrix=new int[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				arrMatrix[i][j]=sc.nextInt();
			}
		}
			
		
		
		System.out.println(Arrays.deepToString(arrMatrix));
		
		for (int j=0;j<=2;j++) {
			for (int i=2;i>=0;i--) {
				System.out.print(arrMatrix[i][j] + " ");
			}
			System.out.println("");
		}
		sc.close();
	}

}