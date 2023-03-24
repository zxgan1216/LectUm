/*Less than or equal to 5 2.80
Greater than 5 and less than or equal to 20 5.20
Greater than 20 and less than or equal to 50 7.00
Greater than 50 8.60
A toString method that returns the sender, recipient, the weight of package in
kilogram and total shipping cost.*/
package L8;
public class Delivery {
      protected String sender;
    protected String recipient;
    protected double weight;
    
    public Delivery(String sender,String recipient,double weight){
        this.sender=sender;
        this.recipient=recipient;
        this.weight=weight;
    }
    
    public double totalCost(){
        double cost = 0.0;
        if (weight <= 5) {
            cost = weight * 2.80;
        } else if (weight > 5 && weight <= 20) {
            cost = (5 * 2.80) + ((weight - 5) * 5.20);
        } else if (weight > 20 && weight <= 50) {
            cost = (5 * 2.80) + (15 * 5.20) + ((weight - 20) * 7.00);
        } else if (weight > 50) {
            cost = (5 * 2.80) + (15 * 5.20) + (30 * 7.00) + ((weight - 50) * 8.60);
        }
        return cost;
    } 
    
    @Override
    public String toString(){
        return "From: " + sender + " to: "+ recipient+"\n"+
               "Weight of package: " + weight + " kg\n"+
               "Shipping costt: RM" + totalCost()+"\n";
    }
    
    
}
