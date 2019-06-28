/**
 * 
 */
package hackerRankPractise;

/**
 * @author HP
 *
 */
public interface Tree<D extends Comparable> {
	public boolean isEmpty();
	public int cardinality();
	public boolean member(D elt);
	public NonEmptyBST add(D elt);

}
