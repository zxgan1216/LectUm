package L7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class L7Q6 {
	public static void main(String [] args) {
		try {
			Scanner sc=new Scanner(new FileInputStream("/Users/zxgan/eclipse-workspace/LectUm/src/L7/order.txt"));
			Scanner scanner=new Scanner(new FileInputStream("/Users/zxgan/eclipse-workspace/LectUm/src/L7/product.txt"));
			
			LinkedHashMap <String,String>  productName = new LinkedHashMap<>();
			LinkedHashMap <String,Double>  productPrice = new LinkedHashMap<>();
			LinkedHashMap <String,Integer>  orderQuantity = new LinkedHashMap<>();
			
			String line=scanner.nextLine();
			while(scanner.hasNextLine()) {
				String[] lineContent=line.split(",");
				productName.put(lineContent[0],lineContent[1]);
				productPrice.put(lineContent[0],Double.parseDouble(lineContent[2]));
				line=scanner.nextLine();
			}
			
			scanner.close();
			
			line=sc.nextLine();
			while(sc.hasNextLine()) {
				String[] lineContent=line.split(",");
				orderQuantity.put(lineContent[1],Integer.parseInt(lineContent[2]));
				line=sc.nextLine();
			}
			sc.close();
			
			System.out.printf("%-10s\t%-30s\t%-10s\t%-20s\t%-10s\n", "ProductID","ProductName","Qunatity","PricePerUnit","Total");
			for (String order:productName.keySet()) {
				double total = (orderQuantity.get(order))*(productPrice.get(order));
				System.out.printf("%-10s\t%-30s\t%-10d\t%-20f\t%-10f\n",order,productName.get(order),orderQuantity.get(order),productPrice.get(order),total);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
