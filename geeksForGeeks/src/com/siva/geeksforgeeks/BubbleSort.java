/**
 * 
 */

package com.siva.geeksforgeeks;



import java.io.*;
import java.util.*;

/**
 * @author HP
 *
 */

/*Example:
First Pass:
( 5 1 4 2 8 ) –> ( 1 5 4 2 8 ), Here, algorithm compares the first two elements, and swaps since 5 > 1.
( 1 5 4 2 8 ) –>  ( 1 4 5 2 8 ), Swap since 5 > 4
( 1 4 5 2 8 ) –>  ( 1 4 2 5 8 ), Swap since 5 > 2
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 ), Now, since these elements are already in order (8 > 5), algorithm does not swap them.

Second Pass:
( 1 4 2 5 8 ) –> ( 1 4 2 5 8 )
( 1 4 2 5 8 ) –> ( 1 2 4 5 8 ), Swap since 4 > 2
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –>  ( 1 2 4 5 8 )
Now, the array is already sorted, but our algorithm does not know if it is completed. The algorithm needs one whole pass without any swap to know it is sorted.

Third Pass:
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )
( 1 2 4 5 8 ) –> ( 1 2 4 5 8 )*/

public class BubbleSort {

	public static void main(String[] args) {
		
		//initializing the scanner
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		//initializing the array values
		int m = 0;
		while(m < n) {
			arr[m] = sc.nextInt();
			m ++;
		}
		int k = 1;
		int z = 0;
		while(k != 0)		//convergence condition
		{
		//Bubble sort procedure begins
			k = 0;
			for(int i = 0 ; i < arr.length-1; i ++)
				{
				if(arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					k = 1;
					z++;
					}
				}	
		}
		//printing the final array
		for(int i = 0;  i < arr.length ; i ++)
			System.out.print(arr[i] + "\t");
			System.out.println("it took " + z + " steps");
	}
	
	
}
