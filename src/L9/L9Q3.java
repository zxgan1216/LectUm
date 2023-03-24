package L9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class L9Q3 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print("Enter your gender : ");
		String gender=sc.nextLine();
		System.out.print("Enter your date fo birth : ");
		String dob=sc.nextLine();
		Lecture lec=new Lecture(name,gender,dob,"/Users/zxgan/Downloads/Lab09/lecturer.txt");
		lec.display();
		sc.close();
	}
}

class Lecture extends personProfile{
	String [][] info=new String [4][6];
	protected String inputfile;
	ArrayList<Double> credit_hour=new ArrayList<>();
	
	Lecture(String n, String g, String dob,String inputfile) throws Exception {
		super(n, g, dob);
		// TODO Auto-generated constructor stub
		this.inputfile=inputfile;
		BufferedReader br=new BufferedReader(new FileReader(inputfile));
		String line=br.readLine();
		while (line!=null) {
			for (int i=0;i<4;i++) {
				for (int j=0;j<6;j++) {
					info[i][j]=line;
					line=br.readLine();
				}
			}
		}
		br.close();
	}
	
	public void compute() {
//		for (int i=0;i<4;i++) {
//			for (int j=0;j<6;j++) 
//			System.out.println(info[i][j]);
//		}
		for (int i=0;i<4;i++) {
			int num_stud=Integer.parseInt(info[i][5]);
			double hour=Integer.parseInt(info[i][4]);
			if (num_stud>=150) this.credit_hour.add(hour*3); 
			else if (num_stud>=100) this.credit_hour.add(hour*2); 
			else if (num_stud>=50) this.credit_hour.add(hour*1.5); 
			else this.credit_hour.add(hour);
		}
	}
	
	@Override
	public void display() {
		compute();
		super.display();
		for (int i=0;i<4;i++) {
			System.out.printf("Course code = %-10s Course name = %-40s Year = %-5s Session = %-3s Credit hour = %.2f Number of students = %-2s \n",this.info[i][0],this.info[i][1],this.info[i][2],this.info[i][3],this.credit_hour.get(i),this.info[i][5]);
		}
	}
	
}
