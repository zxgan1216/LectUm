package L7;
import java.io.*;
public class L7Q3_2 {
	 public static void main(String[] args) {
	        String line = "";
	        try{
	            BufferedReader fileInitial = new BufferedReader (new FileReader("./src/L7/Integer.txt"));
	            PrintWriter fileFinal = new PrintWriter(new FileOutputStream("./src/L7/reverse.txt"));

	            line = fileInitial.readLine();

	            while(line!=null){
	                for(int i = line.length()-1 ; i>=0 ;i-- ){
	                    fileFinal.print(line.charAt(i));
	                }
	                fileFinal.println();
	                line = fileInitial.readLine();
	                System.out.println(line);
	            }
	           fileInitial.close();
	            fileFinal.close();
	        }catch(IOException e){
	            System.out.println(e);
	        }
	        
	        
	        writeFile();
	        
	    }
	 static void writeFile() {
		 try {
			 File file=new File("reverse.txt");
				
				if(!file.exists()) {
					file.createNewFile();
					
					//create a file
				}
//		 PrintWriter output = new PrintWriter(new FileOutputStream("./src/L7/reverse.txt"));
//		 output.println("222");
		 }
		 catch (IOException e) {
			 System.out.println(e);
		 }
	 }

}
