package Cincai;
public class Sir_Madam {
	public static void main(String[] args)  
    {  
        final int size = 8;  
        final String msg = "Zi Xiang Love Simyi";  
  
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 4 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));  
   
                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                    System.out.print('*');  
                } else {  
                    System.out.print(' ');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
  
        for (int m = 1; m <= 2 * size; m++) {  
            for (int n = 0; n < m; n++) {  
                System.out.print(' ');  
            }  
   
            for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
                if (m >= 2 && m <= 4) {  
                    int position = n - (4 * size - 2 * m - msg.length()) / 2;  
                    if (position < msg.length() && position >= 0) {  
                        if (m == 3) {  
                            System.out.print(msg.charAt(position));  
                        } else {  
                            System.out.print(' ');  
                        }  
                    }  
                    else {  
                        System.out.print('*');  
                    }  
                }  
                else {  
                    System.out.print('*');  
                }  
            }  
            System.out.print(System.lineSeparator());  
        }  
    }  
}
