package L5;

import java.util.Random;
import java.util.Scanner;

public class L5Q5 {
	public static void main(String[] args) {
		Random ran=new Random();
		Scanner sc=new Scanner (System.in);
		int[] arr=new int [20];
		
		int num_search;
		System.out.println("A list of 20 random inetger wihtin 0 to 100");
		for (int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt(0,100);
			System.out.print(arr[i]+" ");
		}
		Descending(arr);
		System.out.println("\nEnter a numbe to search : ");
		num_search=sc.nextInt();
		Linear(arr,num_search);
		Binary(arr,num_search);
		sc.close();
	}
	
	static void Descending(int[] arr) {
		System.out.println("\nArray in descending order");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++) {
				if (arr[j]>arr[i]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			
			}
		}
		System.out.println("\nArray in descending order");
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	static void Linear(int arr[],int num_search) {
		int counter =1;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]==num_search) {
				System.out.println(num_search+" found");
				System.out.print("Linear serach - "+counter + " loop(s)");
				break;
			}
			else {
				counter ++;
			}
		}
	}
	
	static void Binary(int arr[],int num_search) {
		int mid,min=0,max=arr.length-1,count=1;
		while (min<=max) {
			mid=(min+max)/2;
			if (arr[mid]==num_search) {
				System.out.println("\n"+num_search+" found");
				System.out.println("Binary search - "+ count +" loop(s)");
				break;
			}
			if (arr[mid]<num_search) {
				max=mid-1;
			}
			else {
				min=mid+1;
			}
			count++;
		}
	}

}
