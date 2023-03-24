
package L7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class PS3Q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teams : ");
        int N = sc.nextInt();
        int[]compare=new int[N];
        String[] name= new String[N];
        int[]score = new int[N];
        for(int i =0; i <N; i ++){
            System.out.printf("Enter team %d name : \n",i+1);
            name[i] = sc.next();
            System.out.printf("Enter team %d score : \n",i+1);
            score[i] = sc.nextInt();
            compare[i]=i;
        }
//        int maxIndex=0;
        for(int pass=1;pass<name.length;pass ++){
        for(int i =0; i <name.length-1;i ++){
            if(score[compare[i]]<score[compare[i+1]]){
             int temp =compare[i];
            compare[i]=compare[i+1];
            compare[i+1]=temp;
            }
        }
        
        }for(int i =0; i <name.length; i ++){
        System.out.printf("List of teams from highest score: %s (%d) |",name[compare[i]],score[compare[i]]);
    }
    }
}
