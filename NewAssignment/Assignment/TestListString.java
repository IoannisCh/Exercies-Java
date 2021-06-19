public class TestListString 
{
    public static ItemList populateList(){
        ItemList ls = new ItemList ();
        Asteroid ast1 = new Asteroid  ("Ceres", 1, true, "020221","7");
        Asteroid  ast2 = new Asteroid ("Pallas", 19, false, "090221","6" );
        Asteroid  ast3 = new Asteroid  ("Juno", 20, true, "120221","8");
        Asteroid  ast4 = new Asteroid  ("Flora", 4, true, "200221","7");
        Asteroid  ast5 = new Asteroid  ("Hygiea", 5, false, "000000","9");
        Planet pl1 = new Planet ("Mercury", 6, false, "000000","8");
        Planet pl2 = new Planet ("Venus", 7, true, "020221","8");
        Planet pl3 = new Planet ("Neptune", 8, false, "020221","7");
        Planet pl4 = new Planet ("Mars", 9, true, "020221","6");
        Planet pl5 = new Planet ("Jupiter", 10, false, "000000","5");
        Galaxy gal1 = new Galaxy ("Andromeda", 11, true, "120221","00011");
        Galaxy gal2 = new Galaxy ("Cigar", 12, false, "150321","00012");
        Galaxy gal3 = new Galaxy ("Cornet", 13, true, "290421","00013");
        Galaxy gal4 = new Galaxy ("Cosmos", 14, false, "060621","00014");
        Galaxy gal5 = new Galaxy ("Milky Way", 15, true, "070721","00015");
        Nebulae neb1 = new Nebulae ("Medusa", 16, true, "022121","00016");
        Nebulae neb2 = new Nebulae ("Helix", 17, false, "022121","00017");
        Nebulae neb3 = new Nebulae ("Skull", 18, true, "022121","00018");
        Nebulae neb4 = new Nebulae ("Oyster", 2, true, "022121","000002");
        Nebulae neb5 = new Nebulae ("Fetus", 3, true, "130521","00003");
        ls.join(ast1);
        ls.join(ast2);
        ls.join(ast3);
        ls.join(ast4);
        ls.join(ast5);
        ls.join(pl1);
        ls.join(pl2);
        ls.join(pl3);
        ls.join(pl4);
        ls.join(pl5);
        ls.join(gal1);
        ls.join(gal2);
        ls.join(gal3);
        ls.join(gal4);
        ls.join(gal5);
        ls.join(neb1);
        ls.join(neb2);
        ls.join(neb3);
        ls.join(neb4);
        ls.join(neb5);
        
        return ls;
    }
    
    public static String[] getTitlesFromList(ItemList ls){
        String[] titles = new String[ls.size()+1];
        System.out.println(ls.size());
        for (int i=0; i<=ls.size(); i++){
            titles[i] = ls.get(i).getName();
        }
        return titles;
    }
    
    public static void testAdd (String[] args) 
    {
        ItemList ls = populateList();
        String[] titles = getTitlesFromList(ls);
        ls.print();
    }
    
    public static void testDelete (String[] args){
       ItemList ls = populateList();
       ls.print();
       String[] titles = getTitlesFromList(ls);
       int index = ls.binarySearch(titles, "Downey");
       ls.delete(index);
       ls.print();
    }
}
