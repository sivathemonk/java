package hackerRankPractise;

import java.lang.*;
import java.util.*;

class Node{
	Node left,right;
	int data;
	Node(int data) {
		this.data = data;
		left = right = null;
	}
}
public class BinarySearchTreeHackerDay {
	public static Node insert(Node root, int data) {
		if(root == null)
			return new Node(data);
		else {
			Node current;
			if(data <= root.data ) {
				current = insert(root.left,data);
				root.left = current;
			}
			else { 
				current = insert(root.right, data);
				root.right = current;
			}
		}
		
		return root;
	} 
	public static int getHeight(Node root) {
		if(root == null)
			return 0;
		int heightLeft = getHeight(root.left);
		int heightRight = getHeight(root.right);
		//int height = Math.max(heightLeft, heightRight);
		int height;
		if(heightLeft > heightRight)
			height = heightLeft + 1;
		else
			height = heightRight + 1;
		return height-1;
		
		//return height;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Node root = null;
		while(n-- > 0) {
			int data = sc.nextInt();
			root =insert(root,data);
		}
		int height = getHeight(root);
		System.out.println(height-1);
	}
	

	
}
