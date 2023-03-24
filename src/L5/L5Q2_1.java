package L5;

import java.util.Random;
import java.util.ArrayList;
//Array List = While elements can be added and removed from an ArrayList whenever you want.
public class L5Q2_1 {
	public static void main(String[] args) {
		Random r = new Random();
		ArrayList<Integer> RandomNum=new ArrayList<Integer>();
		for (int i=0;i<10;i++) {
			int num=r.nextInt(0,21);
			
			while (RandomNum.contains(num)) {
                num = (int) (Math.random() * 20);
            }
			
			/* Other way:
			 for(int num: numList){
                while(number == num) {
                    number = rand.nextInt(0, 21);
                }
            }
			 */
			
			RandomNum.add(num);
		}
		
		System.out.println(RandomNum);
	}

}
