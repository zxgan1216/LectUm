package L7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q3 {
	public static void main(String[] args) {
		Input();
		Reverse();
	}
	
	public static void Input() {
		try {
			Scanner sc=new Scanner(System.in);
			PrintWriter output = new PrintWriter("../LectUM/src/L7/original.txt");
			String text;
			do {
			System.out.print("Enter the text (enter exit to close):");
			text=sc.nextLine();
			output.print(text);
			}while(!text.equalsIgnoreCase("exit"));
			sc.close();
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Reverse() {
		try {
			Scanner input=new Scanner(new FileInputStream("../LectUM/src/L7/original.txt"));
			PrintWriter writer = new PrintWriter("../LectUM/src/L7/reverse.txt");
			
			while (input.hasNext()) {
				String reverse=input.nextLine();
				for (int i=reverse.length()-1;i>=0;i--) {
					writer.print(reverse.charAt(i));
				}
			}
			input.close();
			writer.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
