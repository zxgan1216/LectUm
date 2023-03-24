/*§ A totalCost method that returns the total shipping cost. The shipping cost is similar
to normal delivery, with extra charges of RM50 for weekend delivery. 
Besides, an extra 20% of the total shipping cost if the package is delivered at night.
§ A toString method that returns the weekend and nighttime delivery.
if weekend=true , */
package L8;

public class SpecialDelivery extends Delivery{
    protected boolean weekend;
    protected boolean nighttime;
    protected double weight;
    
    public SpecialDelivery(String sender,String recipient,double weight,boolean weekend,boolean nighttime){
        super(sender,recipient,weight);
        this.weekend=weekend;
        this.nighttime=nighttime;
    }

    @Override
    public String toString() {
        String delivery="";
        if(weekend==true)
            delivery+="Weekend delivery\n";
        if(nighttime==true)
            delivery+="Night time delivery\n";
        return super.toString()+delivery;
    }

    @Override
     public double totalCost() {
        double cost = super.totalCost();
        double temp;
        if (weekend==true) {
            cost += 50.0;
        }
        if (nighttime==true) {
            cost *= 1.20;
        }
        
        
        return cost;
    }
}
    
    
    
    
   
