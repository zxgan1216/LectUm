package L8;

public class tuto_class {
	public static void main(String [] args) {
//		print();
		print pr=new print();
		pr.hello();
		pr.hello1();
	}
	
	public static void print() {
		System.out.print("Hello world");
	}
}

class print{
	public void hello() {
		System.out.print("Hello world");
	}
	
	public void hello1() {
		System.out.print("Hello hell");
	}
}
