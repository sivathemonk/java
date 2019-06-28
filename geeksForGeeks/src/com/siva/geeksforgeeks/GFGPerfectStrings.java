/**
 * 
 */
package com.siva.geeksforgeeks;

import java.util.*;

/**
 * @author Shiva_BCAS
 *
 */
public class GFGPerfectStrings {

	/**
	 * TODO: Given an N length array and 
	 * you have to tell whether the array 
	 * is perfect or not.An array is said 
	 * to be perfect if it's reverse array 
	 * matches the original array. If the 
	 * array is perfect then print "PERFECT" 
	 * else print "NOT PERFECT".
	 * 
	 * Input:

		The first line of input contains an integer T 
		denoting the number of test cases. Then T test 
		cases follow. Each test case consists of two lines
		. First line of each test case contains an 
		integer N (size of the array)and the second line 
		contains N elements a1,a2,......aN of an array .

	Output:
		For each test case, print either "PERFECT" or 
		"NOT PERFECT" in new line as your answer.
	 */
	//static boolean perfect;
	 static int[] getArray(int k) {
		Scanner sc1 = new Scanner(System.in);
		int[] arr = new int[k];
		for(int i = 0; i < k; i ++)
			arr[i] = sc1.nextInt();
		sc1.close();
		return arr;
	}
	 static boolean isPerfect(int[] arr){
		 boolean perfect = false;
		 for(int i = 0; i <= arr.length/2; i++) {
			 if(arr[i] == arr[arr.length-1-i])
				 perfect = true;
			 else {
				perfect = false;
				break;
			 }
		 }
		 return perfect;
	 }
	public static void main(String[] args) {
		// TODO Scan two variables and the second one in a loop
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n > 0) {
			int k = sc.nextInt();
			int[] arr = getArray(k);
			
				System.out.println((isPerfect(arr)) ? "PERFECT" : "NOT PERFECT");
				n=n-1;
			
		}
		sc.close();

	}

}
