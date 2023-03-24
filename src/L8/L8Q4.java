package L8;

import java.util.Scanner;

public class L8Q4 {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numerator and denominator : ");
		int numerator=sc.nextInt();
		int denominator=sc.nextInt();
		new Fraction(numerator,denominator).Display();
	}
}

class Fraction{
	private int numerator;
	private int denominator;
	
	Fraction(int numerator, int denominator) {
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public int getNumerator() {
		return this.numerator;
	}
	
	public int getDenominator() {
		return this.denominator;
	}
	
	public int GCD(int numerator,int denominator) {
		if (denominator == 0) return numerator;
        return GCD(denominator, numerator % denominator);
	}

	public void Display() {
		int gcd=GCD(numerator,denominator);
		System.out.printf("Simplest Fraction = %d/%d",(numerator/gcd),(denominator/gcd));
	}
	
}
