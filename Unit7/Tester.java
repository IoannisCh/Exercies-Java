
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main (String[] args){
        SortedNode<Integer> nodeA = new SortedNode<> (7);
        SortedNode<Integer> nodeB = new SortedNode<> (4);
        SortedNode<Integer> nodeC = new SortedNode<> (9);
        SortedNode<Integer> nodeD = new SortedNode<> (2);
        SortedNode<Integer> nodeE = new SortedNode<> (6);
        
        nodeA.setleftChild (nodeB);
        nodeA.setrightChild (nodeC);
        nodeB.setleftChild (nodeD);
        nodeB.setlightChild (nodeE);
        
        System.out.println ("Searched for " + 1 + " got " + nodeA.find(1));
        System.out.println ("Searched for " + 4 + " got " + nodeA.find(4));
    }
}
