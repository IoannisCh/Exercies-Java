
/**
 * Write a description of class TestNode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestNode
{
    private Node<String> node;
    
    public TestNode () {
        Node<String> nodeA = new Node<>("A");
        Node<String> nodeB = new Node<>("B");
        Node<String> nodeC = new Node<>("C");
        nodeA.setLeftChild (nodeB);
        nodeA.setRightChild (nodeC);
        node = nodeA;
        
        
    }
    
    public static int sumTreeIntegers (Node<Integer> node) {
    if (node == null) { return 0; } // check we have an actual node
    int sum = node.getData ();
    if (node.getLeftChild () != null) {
        sum += sumTreeIntegers (node.getLeftChild());
    }
    if (node.getRightChild () != null) {
        sum += sumTreeIntegers (node.getRightChild());
    }
    return sum;
    }
    
    public static void testSumTree () {
    System.out.println ("0. Sum: " + sumTreeIntegers (null));
    // tree of one node
    Node<Integer> nodeA = new Node<> (5);

    System.out.println ("1. Sum: " + sumTreeIntegers(nodeA));

    // tree of three nodes - we use nodeA as a base
    Node<Integer> nodeB = new Node<> (1);
    Node<Integer> nodeC = new Node<> (3);
    nodeA.setLeftChild (nodeB);
    nodeB.setRightChild (nodeC);

    System.out.println ("2. Sum: " + sumTreeIntegers(nodeA));

    // tree of six nodes - we continue to use nodeA as a base
    Node<Integer> nodeD = new Node<> (2);
    Node<Integer> nodeE = new Node<> (4);
    Node<Integer> nodeF = new Node<> (6);
    nodeA.setRightChild (nodeD);
    nodeB.setLeftChild (nodeE);
    nodeE.setLeftChild (nodeF);

    System.out.println ("3. Sum: " + sumTreeIntegers(nodeA));

   
    }
    
    public static void testDepthTree () {
    // tree of one node
    Node<Integer> nodeA = new Node<> (5);

    System.out.println ("1. Depth: " + nodeA.depth ());

    // tree of three nodes - we use nodeA as a base
    Node<Integer> nodeB = new Node<> (1);
    Node<Integer> nodeC = new Node<> (3);
    nodeA.setLeftChild (nodeB);
    nodeB.setRightChild (nodeC);

    System.out.println ("2. Depth: " + nodeA.depth ());

    // tree of six nodes - we continue to use nodeA as a base
    Node<Integer> nodeD = new Node<> (2);
    Node<Integer> nodeE = new Node<> (4);
    Node<Integer> nodeF = new Node<> (6);
    nodeA.setRightChild (nodeD);
    nodeB.setLeftChild (nodeE);
    nodeE.setLeftChild (nodeF);

    System.out.println ("3. Depth: " + nodeA.depth ());

   
    }
       
    
}
