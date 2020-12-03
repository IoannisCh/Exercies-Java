
/**
 * Write a description of class Graph here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Graph<T>
{
    List<GNode<T>> nodes;
    
    public Graph () {
        nodes = new List<GNode<T>> ();
    }
    
    public GNode<T> addNode (T value){
        GNode<T> newNode = new GNode<> (value);
        nodes.join (newNode);
        return newNode;
    }
    
    public void addUndirectedLink (GNode<T> from, GNode<T> to){
        from.addLink (to);
        to.addLink (from);
    }
    
    public int size () {
        if (nodes.size () > 0) { // <1>
            return nodes.get(0).countNodes (new List<GNode<T>> ());
        } else {
            return 0;
        }
    }
    
    public boolean isConnecte (){
        return (size() == nodes.size());
    }
    
    public boolean isConnected(){
        return (size () == nodes.size());
    }
}
