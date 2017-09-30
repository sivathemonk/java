package hackerRankPractise;
//url : https://www.hackerrank.com/challenges/30-binary-search-trees/tutorial

public class NonEmptyBST<D extends Comparable> implements Tree<D>  {
	D Data;
	Tree<D> left;
	Tree<D> right;
	public boolean isEmpty() {
		return false;
	}
	NonEmptyBST(D elt, Tree<D> leftTree, Tree<D> rightTree) {
		Data = elt;
		left = leftTree;
		right = rightTree;
		
	}
	
	public boolean  member(D elt) {
		if(elt == Data) {
			return true;
		}
		else {
			if(elt.compareTo(Data) < 1) {
				return left.member(elt);
			}
			else {
				return right.member(elt);
			}
		}
	}
	public int cardinality() {
		return 1+left.cardinality()+right.cardinality();
	}
	
	public NonEmptyBST<D> add(D elt) {
		if(Data == elt) {
			return this;
		} else {
			if(elt.compareTo(Data) < 0) {
				return new NonEmptyBST(Data, left.add(elt),right);
			}
			else {
				return new NonEmptyBST(Data, left, right.add(elt));
			}
		}
	}
	//NonEmptyBST() 
//	@Override
//	public int cardinality() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

	
	
	
}
