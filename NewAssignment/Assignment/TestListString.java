public class TestListString 
{
    public static Lists populateList(){
        Lists ls = new Lists ();
        asteroids ast1 = new asteroids ("Greatest Hits", 1, true, "020221");
        asteroids ast2 = new asteroids("Iron Maiden", 19, true, "090221" );
        asteroids ast3 = new asteroids ("British Steel", 20, true, "120221");
        asteroids ast4 = new asteroids ("Paranoid", 4, true, "200221");
        asteroids ast5 = new asteroids ("Manowar", 5, false, "000000");
        planets pl1 = new planets ("The Hobbit", 6, false, "000000");
        planets pl2 = new planets ("The Parrots theorem", 7, true, "020221");
        planets pl3 = new planets ("Practical C", 8, true, "020221");
        planets pl4 = new planets ("Linux Bible", 9, true, "020221");
        planets pl5 = new planets ("Think Java", 10, false, "000000");
        galaxies gal1 = new galaxies ("Astronomy Now", 11, true, "120221");
        galaxies gal2 = new galaxies ("Linux Format", 12, true, "150321");
        galaxies gal3 = new galaxies ("Linux Journal", 13, true, "290421");
        galaxies gal4 = new galaxies ("Mens Health", 14, true, "060621");
        galaxies gal5 = new galaxies ("National Geographic", 15, true, "070721");
        nebulae neb1 = new nebulae ("Die Hard", 16, true, "022121");
        nebulae neb2 = new nebulae ("Die Harder", 17, true, "022121");
        nebulae neb3 = new nebulae ("Leathal Weapon", 18, true, "022121");
        nebulae neb4 = new nebulae ("Terminator", 2, true, "022121");
        nebulae neb5 = new nebulae ("Robocop", 3, true, "130521");
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
