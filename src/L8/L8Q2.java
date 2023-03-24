package L8;

//ask static
public class L8Q2 {
	public static void main(String[] args) {
		BankAccount bank=new BankAccount("Gan Zi Xiang",031216,100000);
		bank.deposit(100000);
		bank.withdraw(1);
		bank.display();
	}
}

class BankAccount{
	public String name;
	public int ic;
	public double deposit;
	public double balance;
	public double withdraw;
	
	BankAccount(String name,int ic,double deposit){
		this.name=name;
		this.ic=ic;
		this.deposit=deposit;
	}
	
	public void deposit(int deposit) {
		balance+=deposit;
	}
	
	public void withdraw(int withdraw) {
		balance-=withdraw;
	}
	
	public void display() {
		System.out.printf("Name :%s IC :%d Current Balance :%.2f",name,ic,balance);
	}
}
