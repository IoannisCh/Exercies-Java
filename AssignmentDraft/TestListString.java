public class TestListString 
{
    public static Lists populateList(){
        Lists ls = new Lists ();
        Cd cd1 = new Cd ("Greatest Hits", 1, true, "020221", "Bon Acord", "cd");
        Cd cd2 = new Cd ("Iron Maiden", 19, true, "020221", "Iron Maiden", "cd");
        Cd cd3 = new Cd ("British Steel", 20, true, "020221", "Judas Priest","cd");
        Cd cd4 = new Cd ("Paranoid", 4, true, "020221", "Black Sabbath","cd");
        Cd cd5 = new Cd ("Manowar", 5, true, "020221", "Manowar", "cd");
        Book book1 = new Book ("Greatest Hits", 6, false, "000000", "Bon Acord", "book");
        Book book2 = new Book ("Greatest Hits", 7, true, "020221", "Bon Acord", "book");
        Book book3 = new Book ("Greatest Hits", 8, true, "020221", "Bon Acord", "book");
        Book book4 = new Book ("Greatest Hits", 9, true, "020221", "Bon Acord", "book");
        Book book5 = new Book ("Greatest Hits", 10, false, "000000", "Bon Acord", "book");
        Magazine magazine1 = new Magazine ("Greatest Hits", 11, true, "020221", "Bon Acord", "magazine");
        Magazine magazine2 = new Magazine ("Greatest Hits", 12, true, "020221", "Bon Acord", "magazine");
        Magazine magazine3 = new Magazine ("Greatest Hits", 13, true, "020221", "Bon Acord", "magazine");
        Magazine magazine4 = new Magazine ("Greatest Hits", 14, true, "020221", "Bon Acord", "magazine");
        Magazine magazine5 = new Magazine ("Greatest Hits", 15, true, "020221", "Bon Acord", "magazine");
        Dvd dvd1 = new Dvd ("Die Hard", 16, true, "022121", "Bruce Willis", "dvd");
        Dvd dvd2 = new Dvd ("Die Hard", 17, true, "022121", "Bruce Willis", "dvd");
        Dvd dvd3 = new Dvd ("Die Hard", 18, true, "022121", "Bruce Willis", "dvd");
        Dvd dvd4 = new Dvd ("Die Hard", 2, true, "022121", "Bruce Willis", "dvd");
        Dvd dvd5 = new Dvd ("Die Hard", 3, true, "022121", "Bruce Willis", "dvd");
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
    
    public static void printList(Lists ls){
        for (int i=0; i<=ls.size(); i++){
            if (ls.get(i).getOnLoan() == true){
                 System.out.println ("Item: " + ls.get(i).getId()+ ", "+ ls.get(i).getType() + ", " + ls.get(i).getTitle() + ", " + "yes" +", " + ls.get(i).getTargetDate());
            } else {
                 System.out.println ("Item: " + ls.get(i).getId()+ ", "+ ls.get(i).getType() + ", " + ls.get(i).getTitle() + ", " + "no" +", " + ls.get(i).getTargetDate());
            }
            
        }
    }
    
    public static void testAdd (String[] args) 
    {
        Lists ls = populateList();
        printList(ls);
    }
    
    public static void testDelete (String[] args){
       Lists ls = populateList(); 
       ls.delete(6);
       printList(ls);
    }
    
    
}
