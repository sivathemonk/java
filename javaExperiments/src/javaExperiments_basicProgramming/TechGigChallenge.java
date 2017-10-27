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
public class TechGigChallenge {
	
	//static Stack s2 = new Stack();
	//static Stack s3 = new Stack();

	public static void main(String[] args) {
		// TODO This is the original program to generate the string
		String s = null;
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char[] s1 = s.toCharArray();
		Stack s2 = new Stack();
		for(char e:s1)
			s2.push(e);
		//for(int i = 0; i < s2.size(); i++)
		//	System.out.print(s2);
		Stack s3 = new Stack();
		//s2.
		
		while(!s2.empty()) {
			int si = s2.size();
			if(si % 2 == 0) {
				s3.push(s2.elementAt(s2.size()/2 - 1));
				s2.removeElementAt(s2.size()/2 - 1);
			}
			else {
				s3.push(s2.elementAt((s2.size()-1)/2));
				s2.removeElementAt((s2.size()-1)/2);
				
			}
			
		}
		//char c1 = (char)s3.pop();
		System.out.println(s2);
		//System.out.print(c1);
		StringWriter sw = new StringWriter();
		
		//StringWriter out = "";
		while(!s3.isEmpty()) {
			
			char c1 = (char)s3.pop();
			sw.append(c1);
		}
		System.out.println(sw.toString());
		//for(int i = 0; i < s3.size(); i++)
		//	s3 = null;
		//System.out.println(s1.toString());
		
		
		
		
		
		
		

	}

}
