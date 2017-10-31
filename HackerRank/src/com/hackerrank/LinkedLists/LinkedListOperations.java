package com.hackerrank.LinkedLists;


import java.util.*;


public class LinkedListOperations {
	
	
	static	Node removeDuplicates(Node head) {
		if(head == null)
			return head;
		else if(head.next == null)
			return head;
		else if(head.data == head.next.data) {
			head.next = head.next.next;
			removeDuplicates(head);}
		
		
		return removeDuplicates(head.next);
		//return head;
	}
	
	static Node Insert(Node head,int data) {
		if(head == null) {
			head = new Node();
			head.data = data;
			return head;
		}
		else if(head.next == null) {
			//Node n = Insert(head.next,data);
			head.next = new Node();
			head.next.data = data;
			return head;
		}
		else {
			
			head = head.next;
			Insert(head,data);
		}
		return head;
	}
	static void display(Node head)
	{
		while(head != null) {
			System.out.println(head.data);
			head = head.next;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node head = null;
		while( n-- > 0 ) {
			int data = sc.nextInt();
			if(head == null) {
				head = Insert(head,data);
			}
			else
				Insert(head,data);
		}
		display(head);
		removeDuplicates(head);
		System.out.printf("The output after removal of duplicates : ");
		display(head);
		

	}

}
