package Sorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int n =sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		for(int i=1;i<n;i++) {
			int temp = arr[i];
			int j=i-1;
			while(j >= 0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		System.out.println("Elements after Sorting");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

	}

}
