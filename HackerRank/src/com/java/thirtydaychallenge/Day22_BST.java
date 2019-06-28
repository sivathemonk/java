package com.java.thirtydaychallenge;


import java.util.*;

class Node_BST{
	Node_BST left, right;
	int data;
	Node_BST(int data){
		this.data = data;
		left = right = null;
	}

}

public class Day22_BST {
	
	
	public static int getheight(Node_BST root) {
		
		if(root == null) {
			return -1;
		}
		else {
			int lHeight=getheight(root.left);
			int rHeight=getheight(root.right);
			
			if(lHeight > rHeight) {
				return ++lHeight ;
			}
			else {
				return ++rHeight ;
			}
			//int maxHeight = Math.max(lHeight, rHeight);
			//maxHeight--;
			//return maxHeight;
		}
		/*The beauty of the reference or object notation can be demonstrated here.
		 * I did observe the total demonstration by keeping the total application under breakpoints
		 * I feel c++ could provide more insights on reference objects*/
		//return maxHeight;
		
	}
	public static Node_BST insert(Node_BST root, int data) {
		
		if(root == null)
			return new Node_BST(data);
		else {
			Node_BST cur;
			if(data <= root.data) {
				cur = insert(root.right,data);	//replaced the whole program with only insert(root.left, data) thinking the exection happens successfully, surprisingly it didn't work well
												//Have to find a proper answer for that.
				root.right = cur;
				/*the above program insert(root.right,data) returns only address, which means on direct execution this returns nothing.
				 * On the other hand assigning the address value to a variable and assigning the address to the same root.right makes the object to hold the same value
				 * try implementing 
				 * 
				 * insert(root.right,data)*/
				
			}
			else {
				cur = insert(root.left,data);
				root.left = cur;
			}
		}
		/*
		try {
			System.out.println(root.left.data + "\t" + insert(root.right,data) + root.right + " -Right" );
			System.out.println(root.right.data + "\t " + insert(root.left,data)+ root.left + "-Left");
		}
		catch(Exception ex) {
			
			System.out.println(ex.getMessage());
		}
		*/
		return root;
}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node_BST root = null;
		while(n-- > 0)
			root = insert(root,sc.nextInt());
		int height = getheight(root);
		System.out.println(height);
		

	}

}
