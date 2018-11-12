/**
 * Definition of a Book
 * 
 *  @author Mike Mulder
 *  @version 1.0
 */

public class Book
{
    private String  title;
    private String  authorFirstName;
    private String  authorLastName;
    private int     yearPublished;
    private boolean isFiction;
    private double  weightKg;

    /**
     * Create a new Book object with specific attributes.
     * 
     * @param title           The book's title
     * @param authorFirstName The author's first name
     * @param authorLastName  The author's last name
     * @param yearPublished   Year the book was last published
     * @param isFiction       Whether the book is fiction (true) or non-fiction
     * @param weightKg        The shipping weight of the book (Kg)
     */
    public Book (String title, 
                 String authorFirstName, 
                 String authorLastName,
                 int yearPublished, 
                 boolean isFiction, 
                 double weightKg)
    {
        if(title != null) {
            this.title = title;
        }else{
            throw new IllegalArgumentException("Title must not be null");
        }

        if(authorFirstName != null) {
            this.authorFirstName = authorFirstName;
        }else{
            throw new IllegalArgumentException("Author First Name must not be null");
        }
        
        if(authorLastName != null) {
            this.authorFirstName = authorFirstName;
        }else{
            throw new IllegalArgumentException("Author Last Name must not be null");
        }

        if(yearPublished >= 1455 && yearPublished <= 2018) {
            this.yearPublished = yearPublished;
        }else{
            throw new IllegalArgumentException("Year published must be between 1455 and 2018 (inclusive)");
        }

        // Whether the book is fiction (true) or non-fiction (false)
        this.isFiction = isFiction;

        if(weightKg >=0.0 && weightKg <= 10.0){
            this.weightKg = weightKg;
        }else{
            throw new IllegalArgumentException("Weight must be between 0.0 and 10.0 (inclusive)");
        }
    }
}



