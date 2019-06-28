package hackerRankPractise;

public class EmptyBST<D extends Comparable> implements Tree<D> {
public boolean isEmpty() {
	return true;
}

@Override
public int cardinality() {
	// TODO Auto-generated method stub
	return 0;
}
@Override
public boolean member(D elt) {
	// TODO Auto-generated method stub
	return false;
}
@Override
public NonEmptyBST add(D elt) {
	// TODO Auto-generated method stub
	return null;
}
}
