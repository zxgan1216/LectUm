package L7;

public class tester {
	public static void main(String[] args) {
		ErrorData data = new ErrorData("A", "12345");
		data.sayHello();
	}
}

class Data extends Object {
	String name;
	String id;
	
	Data(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
	public void sayHello() {
		System.out.println("Hello! I'm Data");
	}
}

class ErrorData extends Data {
	ErrorData(String name, String id){
		super(name, id);
	}
	
	@Override
	public void sayHello() {
		System.out.println("Hello! I'm ErrorData");
	}
}