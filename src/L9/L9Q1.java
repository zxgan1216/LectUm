package L9;

import java.util.Scanner;

public class L9Q1 {
	public static void main(String [] args) {
		new Rectangular("Reactangular");
		new square("Square");
		new circle("Circle");
	}
}

class shape{
	Scanner sc=new Scanner(System.in);
	String name;
	protected double area;
	protected double perimeter;
	
	shape (String n){
		this.name=n;
	}
	public void display() {
		System.out.printf("Name = %s Perimeter = %.2f Area = %.2f \n",this.name,this.perimeter,this.area);
	}
}

class Rectangular extends shape{
	private double length;
	private double width;
	
	Rectangular(String n) {
		super(n);
		System.out.println(this.name);
		System.out.print("Enter length : ");
		this.length=sc.nextDouble();
		System.out.print("Enter width : ");
		this.width=sc.nextDouble();
		this.perimeter=this.length*2+this.width*2;
		this.area=this.length*this.width;
		display();
	}
}

class square extends shape{
	private double side;
	square(String n) {
		super(n);
		System.out.println(this.name);
		System.out.print("Enter side length : ");
		this.side=sc.nextDouble();
		this.perimeter=side*4;
		this.area=side*side;
		display();
	}
}

class circle extends shape{
	private double diameter;
	circle(String n) {
		super(n);
		System.out.println(this.name);
		System.out.print("Enter diameter : ");
		this.diameter=sc.nextDouble();
		this.perimeter=Math.PI * this.diameter;
		this.area = Math.PI * Math.pow(this.diameter / 2, 2);
		display();
	}
}