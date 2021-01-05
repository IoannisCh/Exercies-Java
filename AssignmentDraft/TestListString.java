public class TestListString 
{
    public static Lists populateList(){
        Lists ls = new Lists ();
        Cd cd1 = new Cd ("Greatest Hits", 1, true, "020221", "Bon Acord", "cd");
        Cd cd2 = new Cd ("Iron Maiden", 19, true, "090221", "Iron Maiden", "cd");
        Cd cd3 = new Cd ("British Steel", 20, true, "120221", "Judas Priest","cd");
        Cd cd4 = new Cd ("Paranoid", 4, true, "200221", "Black Sabbath","cd");
        Cd cd5 = new Cd ("Manowar", 5, false, "000000", "Manowar", "cd");
        Book book1 = new Book ("The Hobbit", 6, false, "000000", "Tolkien", "book");
        Book book2 = new Book ("The Parrots theorem", 7, true, "020221", "Guedj", "book");
        Book book3 = new Book ("Practical C", 8, true, "020221", "O'Rilley", "book");
        Book book4 = new Book ("Linux Bible", 9, true, "020221", "Negus", "book");
        Book book5 = new Book ("Think Java", 10, false, "000000", "Downey", "book");
        Magazine magazine1 = new Magazine ("Astronomy Now", 11, true, "120221", "Pole Star", "magazine");
        Magazine magazine2 = new Magazine ("Linux Format", 12, true, "150321", "Mohr", "magazine");
        Magazine magazine3 = new Magazine ("Linux Journal", 13, true, "290421", "Phil Hughes", "magazine");
        Magazine magazine4 = new Magazine ("Mens Health", 14, true, "060621", "Richard Dorment", "magazine");
        Magazine magazine5 = new Magazine ("National Geographic", 15, true, "070721", "Susan Goteberg", "magazine");
        Dvd dvd1 = new Dvd ("Die Hard", 16, true, "022121", "Stan Lee", "dvd");
        Dvd dvd2 = new Dvd ("Die Harder", 17, true, "022121", "Bruce Willis", "dvd");
        Dvd dvd3 = new Dvd ("Leathal Weapon", 18, true, "022121", "Stanley Kubrik", "dvd");
        Dvd dvd4 = new Dvd ("Terminator", 2, true, "022121", "Michael Bay", "dvd");
        Dvd dvd5 = new Dvd ("Robocop", 3, true, "130521", "Georgios Koufos", "dvd");
        ls.join(cd1);
        ls.join(cd2);
        ls.join(cd3);
        ls.join(cd4);
        ls.join(cd5);
        ls.join(book1);
        ls.join(book2);
        ls.join(book3);
        ls.join(book4);
        ls.join(book5);
        ls.join(magazine1);
        ls.join(magazine2);
        ls.join(magazine3);
        ls.join(magazine4);
        ls.join(magazine5);
        ls.join(dvd1);
        ls.join(dvd2);
        ls.join(dvd3);
        ls.join(dvd4);
        ls.join(dvd5);
        
        return ls;
    }
    
    public static String[] getTitlesFromList(Lists ls){
        String[] titles = new String[ls.size()+1];
        System.out.println(ls.size());
        for (int i=0; i<=ls.size(); i++){
            titles[i] = ls.get(i).getTitle();
        }
        return titles;
    }
    
    public static void printList(Lists ls){
        for (int i=0; i<=ls.size(); i++){
            if (ls.get(i).getOnLoan() == true){
                 System.out.println ("Item: " + ls.get(i).getId()+ ", "+ ls.get(i).getType() + ", " + ls.get(i).getTitle() + ", " + "yes" +", " + ls.get(i).getTargetDate());
            } else {
                 System.out.println ("Item: " + ls.get(i).getId()+ ", "+ ls.get(i).getType() + ", " + ls.get(i).getTitle() + ", " + "no" +", " + ls.get(i).getTargetDate());
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
       int index = ls.binarySearch(titles, "a");
       ls.delete(index);
       printList(ls);
    }
    
    
}
