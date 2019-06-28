/**
 * 
 */

//

// Program throws error please see the following to rectify the issue
/**
 public static  Node insert(Node head,int data)
{
//Complete this method
    if(head == null)
        return new Node( data);
    else if(head.next == null){
            head.next = new Node(data);
        }
    else{
        insert(head.next,data);
    }


        return head;

    }*/
package com.java.thirtydaychallenge;

import java.util.Scanner;

/**
 * @author HP
 *
 */
class Node{
	int data;
	Node next;
	Node(int d){
		data = d;
		next = null;
	}
}
class Day15_LinkedList {
	public static Node insert(Node head, int data) {
		Node n = null ;
		if(head == null) {
			n = new Node(data);
			head = n;
		}
		else if(head.next == null) {
			head.next = new Node(data);
			n = head.next;
		}
		else {
			head = head.next;
			insert(head,data);
		}
		
		return n;
	}
	public static void display(Node head) {
		Node start = head;
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
		
		while(N-- > 0) {
			//Node head = null;
			//int N = sc.nextInt();
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();

	}
	
	

}
