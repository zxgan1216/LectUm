package L6;

public class L6Q2 {
	public static void main(String[] args) {
		printTriangle(5);
		System.out.println(" ");
		printDiamond(5);
	}
	
	public static void printTriangle(int size) {
		for(int i = 1; i <= size; i++) {
			multiPrint(i,"*");
			System.out.println("");
		}
	}
	
	public static void printDiamond(int size){
		 for (int i = 1; i <= size; i++) {
			 //Math.min(): find the smallest one
	            int min = Math.min(i, size + 1 - i);
	            multiPrint(size / 2 - min + 1, " ");
	            multiPrint(2 * min - 1, "*");
	            System.out.println();
	        }
	        System.out.println();

	}
	
	static void multiPrint(int n, String c) {
		System.out.print(String.valueOf(c).repeat(n));
	}
}

