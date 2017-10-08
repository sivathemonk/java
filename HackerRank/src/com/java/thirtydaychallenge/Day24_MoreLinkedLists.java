package com.java.thirtydaychallenge;


import java.util.*;
class Node_MLT{
	Node_MLT next;
	int data;
	Node_MLT(int data){
		this.data = data;
		next = null;
	}
}

public class Day24_MoreLinkedLists {
	
	public static Node_MLT removeDuplicates(Node_MLT head) {
		Node_MLT start = head;
		if(start == null || start.next == null) {
			return start;
		}
		else {
			if(start.next.data == start.data) {
				start.next = start.next.next;
				removeDuplicates(start);
			}
			else {removeDuplicates(start.next);}
		}
		return start;
	}
	
	public static Node_MLT insert(Node_MLT head, int data) {
		if(head == null) {
			return new Node_MLT(data);
			
		}
		else {
			Node_MLT cur;
			if(head.next == null) {
				cur = insert(head.next,data);
				head.next = cur;
			}
			else {
				Node_MLT cur1 = head;
				while(cur1.next != null)
					cur1 = cur1.next;
				cur1 = insert(cur1.next,data);
			}
		}
		return head;
	}
	
	public static void display(Node_MLT head) {
		while(head!=null) {
			System.out.println(head.data + " ");
			head = head.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node_MLT head = null;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		removeDuplicates(head);
		display(head);

	}

}
