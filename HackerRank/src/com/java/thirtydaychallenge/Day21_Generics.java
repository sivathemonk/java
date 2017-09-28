/**
 * 
 */
package com.java.thirtydaychallenge;

import java.util.*;
/**
 * @author HP
 *
 */

class Printer{
	<P> void printArray(P[] p) {
		for(P t:p)
			System.out.println(t);
			//System.out.println(p) this gives error, p is having reference to the variable but not the total variable itself
	}
}
public class Day21_Generics {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Write a single Generic function named print Array;
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		Integer[] intArray = new Integer[n];
		for(int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}
		String[] stringArray = new String[n];
		for(int i = 0; i < n; i++)
			stringArray[i] = scanner.next();
		Printer pr = new Printer();
		pr.printArray(intArray);
		pr.printArray(stringArray);

	}

}
