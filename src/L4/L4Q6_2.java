package L4;

import java.util.Random;

public class L4Q6_2 {
	public static void main(String[] args) {
		Random r=new Random();
		int n=r.nextInt(Integer.MAX_VALUE); //generate positive use MAX_VALUE
		System.out.println(n);
		
		int n_devided=n,i=0;
		
		while(n_devided!=0) {
			n_devided/=10;
			i++;
		}
		
		System.out.println("The numbers of digit for "+ n + " is " + i);
	}
	

}
