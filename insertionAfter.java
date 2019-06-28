//import java.io;
import java.util.*;



/*
 * class Node{
	Node next;
	int data;
	Node(int d) { data=d; next=null; }
}
*/

class LinkedLists{
	static Node insert(Node head, int data){
		if(head == null) { head = new Node(data); }
		else if(head.next == null) {  head.next = new Node(data); }
		else{ insert(head.next,data); } 
		return head;	

	}

	static void insertAfter(Node prevNode, int data){
		Node n = new Node(data);
		Node temp = prevNode.next;
		prevNode.next = n;
		n.next=temp;
		//return prevNode;	
	}

	static void display(Node head){
		Node start =  head;
		while(head != null) { System.out.print(head.data + " "); 
			head = head.next; }

	}
	static Node findNode(int n,Node head){
		//Node ne;
		while(head != null){
			//int ele = sc.nextInt();
			if(head.data == n){ return head; }
			head = head.next;
		}
		return head;
	}

	static void printSystemMessage() { System.out.println("press (1) insertion (2) for deletion"); }

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();
	
		while(N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		//display(head);
		printSystemMessage();
		while(sc.hasNext()){
			if(sc.nextInt() == 1) {
				System.out.println("Please enter the data of the node to be inserted");
				int data =  sc.nextInt();
				System.out.println("Enter the node to be above this node");
				int prevNodeData = sc.nextInt();
				Node prevNode = findNode(prevNodeData,head);
				insertAfter(prevNode,data);
				display(head);
			}
			else if(sc.nextInt() == 0){System.out.println("Still on progress");}
			else {System.out.println("Completing"); sc.close();}
		}

		//sc.close();
		
		//return 0;

	}
}
