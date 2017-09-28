/**
 * 
 */
package hackerRankPractise;

import java.util.*;
/**
 * @author HP
 *
 */
public class Generics {

	/**
	 * @param args
	 */
	
	public <E> void printArray(E[] r) {
		for(E e:r)
			System.out.println(e); 
		
	}
	public static void main(String[] args) {
		// TODO Learning Generics
		String[] arr = new String[]{"shiva","Shiva","Shiva"};
		//arr = {"shiva","shiva","shiva","hava","mava"};
		Generics G = new Generics();
		G.printArray(arr);

	}

}
