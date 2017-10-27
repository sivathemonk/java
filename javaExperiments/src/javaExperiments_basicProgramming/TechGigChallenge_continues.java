package javaExperiments_basicProgramming;

import java.util.*;
import java.io.*;
/* problem: Riya loves Merge Sort  especially because it selects the median value of the array as pivot.Today she has got a new problem for her brother as she was not able to solve it. 
She wants to know the given a String S of lower-case English alphabets ,what would be the new String generated if we perform the following operations-
Pick the middle character if the length is odd or if the length is even pick the left of the two middle characters and append this character to a new String and remove that character from the String S by reducing its size by 1.Keep on performing the above operation until no characters are left.

Riya is really clever.So instead of asking her brother to perform the above operation she gives him the new String and wants him to tell what was the original one .
You as a friend of her brother thought to help her by writing a program for the same.

 *
 *EXAMPLES
Sample Test Case 1
Input
cbdae

Output
abcde

Explanation-
Lets move from the original String to the final one
Since the length of String is odd so we select the middle character i.e c and append it to the new String.Now new String is abde ,the length is even so we select the left of the middle two elements i.e b ,new String is now ade ,now we select d ,the String becomes ae ,we select now a and finally e .
So the new String by appending all the selected characters is cbdae .
Now, You have to reverse this process and get the original String i.e. "abcde".
 */

public class TechGigChallenge_continues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//input String is encrypted: cbdae, generate abcde
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		char[] c = in.toCharArray();
		Stack s = new Stack();
		Queue q = new LinkedList();
		for(char c1:c)
			s.push(c1);
		
		Stack out = new Stack();
		
		//while(!s.isEmpty()) {
			if(s.size()%2 == 0) {
				for(int i = 1 ; i < c.length ; i = i + 2)
					q.add(c[i]);
					
				for(int i = c.length - 2 ; i > 0 ; i = i - 2)
					q.add(c[i]);
			}
			else {
				for(int i = c.length - 2 ; i > 0 ; i = i - 2)
					q.add(c[i]);
				for(int i = 0 ; i < c.length ; i = i + 2)
					q.add(c[i]);
				
			}
		//}
			
			StringWriter sw = new StringWriter();
			while(!q.isEmpty())
				sw.append((char)q.poll());
			System.out.println(sw.toString());
		
	

	}

}
