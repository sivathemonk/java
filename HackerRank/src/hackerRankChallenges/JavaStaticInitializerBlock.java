/**
url: https://www.hackerrank.com/challenges/java-static-initializer-block/problem
 * 
 */
package hackerRankChallenges;

import java.util.*;

/**
 * @author root
 *
 */
public class JavaStaticInitializerBlock {
	
	/**
	 * @param args
	 * 
	 * To Do: Declare a static variables and check them at the runtime
	 */
	
	/*
	static boolean flag;
	static int H;
	static int B;
	static {
		//boolean flag;
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		B = sc.nextInt();
		if(H*B > 0) {
			flag = true;
		}
		else
			flag = false;
	}*/
	static boolean flag;
	static Scanner sc = new Scanner(System.in);
	static int B = sc.nextInt();
	static int H = sc.nextInt();
	static
	{
		if(H > 0 && B > 0 )
	
			flag = true;
		else
			try {
				throw new Exception("Breadth and height must be positive");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//e.
			}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(flag) {
			int area = B*H;
			System.out.print(area);
		}

	}

}
