
/**
 * Write a description of class SortedTree here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SortedTree<T extends Comparable<T>>
{
  private SortedNode<T> root;
  
  public SortedTree (){
      root = null;
  }
  
  public boolean contains (T key){
      return root.contains(key);
  }
  
  public void add (T key){
      if (root == null) {
          root = new SortedNode<T> (key);
      } else {
          root.insert (key);
      }
  }
  
  public void showTree(){
      root.prettyPrint("");
  }
  
  public static void main (String[] args){
      SortedTree<String> tree = new SortedTree<> ();
      
      tree.add ("Tree");
      tree.add ("Cat");
      tree.add ("Apple");
      tree.add ("Aardvark");
      tree.add ("Banana");
      
      System.out.println ("Tree contains apple? " + tree.contains("Apple");
      System.out.println(("Tree contains orange?" + tree.contains("Orange"));
      
      tree.showTree();
  }
    
  public int size (){
      return root.countNodes();
  }  
}
