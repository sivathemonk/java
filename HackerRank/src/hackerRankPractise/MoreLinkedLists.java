/**
url:https://www.hackerrank.com/challenges/30-linked-list-deletion/problem

Practising more linked lists
 * 
 */
package hackerRankPractise;


import java.util.*;
/**
 * @author root
 *
 */
class Node_MLT{
	int data;
	Node_MLT next;
	Node_MLT(int data){
		this.data = data;
		next = null;
	}
}
public class MoreLinkedLists {

	/**
	 * @param args
	 */
	
	public static Node_MLT removeDuplicates(Node_MLT head) {
		Node_MLT start = head;
		if(start == null || start.next == null) {
			return start;
		}
		else {
			if(start.data == start.next.data) {
				start.next = start.next.next;
				removeDuplicates(start);
			}
			else {removeDuplicates(start.next);}
		}
		/*while(start.next!=null) {
			if(start.next.data == start.data){
				//Node_MLT cur;
				start = start.next;
				//start.next = cur;
			}
			start = start.next;
			}*/
		return start;
		
	}
	public static Node_MLT insert(Node_MLT head, int data) {
		if(head == null)
			return new Node_MLT(data);
		else {
			Node_MLT cur;
			if(head.next == null) {
				cur = insert(head.next,data);
				head.next = cur;
			}
			else {
				Node_MLT cur1 = head;
				while(cur1.next!=null)
					cur1 = cur1.next;
				cur1.next = insert(cur1.next,data);
			}
		}
			return head;
	}
	
	public static void display(Node_MLT head) {
		Node_MLT start = head;
		while(start!=null)
		{
			System.out.println(start.data + " ");
			start = start.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node_MLT head = null;
		while(n-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		removeDuplicates(head);
		display(head);
	}

}

/*
 * 
 * Awesome shiva... you've done this linked list on your own, a modification from Binary search tree on Hackerrank
 * This is really worth working for. The only problem with this code is that the last head is not visible gotta work with that*/



//ITSSSS WORKKING
