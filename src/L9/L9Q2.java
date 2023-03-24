package L9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class L9Q2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print("Enter your gender : ");
		String gender=sc.nextLine();
		System.out.print("Enter your date fo birth : ");
		String dob=sc.nextLine();
		Student stud=new Student(name,gender,dob,"/Users/zxgan/Downloads/Lab09/course.txt");
		stud.display();
		sc.close();
	}
	
}

class personProfile{
	protected String name;
	protected String gender;
	protected String dob;
	
	personProfile(String n,String g,String dob){
		this.name=n;
		this.gender=g;
		this.dob=dob;
	}
	
	public void display() {
		System.out.printf("Personal info \nName = %s Gender = %s Date of birth = %s\n",this.name,this.gender,this.dob);
	}
}

class Student extends personProfile{
	String [][] info=new String [5][5];
	protected String[] grade=new String[5];
	protected String inputFile;
	
	Student(String n, String g, String dob,String inputFile) {
		super(n, g, dob);
		this.inputFile=inputFile;
		try {
			BufferedReader br=new BufferedReader(new FileReader(inputFile));
			String line=br.readLine();
			if (line!=null) {
				for (int i=0;i<5;i++) {
					for (int j=0;j<5;j++) {
						this.info[i][j]=line;
						line=br.readLine();
					}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getGrade() {
		int mark;
		for (int i=0;i<5;i++) {
			mark=Integer.parseInt(this.info[i][4]);
			this.grade[i]=determineGrade(mark);
		}
	}
	
	public String determineGrade(int mark) {
		if (mark>=85) return "A";
		else if (mark>=75) return"A-";
		else if (mark>=70) return"B+";
		else if (mark>=65) return"B";
		else if (mark>=60) return"B-";
		else if (mark>=55) return"C+";
		else if (mark>=50) return"C";
		else if (mark>=45) return"D";
		else if (mark>=35) return"E";
		else return "F";
	}
	
	@Override
	public void display() {
		getGrade();
		super.display();
		for (int i=0;i<5;i++) {
			System.out.printf("Course code = %-10s Course name = %-40s Year = %-5s Session = %-3s Mark = %-5s Grade = %-2s \n",this.info[i][0],this.info[i][1],this.info[i][2],this.info[i][3],info[i][4],this.grade[i]);
		}
	}
}
