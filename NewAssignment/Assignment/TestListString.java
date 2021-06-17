public class TestListString 
{
    public static Lists populateList(){
        Lists ls = new Lists ();
        asteroids ast1 = new asteroids ("Ceres", 1, true, "020221","7");
        asteroids ast2 = new asteroids("Pallas", 19, false, "090221","6" );
        asteroids ast3 = new asteroids ("Juno", 20, true, "120221","8");
        asteroids ast4 = new asteroids ("Flora", 4, true, "200221","7");
        asteroids ast5 = new asteroids ("Hygiea", 5, false, "000000","9");
        planets pl1 = new planets ("Mercury", 6, false, "000000","8");
        planets pl2 = new planets ("Venus", 7, true, "020221","8");
        planets pl3 = new planets ("Neptune", 8, false, "020221","7");
        planets pl4 = new planets ("Mars", 9, true, "020221","6");
        planets pl5 = new planets ("Jupiter", 10, false, "000000","5");
        galaxies gal1 = new galaxies ("Andromeda", 11, true, "120221","00011");
        galaxies gal2 = new galaxies ("Cigar", 12, false, "150321","00012");
        galaxies gal3 = new galaxies ("Cornet", 13, true, "290421","00013");
        galaxies gal4 = new galaxies ("Cosmos", 14, false, "060621","00014");
        galaxies gal5 = new galaxies ("Milky Way", 15, true, "070721","00015");
        nebulae neb1 = new nebulae ("Medusa", 16, true, "022121","00016");
        nebulae neb2 = new nebulae ("Helix", 17, false, "022121","00017");
        nebulae neb3 = new nebulae ("Skull", 18, true, "022121","00018");
        nebulae neb4 = new nebulae ("Oyster", 2, true, "022121","000002");
        nebulae neb5 = new nebulae ("Fetus", 3, true, "130521","00003");
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
    
    public static String[] getTitlesFromList(Lists ls){
        String[] titles = new String[ls.size()+1];
        System.out.println(ls.size());
        for (int i=0; i<=ls.size(); i++){
            titles[i] = ls.get(i).getName();
        }
        return titles;
    }
    
    public static void printList(Lists ls){
        for (int i=0; i<=ls.size(); i++){
            if (ls.get(i).Flag() == true){
                 System.out.println ("Item: " + ls.get(i).getId()+ ", " + ls.get(i).getName() + ", " + "yes" +", " + ls.get(i).getDate());
            } else {
                 System.out.println ("Item: " + ls.get(i).getId()+ ", " + ls.get(i).getName() + ", " + "no" +", " + ls.get(i).getDate());
            }
        }
        System.out.println(ls.size());
    }
    
    public static void testAdd (String[] args) 
    {
        Lists ls = populateList();
        String[] titles = getTitlesFromList(ls);
        printList(ls);
    }
    
    public static void testDelete (String[] args){
       Lists ls = populateList();
       printList(ls);
       String[] titles = getTitlesFromList(ls);
       int index = ls.binarySearch(titles, "Downey");
       ls.delete(index);
       printList(ls);
    }
}
