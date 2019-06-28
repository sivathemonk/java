package hackerRankChallenges;

import java.util.*;
import java.io.*;

//url: https://stackoverflow.com/questions/15797183/differences-between-git-pull-commands-when-pulling-from-origin

/*
 * There is a collection of strings ( There can be multiple occurences of a particular string ).
 *  Each string's length is no more than characters. There are also queries. For each query, you 
 *  are given a string, and you need to find out how many times this string occurs in the given 
 *  collection of strings. 
 * */


/*
 * Sample Input

4
aba
baba
aba
xzxb
3
aba
xzxb
ab

Sample Output

2
1
0

Explanation

Here, "aba" occurs twice, in the first and third string. 
The string "xzxb" occurs once in the fourth string, and
 "ab" does not occur at all.*/


public class SparseArrays<D extends Comparable> {
	
	D[] str;
	//static int m;

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedList<D> lst = new LinkedList<D>();
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String[] strs = new String[n];
		for(int i = 0; i < n; i++) {
			//if(i == 0)
			//	sc.nextLine();
			strs[i] = sc.nextLine();
		}
			
			
		int n1 = sc.nextInt();
		sc.nextLine();
		String[] strs1 = new String[n1];
		for(int i = 0 ; i < n1 ; i ++ ) {
			//if(i == 0)
			//	sc.nextLine();
			strs1[i] = sc.nextLine();
		}
		for(int i = 0 ; i < n1 ; i ++) {
			int m = 0;
			for(int j = 0; j < n ; j ++) {
				if(strs1[i].equals(strs[j]))
					m ++;
			}
			System.out.println(m);
		}
	}

}
