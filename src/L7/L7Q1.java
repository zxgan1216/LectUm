package L7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class L7Q1 {
	public static void main (String[] args) {
		try {
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("../LectUm/src/L7/coursemate.dat"));
			
			output.writeUTF("WXES1116");
			output.writeUTF("\nProgramming I");
			output.writeUTF("\nWXES1115");
			output.writeUTF("\nData Structure");
			output.writeUTF("\nWXES1110");
			output.writeUTF("\nOperating System");
			output.writeUTF("\nWXES1112");
			output.writeUTF("\nComputing Mathematics I");
			
			output.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			ObjectInputStream input= new ObjectInputStream(new FileInputStream("coursemate.dat"));
			Scanner sc=new Scanner(System.in);
			
			System.out.print("Enter a course code");
			String code=sc.next();
			
			while(true) {
				String code1=input.readUTF();
				
				if (code.equals(code1)) {
					System.out.print(input.readUTF());
				}
			}
		
		} 
		catch (EOFException e) {	
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}
