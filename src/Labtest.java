
public class Labtest {
	public static void main(String[] args) {
		String[] reg_no= {"s12345","s24567","s23789","s14569","s18743"};
		String[] name= {"Ali","Beng","Carmen","Dinesh","Emilia"};
		double[] mark= {77.9,23.5,90.3,68.0,75.2};
		
		System.out.print("Original Data:");
		Print();
		for (int i=0;i<reg_no.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[i],name[i],mark[i]);
		}
		
		System.out.print("\n\nData (sorted by ID)");
		

		Print();
		
		for(int pass=1;pass<reg_no.length;pass++) {
			for (int i=0;i<reg_no.length-1;i++) {
				if (reg_no[i].compareTo(reg_no[i+1])>0) {
					String temp=reg_no[i];
					reg_no[i]=reg_no[i+1];
					reg_no[i+1]=temp;
					String temp_2=name[i];
					name[i]=name[i+1];
					name[i+1]=temp_2;
					double temp_3=mark[i];
					mark[i]=mark[i+1];
					mark[i+1]=temp_3;
				}
			}
		
		}
		
		for (int i=0;i<reg_no.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[i],name[i],mark[i]);
		}
		
		System.out.print("\n\nData (sorted by Marks)");
		Print();
		
		for(int pass=1;pass<mark.length;pass++) {
			for (int i=0;i<mark.length-1;i++) {
				if (mark[i]<mark[i+1]) {
					double temp=mark[i];
					mark[i]=mark[i+1];
					mark[i+1]=temp;
					String temp_2=name[i];
					name[i]=name[i+1];
					name[i+1]=temp_2;
					String temp_3=reg_no[i];
					reg_no[i]=reg_no[i+1];
					reg_no[i+1]=temp_3;
				}
			}
		
		}
		
		for (int i=0;i<mark.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[i],name[i],mark[i]);
		}
		
		System.out.print("\n\nData (sorted by Name)");
		Print();
		
		for(int pass=1;pass<name.length;pass++) {
			for (int i=0;i<name.length-1;i++) {
				if (name[i].compareTo(name[i+1])>0) {
					String temp=name[i];
					name[i]=name[i+1];
					name[i+1]=temp;
					String temp_2=reg_no[i];
					reg_no[i]=reg_no[i+1];
					reg_no[i+1]=temp_2;
					double temp_3=mark[i];
					mark[i]=mark[i+1];
					mark[i+1]=temp_3;
				}
			}
		
		}
		
		for (int i=0;i<name.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[i],name[i],mark[i]);
		}
	}
	
	static void Print() {
		System.out.printf("\n%-11s%-11s%-9s","Reg No.","Name","FOP Marks");
		System.out.printf("\n+"+"-".repeat(29)+"+");
	}

}
