package L7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class L7Q4 {
	public static void main(String[] args) {
		Output();
		int character=0,line=0,words=0;
		try {
			Scanner input=new Scanner(new FileInputStream("../LectUM/src/L7/text.txt"));
			
			while (input.hasNextLine()){
				String line1=input.nextLine();
				line++;
				character+=line1.length();
				words=line1.split(" ").length;
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		print("Line",line);
		print("Words",words);
		print("Cahracter",character);
		
	}
	
	public static void Output() {
		try {
			Scanner sc=new Scanner(System.in);
			PrintWriter writer=new PrintWriter("../LectUm/src/L7/text.txt");
			String text= " ";
			do {
			System.out.print("Enter your text :");
			text=sc.nextLine();
			writer.println(text);
			}while (!text.equalsIgnoreCase("exit"));
			writer.close();
			sc.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void print(String a,int n) {
		System.out.printf("%s : %d\n",a,n);
	}
}
