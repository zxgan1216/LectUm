package L6;

public class Labtest2 {
	public static void main(String[] args) {
		String[] reg_no= {"s12345","s24567","s23789","s14569","s18743"};
		String[] name= {"Ali","Beng","Carmen","Dinesh","Emilia"};
		double[] mark= {77.9,23.5,90.3,68.0,75.2};
		int [] compare= {0,1,2,3,4};
		
		System.out.print("Original Data:");
		Print();
		for (int i=0;i<reg_no.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[i],name[i],mark[i]);
		}
		
		System.out.print("\n\nData (sorted by ID)");
		

		Print();
		
		for(int pass=1;pass<reg_no.length;pass++) {
			for (int i=0;i<reg_no.length-1;i++) {
				if (reg_no[compare[i]].compareTo(reg_no[compare[i+1]])==1) {
					int temp=compare[i];
					compare[i]=compare[i+1];
					compare[i+1]=temp;
				}
			}
		}
		
		
		for (int i=0;i<reg_no.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[compare[i]],name[compare[i]],mark[compare[i]]);
		}
		
		System.out.print("\n\nData (sorted by Marks)");
		Print();
		
		for(int pass=1;pass<mark.length;pass++) {
			for (int i=0;i<mark.length-1;i++) {
				if (mark[compare[i]]<mark[compare[i+1]]) {
					int temp=compare[i];
					compare[i]=compare[i+1];
					compare[i+1]=temp;
				}
			}
		}
		
		for (int i=0;i<reg_no.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[compare[i]],name[compare[i]],mark[compare[i]]);
		}
		
		System.out.print("\n\nData (sorted by Name)");
		Print();
		
		for(int pass=1;pass<name.length;pass++) {
			for (int i=0;i<name.length-1;i++) {
				if (name[compare[i]].compareTo(name[compare[i+1]])>0) {
					int temp=compare[i];
					compare[i]=compare[i+1];
					compare[i+1]=temp;
				}
			}
		}
		
		for (int i=0;i<reg_no.length;i++) {
			System.out.printf("\n%-11s%-11s%-9s",reg_no[compare[i]],name[compare[i]],mark[compare[i]]);
		}
	}
	
	static void Print() {
		System.out.printf("\n%-11s%-11s%-9s","Reg No.","Name","FOP Marks");
		System.out.printf("\n+"+"-".repeat(29)+"+");
	}


}
