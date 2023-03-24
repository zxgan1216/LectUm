package L7;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class L7Q2 {
	public static void main(String[] args) {
		try {
			URL u = new URL("http://www.fsktm.um.edu.my");
			URLConnection cnn = u.openConnection();
			InputStream stream = cnn.getInputStream();
			Scanner in = new Scanner(stream);
			PrintWriter writer =new PrintWriter("index.htm");
			
			while (in.hasNextLine()) {
				writer.print(in.nextLine());
			}
			in.close();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
