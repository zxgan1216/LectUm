package L7;

import java.util.ArrayList;
import java.util.Scanner;

public class PS3Q2a {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of teams : ");
        int N = sc.nextInt();
        String[][] nameScore = new String[N][2];
        for (int i = 0; i < N; i++) {
            System.out.printf("Enter team %d name : \n", i+1);
            nameScore[i][0] = sc.next();

            System.out.printf("Enter team %d score : \n", i+1);
            nameScore[i][1] = sc.next();

        }
        String[][] temp = new String[1][2];
        for (int pass = 1; pass < N; pass++) {
            for (int i = 0; i < N-1; i++) {
                if (Integer.parseInt(nameScore[i][1]) < Integer.parseInt(nameScore[i + 1][1])) {
                    temp[0][0] = nameScore[i][0];
                    temp[0][1] = nameScore[i][1];

                    nameScore[i][0] = nameScore[i+1][0];
                    nameScore[i][1] = nameScore[i+1][1];

                    nameScore[i+1][0] = temp[0][0];
                    nameScore[i+1][1] = temp[0][1];

                }
            }
        }System.out.println("List of teams with higher score first : ");
        for (int i = 0; i < N; i++) {
            System.out.printf("%s ( %s ) |\n", nameScore[i][0], nameScore[i][1]);
        }
    }
}
