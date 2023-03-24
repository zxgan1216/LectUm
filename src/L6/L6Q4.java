package L6;

public class L6Q4 {
	public static void main (String[] args) {
		gcd(24,8);
		gcd(200,625);
		gcd(4,8);
	}
	
	public static void gcd(int a,int b) {
		int gcd=0;
		for(int i = 1 ; i<= a && i<=b ; i++){
            if(a%i == 0 && b%i ==0){
                gcd = i;
            }
        }
		System.out.println("GCD = " + gcd);
	}

}
