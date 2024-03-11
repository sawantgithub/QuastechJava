package javaProblem;

import java.util.Scanner;

public class problem_4 {

	public static void main(String[] args) {
//	write a program to sort an array in
//	  ascending order.

		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter elements of the array: ");

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Unsorted Order of the array: ");
		for (int i = 0; i < 5; i++) {
			System.out.print(arr[i] + "");
		}

//		sorting procedure
		for (int i = 0; i < 5; i++) {
			for (int j = i + 1; j < 5; j++) {
             if(arr[i]>arr[j])
             {
            	 int t = arr[i];
            	 arr[i]=arr[j];
            	 arr[j]=t;
             }
			}
		}
		
		System.out.println("sorted Order of the area y(ncreasing order)");
		
		for (int i=0;i<5;i++) {
			System.out.println(arr[i]+"");
		}

	}

}
