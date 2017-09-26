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
	Stack st = new Stack();
	Queue<Character> q = new LinkedList<Character>();
	void enqueueCharacter(char ch) {
		q.add(ch);
	}
	void pushCharacter(char ch) {
		st.push(ch);
	}
	char dequeueCharacter() {
		return q.poll();
	}
	char popCharacter() {
		return (char) st.pop();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Day18_Stacks_Queues sol = new Day18_Stacks_Queues();
		String test = "sons";
		char[] testarray = test.toCharArray();
		for(char c : testarray) {
			sol.pushCharacter(c);
			sol.enqueueCharacter(c);
		}
		
		
		//for(int i = 0; i <  testarray.length; i++)
		//	System.out.print(st.pop() + "\t");
		
		System.out.print("\n");
		for(int i = 0; i < testarray.length; i++)
				if(sol.popCharacter() != sol.dequeueCharacter()) {
					System.out.println(" not a Palindrome");
					break;
				}
					
		
				else {
					System.out.println("palindrome");
					break;
				}
					
			
		
		

	}

}
