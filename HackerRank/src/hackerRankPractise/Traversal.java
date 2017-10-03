/**
 * 
 */
package hackerRankPractise;

/**
 * @author HP
 *
 */

class Node{
	Node left,right;
	int data, height;
	Node(int data){
		this.data = data;
		left = right = null;
		this.height=height;
	}
	//Node(int data,int height){
	//	this.height = height;
	//}
}

public class Traversal {

	public static Node insert(Node root, int data) {
		if(root == null)
			return new Node(data);
		else {
			Node cur;
			if(data < root.data) {
				cur = insert(root.right,data);
				root.right = cur;
			}
			else {
				cur = insert(root.left,data);
				root.left = cur;
			}
			return root;
		}
		
	}
	public int getHeight(Node root) {
		if(root == null)
			return 0;
		else {
			int lHeight = getHeight(root.left);
			int rHeight = getHeight(root.right);
			if(lHeight > rHeight)
				return ++lHeight;
			else 
				return ++rHeight;
		}
	}
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
}
