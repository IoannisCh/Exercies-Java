
/**
 * Write a description of class SortedNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortedNode<T extends Comparable<T>>
{
    private T key;
    private SortedNode<T> leftChild;
    private SortedNode<T> rightChild;
    
    public SortedNode (T key) {
        this.key = key;
        
        this.leftChild = null;
        this.rightChild = null;
    }
    
    public SortedNode<T> find (T searchkey){
        if (key.equals (searchkey)) {
            return this;
        } else if (key.compareTo (searchkey) > 0) {
            if (leftChild == null) {
                return null;
            } else {
                return leftChild.find (searchkey);
            }
        } else {
            if (rightChild == null) {
                return null;
            } else {
                return rightChild.find (searchkey);
            }
        }
    }
    
    public void prettyPrint (String insert){
        System.out.println (insert + "Node: " + key);
        if (leftChild != null){
            leftChild.prettyPrint(insert + "L-");
        }
        if (rightChild != null){
            rightChild.prettyPrint(insert + "R-");
        }
        
        
    }
 }
