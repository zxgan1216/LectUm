package L8;

import java.util.Arrays;
import java.util.Random;

public class L8Q1 {
	public static void main(String[] arsg) {
		Number a =new Number();
		Number b =new Number(5);
		Number c =new Number(4,50);
		
		a.Display();
		a.DisplayEven();
		a.DisplayPrime();
		a.printMax();
		a.printMin();
		a.printAverage();
		a.square();
		a.printSpace();
		
		b.Display();
		b.DisplayEven();
		b.DisplayPrime();
		b.printMax();
		b.printMin();
		b.printAverage();
		b.square();
		b.printSpace();
		
		c.Display();
		c.DisplayEven();
		c.DisplayPrime();
		c.printMax();
		c.printMin();
		c.printAverage();
		c.square();
		c.printSpace();
	}
}

class Number{
	public static Random rng=new Random();
	private int[] num;
	int freq,bound;
	
	public Number() {
		num=new Random().ints(10,0,100).toArray();
	}
	
	public Number(int freq) {
		num=new Random().ints(freq,0,100).toArray();
	}
	
	public Number(int freq,int bound) {
		num=new Random().ints(freq,0,bound).toArray();
	}
	
	public void Display() {
		System.out.println(Arrays.toString(num));
	}
	
	public void DisplayEven() {
		for (int i=0;i<num.length;i++) {
			if (num[i]%2==0) {
				System.out.println("Even Number : "+num[i]);
			}
		}
	}
	
	public void DisplayPrime() {
		boolean prime=false;
		for (int i=0;i<num.length;i++) {
			if(num[i]==0||num[i]==1) {
				prime=false;
			}
			for (int j=2;j<num[i]/2;j++) {
				if(num[i]%j==0) {
					prime=false;
					break;
				}
			}
			
			 if(prime){
	                System.out.println("Prime number : " + num[i] + " ");
	            }
		}
	}
	
	public void printMax() {
		int max=num[0];
		for (int i =1;i<num.length;i++) {
			if(max<num[i]) max=num[i];
		}
		
		System.out.println("Max Num : "+max);
	}
	
	public void printMin() {
		int min=num[0];
		for (int i =1;i<num.length;i++) {
			if(min>num[i]) min=num[i];
		}
		
		System.out.println("Max Num : "+min);
	}
	
	public void printAverage() {
		int total=0;
		for (int i=0;i<num.length;i++) {
			total+=num[i];
		}
		System.out.printf("Average : %d\n",(total/num.length));
	}
	
	public void square() {
		for (int i=0;i<num.length;i++) {
			System.out.printf("Square of %d is %d\n",num[i],(num[i]*num[i]));
		}
	}
	
	public void printSpace() {
		System.out.println("");
	}
}
