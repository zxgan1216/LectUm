package L4;
import java.util.Random;
public class L4Q8 {
	public static void main(String[] args) {
		Random r=new Random();
		int n=r.nextInt(99);
		System.out.println(n);
		int num,count=0;
		boolean c=false;
		
		for(num=1; count<n; num++){ 
            for(int i =2; i<=num/2; i++){
                if(num%i==0){
                    c=true;;
                    break;
                }
            }
            if(!c&& num!=1){
                System.out.println(num+" ");
                count++;
            }
            c=false;
        }
	}
}
