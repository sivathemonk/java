package com.siva.geeksforgeeks;


import java.io.*;
import java.util.*;
/*Algorithm is taken from geeks for geeks 
  arr[] = 64 25 12 22 11

Find the minimum element in arr[0...4]
and place it at beginning
11 25 12 22 64

 Find the minimum element in arr[1...4]
 and place it at beginning of arr[1...4]
11 12 25 22 64

 Find the minimum element in arr[2...4]
 and place it at beginning of arr[2...4]
11 12 22 25 64

 Find the minimum element in arr[3...4]
 and place it at beginning of arr[3...4]
11 12 22 25 64 
 */


public class SelectionSort {
	
	//Scanner sc = new Scanner(System.in);
	//int n = sc.nextInt();
	//int[] arr = new int[n];
	
	int[] minToFirst(int[] arr) {
		
		for(int i=1; i < arr.length; i++) {
			int min = arr[0];
			if(arr[i] < min) {
				arr[0] = arr[i];
				arr[i] = min;
			}
		}
		//arr[0] = min;
		return arr;
	}
	
	//the minToFirst is a logical function implemented to place the min at the beginning of the array.
	//This function is not called below as surplus callings are required in initializing the subarray
	
	public static void main(String[] args) {
		//int[] shiva = {5,4,3,2,1};
		SelectionSort ss = new SelectionSort();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] shiva = new int[n];
		int m = 0;
		while(m < n) { 
			shiva[m] = sc.nextInt();
			m++ ;
		}
		/*Since an array contain two ordinates,this is a two dimensional matrix operation.
		 * Considering the first ordinate and second ordinate we can sort in the selection sort algorithm*/ 
		
		for(int i=0;i<shiva.length-1;i++) { 		//this loop controls the number of executions and indicates the first coordinate
			for(int j=i+1 ;j<shiva.length;j++) {	// this loop controls the second co ordinate and is essential for swappin
				
				int min = shiva[i];					//min variable used for swapping
				if(shiva[j] < shiva[i]) {
					shiva[i] = shiva[j];
					shiva[j] = min;
					
				}
			}
		}
		
		for(int i=0;i < shiva.length;i ++) {
			System.out.println(shiva[i]);
		}
	}
	

}


//this selection sort is done by shiva. 