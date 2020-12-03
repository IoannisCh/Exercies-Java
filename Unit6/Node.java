
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node<T>
{
    private T data;
    private Node<T> leftChild;
    private Node<T> rightChild;
    
    public Node (T data){
        this.data = data;
        
        this.leftChild = null;
        this.rightChild = null;
    }
}
