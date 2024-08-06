package Sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the array size");
		int n =sc.nextInt();
		int arr[] =new int[n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++) 
			arr[i]=sc.nextInt();
		for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

		
		
		System.out.println("Elements after Sorting");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]);
		}

}
}