public class TestListString 
{
 
    public static void main (String[] args) 
    {
        Lists ls = new Lists ();
        Cd cd1 = new Cd ("Greatest Hits", 1, true, "020221", "Bon Acord");
        Cd cd2 = new Cd ("Greatest Hits", 19, true, "020221", "Bon Acord");
        Cd cd3 = new Cd ("Greatest Hits", 20, true, "020221", "Bon Acord");
        Cd cd4 = new Cd ("Greatest Hits", 4, true, "020221", "Bon Acord");
        Cd cd5 = new Cd ("Greatest Hits", 5, true, "020221", "Bon Acord");
        Book book1 = new Book ("Greatest Hits", 6, false, "020221", "Bon Acord");
        Book book2 = new Book ("Greatest Hits", 7, true, "020221", "Bon Acord");
        Book book3 = new Book ("Greatest Hits", 8, true, "020221", "Bon Acord");
        Book book4 = new Book ("Greatest Hits", 9, true, "020221", "Bon Acord");
        Book book5 = new Book ("Greatest Hits", 10, false, "020221", "Bon Acord");
        Magazine magazine1 = new Magazine ("Greatest Hits", 11, true, "020221", "Bon Acord");
        Magazine magazine2 = new Magazine ("Greatest Hits", 12, true, "020221", "Bon Acord");
        Magazine magazine3 = new Magazine ("Greatest Hits", 13, true, "020221", "Bon Acord");
        Magazine magazine4 = new Magazine ("Greatest Hits", 14, true, "020221", "Bon Acord");
        Magazine magazine5 = new Magazine ("Greatest Hits", 15, true, "020221", "Bon Acord");
        Dvd dvd1 = new Dvd ("Die Hard", 16, true, "022121", "Bruce Willis");
        Dvd dvd2 = new Dvd ("Die Hard", 17, true, "022121", "Bruce Willis");
        Dvd dvd3 = new Dvd ("Die Hard", 18, true, "022121", "Bruce Willis");
        Dvd dvd4 = new Dvd ("Die Hard", 2, true, "022121", "Bruce Willis");
        Dvd dvd5 = new Dvd ("Die Hard", 3, true, "022121", "Bruce Willis");
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
        
        
        String availability;
        for (int i=0; i<=ls.size(); i++){
            
            if (ls.get(i).getOnLoan() == true){
                availability = "on loan";
            } else {
                availability = "available";
            }
            System.out.println ("Item: " + ls.get(i).getId()+ ", " + ls.get(i).getTitle() + ", " + availability +", " + ls.get(i).getTargetDate());
        }
    }
    
    
}
