
/**
 * Write a description of class Main here.
 *
 * @author Monika
 * @version September 22, 2018
 */
public class Main
{

    /**
     * The main entry to the book
     * 
     * A new book object has been created b1
     * 
     */ 
    public static void main(String[] args){
        Book b1 = new Book("Harry Potter","Rowling",1997, "JK", true, 5.0);

        int years = 2017 - b1.getYearPublished();
        String titles = b1.getTitle();
        int yearsPublished = b1.getYearPublished();

        System.out.println(titles + " is " + years + " years old today, published in " + yearsPublished);
    }
}
