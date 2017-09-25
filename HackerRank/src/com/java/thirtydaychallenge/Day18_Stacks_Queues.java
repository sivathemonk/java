/**

 * 
 */

package com.java.thirtydaychallenge;

import java.util.*;
/**
 * @author HP
 *
 */
public class Day18_Stacks_Queues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack st = new Stack();
		Queue<Character> q = new LinkedList<Character>();
		String test = "shiva";
		char[] testarray = test.toCharArray();
		for(int i=0; i < testarray.length; i++)
			st.push(testarray[i]);
		//for(int i = 0; i <  testarray.length; i++)
		//	System.out.print(st.pop() + "\t");
		for(int i = 0; i <  testarray.length; i++)
			q.add(testarray[i]);
		System.out.print("\n");
		for(int i = 0; i < testarray.length; i++)
				if(q.poll() == st.pop())
					System.out.println("Palindrome");
				else {
					System.out.println("not a palindrome");
					break;
				}
					
			
		
		

	}

}
