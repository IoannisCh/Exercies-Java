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
    
    public T getData () {return data;}
    public Node<T> getLeftChild (){return leftChild;}
    public Node<T> getRightChild (){return rightChild;}
    
    public void setLeftChild (Node<T> node){
        leftChild = node;
    }
    
    public void setRightChild (Node<T> node){
        rightChild = node;
    }
    
    public String toString (){
        return "Data: " + data.toString();
    }
    
    public static void main (String[] args){
        Node<String> nodeA = new Node<> ("A");
        System.out.println(" Number of nodes in 1: " + nodeA.countNodes());
        
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");
        nodeA.setLeftChild (nodeB);
        nodeB.setRightChild (nodeC);
        System.out.println(" Number of nodes in 3: " + nodeA.countNodes());
        
        Node<String> nodeD = new Node<>("D");
        Node<String> nodeE = new Node<>("E");
        Node<String> nodeF = new Node<>("F");
        nodeA.setRightChild (nodeD);
        nodeB.setLeftChild (nodeE);
        nodeE.setLeftChild (nodeF);
        
        System.out.println (" Number of nodes in 6: " + nodeA.countNodes());
    }
    
    public int countNodes() {
        System.out.print (" Count nodes in " + this.toString());
        int sum = 0;
        
        sum += 1;
        if (leftChild != null){
            sum += leftChild.countNodes();
        }
        if (rightChild != null){
            sum += rightChild.countNodes();
        }
        
        return sum;
    }
    
    public static Node<String> makeTreeStrings (int n) {
    Node<String>[] nodes = new Node[n];

    for (int i=0; i<nodes.length; i+=1) {
        nodes[i]=new Node<String> ("node-" + (i+1));
    }
    for (int i=0; i<nodes.length; i+=1) {
        if (2*i+1 < nodes.length) {
            nodes[i].setLeftChild ( nodes[2*i+1] );
        }
        if (2*i+2 < nodes.length) {
            nodes[i].setRightChild ( nodes[2*i+2] );
        }
    }
    return nodes[0];
    }
    
    public static Node<Integer> makeTreeIntegers (int n) {
    Node<Integer>[] nodes = new Node[n];

    for (int i=0; i<nodes.length; i+=1) {
        nodes[i]=new Node<Integer> (i+1);
    }
    for (int i=0; i<nodes.length; i+=1) {
        if (2*i+1 < nodes.length) {
            nodes[i].setLeftChild ( nodes[2*i+1] );
        }
        if (2*i+2 < nodes.length) {
            nodes[i].setRightChild ( nodes[2*i+2] );
        }
    }
    return nodes[0];
    }
    
    public void showTree () {
    System.out.println ("Node: " + data);   // <1>

    if (leftChild != null) {
            leftChild.showTree ();          // <2>
    }

    if (rightChild != null) {
        rightChild.showTree ();             // <3>
    }
    }
    
     public int depth () {
        int leftDepth = 0;
        int rightDepth = 0;

        if (leftChild != null) {
            leftDepth = leftChild.depth ();
        }
        if (rightChild != null) {
            rightDepth = rightChild.depth ();
        }

        if (leftDepth > rightDepth) {
            return leftDepth + 1;
        } else {
            return rightDepth + 1;
        }
    }
    
    public boolean equals (Object o) {
        if (o == null) { return false; }
        if (o instanceof Node) {

        Node n = (Node)o;                                                       // <1>

        if (!data.equals (n.getData ())) { return false; }                      // <2>

        if (leftChild == null && n.getLeftChild () != null) { return false; }   // <3>
        if (leftChild != null &&
        !leftChild.equals (n.getLeftChild ())) { return false; }            // <4>

        if (rightChild == null && n.getRightChild () != null) { return false; } // <5>
        if (rightChild != null &&
        !rightChild.equals (n.getRightChild ())) { return false; }          // <6>

        return true;                                                            // <7>

       } else {  // given object is not a Node, so return false
           return false;
        }
    }
    

}
