
/**
 * Write a description of class testEquals here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testEquals
{
    public static void testEqualBooleans (boolean result, boolean expected) {
  if (result == expected) {
    // do nothing
  } else {
    System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
  }
}

public static void testEqualStrings (String result, String expected) {
  if (result.equals (expected)) {   // Strings are objects, so use the equals method
    // do nothing
  } else {
    System.out.println ("Error: the result " + result + " does not equal the expected " + expected);
  }
}
 

   
    public static void testEquals () {
    Node<Integer> nodeA = new Node<> (5);
    // check node against null
    testEqualBooleans (nodeA.equals(null), false);
    // check node against a String (or an object of any other type)
    testEqualBooleans(nodeA.equals("A"), false);
    // check against a node with the same data
    testEqualBooleans(nodeA.equals (new Node<Integer> (5)), true);
    // check against a node with a different kind of data
    testEqualBooleans(nodeA.equals (new Node<String> ("5")), false);

    // check two nodes with same data, one of which has a left child
    Node<Integer> secondA = new Node<> (5);
    Node<Integer> nodeB = new Node<> (3);
    nodeA.setLeftChild (nodeB);
    testEqualBooleans (nodeA.equals(secondA), false);
    // ... and in reverse order
    testEqualBooleans (secondA.equals(nodeA), false);

    // check two nodes with same data, one of which has a right child
    nodeA.setLeftChild (null);
    nodeA.setRightChild (nodeB);
    testEqualBooleans (nodeA.equals(secondA), false);
    // ... and in reverse order
    testEqualBooleans (secondA.equals(nodeA), false);

    // check two trees, each with two nodes
    Node<Integer> secondB = new Node<> (3);
    // - nodeA already has a rightchild B
    secondA.setRightChild (secondB);
    testEqualBooleans (nodeA.equals(secondA), true);

    // - move secondB to the left
    secondA.setRightChild (null);
    secondA.setLeftChild (secondB);
    testEqualBooleans (nodeA.equals(secondA), false);

    // - move nodeB to the right
    nodeA.setRightChild (null);
    nodeA.setLeftChild (nodeB);
    testEqualBooleans (nodeA.equals(secondA), true);

    // check two larger trees
    // - tree 1
    nodeA = new Node<> (5); // we reuse the nodeA variable
    nodeB = new Node<> (1);
    Node<Integer> nodeC = new Node<> (3);
    Node<Integer> nodeD = new Node<> (2);
    Node<Integer> nodeE = new Node<> (4);
    Node<Integer> nodeF = new Node<> (6);
    nodeA.setRightChild (nodeD);
    nodeB.setLeftChild (nodeE);
    nodeE.setLeftChild (nodeF);
    // - tree 2
    secondA = new Node<> (5); // we reuse the secondA slot
    secondB = new Node<> (1);
    Node<Integer> secondC = new Node<> (3);
    Node<Integer> secondD = new Node<> (2);
    Node<Integer> secondE = new Node<> (4);
    Node<Integer> secondF = new Node<> (6);
    secondA.setRightChild (secondD);
    secondB.setLeftChild (secondE);
    secondE.setLeftChild (secondF);
    // - these should be equal
    testEqualBooleans (nodeA.equals(secondA), true);
    // - make a small change to a value
    secondD.setData (4);
    testEqualBooleans (nodeA.equals(secondA), false);
    secondD.setData (2); // put back the change
    // - try a small change to structure
    secondA.setRightChild(null);
    secondA.setLeftChild(secondD);
    testEqualBooleans (nodeA.equals(secondA), false);
}
}
