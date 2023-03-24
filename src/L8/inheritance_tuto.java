package L8;

public class inheritance_tuto {
	public static void main(String [] args) {
		worker wr=new worker("Gan",18,"Tangkak","Programmer");
		wr.print();
	}
}

class Person{
	protected String name;
	protected int age;
	protected String adress;
	
	Person(String name,int age,String adress){
		this.name=name;
		this.age=age;
		this.adress=adress;
	}
	
	public void print() {
		System.out.printf("Name = %s Age = %d Adress = %s",this.name,this.age,this.adress);
	}
}

class worker extends Person{
	
	protected String occupation;
	
	worker(String name, int age, String adress,String occupation) {
		super(name, age, adress);
		this.occupation=occupation;
	}
	
	@Override
	public void print() {
		super.print();
		System.out.printf(" Occupation = %s",this.occupation);
	}
	
}