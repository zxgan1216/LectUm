package L7;

public class labTest2 {
	public static void main(String [] args) {
		double total=0;
		
		Delivery a=new Delivery("Ali","Ahmad",4.4);
		Delivery b=new Delivery("Ah Chong","Fatimah",63.1);
		SpecialDelivery c= new SpecialDelivery("FSKTM,UM","FK,UM",32.5,true,false);
		SpecialDelivery d= new SpecialDelivery("Ang","Liew",19,true,true);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(c.toString());
		System.out.println(d.toString());
		
		total+=a.totalCost();
		total+=b.totalCost();
		total+=c.totalCost();
		total+=d.totalCost();
		System.out.print("\nThe total shipping cost is Rm "+total);
	}
}

class Delivery{
	protected String sender;
	protected String recipients;
	protected double weight=0;
	
	Delivery(String sender,String recepients, double weight){
		this.sender=sender;
		this.recipients=recepients;
		this.weight=weight;
	}
	
	@Override
	public String toString() {
		return "From : " + sender + "To : " + recipients + "\n" + "Weight of pacakage : "+weight+" kg\n"+"Shipping cost : RM"+totalCost()+"\n";
	}
	
	public double totalCost() {
		if (weight<=5) return weight*2.8;
		else if (weight<=20) return (5*2.8)+(weight-5)*5.2;
		else if (weight<=50) return (5*2.8)+(15*5.2)+(weight-20)*7;
		else return (5*2.8)+(15*5.2)+(30*7)+(weight-50)*8.6;
	}
	
}

class SpecialDelivery extends Delivery{
	protected boolean night;
	protected boolean weekend;
	protected double weight;
	

	SpecialDelivery(String sender, String recepients, double weight,boolean weekend,boolean night) {
		super(sender, recepients, weight);
		this.night=night;
		this.weekend=weekend;
	}
	
	@Override
	public double totalCost() {
		double cost=super.totalCost();
		if (weekend) cost+=50;
		if (night)cost*=1.2;
		return cost;
	}
	
	@Override
	public String toString() {
		String delivery="";
        if(weekend==true) delivery+="weekend delivery\n";
        if(night==true) delivery+="Night time delivery\n";
        return super.toString()+delivery;
    }
} 
