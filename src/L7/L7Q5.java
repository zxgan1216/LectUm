package L7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;

public class L7Q5 {
	public static void main(String[] args) {
			ObjectInputStream inputStream;
			try {
				inputStream = new ObjectInputStream(new FileInputStream("/Users/zxgan/eclipse-workspace/LectUm/src/L7/person.dat"));
				int N=inputStream.readInt();
				
				LinkedHashMap <String,Integer> age=new LinkedHashMap<>();
				LinkedHashMap <String,Character> gender=new LinkedHashMap<>();
				
				String [] name=new String[N];
				
				for (int i=0;i<N;i++) {
					name[i]=inputStream.readUTF();
					
					age.put(name[i],inputStream.readInt());
					gender.put(name[i],inputStream.readChar());
				}
				
				Arrays.sort(name);
				
				for (String names:name) {
					System.out.printf("Name : %-20s Age : %-10d Gender : %-2s\n",names,age.get(names),gender.get(names));
				}
				
				inputStream.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
