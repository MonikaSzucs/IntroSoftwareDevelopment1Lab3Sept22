/**
 * Write a description of class car here.
 *
 * @author Monika
 * @version 1.0 September 22, 2018
 * The Book Class
 */
public class Book
{
    // instance variables - replace the example below with your own
    private String  title;
    private String  lastName;
    private int     yearPublished;
    private String  firstName;
    private boolean fiction;
    private double  weightKilograms;

    /**
     * Constructor for objects of class Book
     * 
     * @param theTitle is the title of the book
     * @param theLastName is the last name of the Author
     * @param theYearPublished is the year when the book was published
     * @param theFirstName is the first name of the Author
     * @param theFiction checks if the book is fiction or not
     * @param theWeightKilograms checks the weight of the book
     */
    public Book(String theTitle, String theLastName, int theYearPublished, String theFirstName, boolean theFiction, double theWeightKilograms)
    {
        if(theTitle != null){
            title = theTitle;
        }
        else {
            throw new IllegalArgumentException("Title Cannot Be Null!");
        }

        if(theLastName !=null){
            lastName = theLastName;
        }
        else{
            throw new IllegalArgumentException("The Last Name Cannot Be Null");
        }

        if((theYearPublished>=1455) && (theYearPublished<=2018)){
            yearPublished = theYearPublished;
        }
        else{
            throw new IllegalArgumentException("The Year Published is out of range");
        }

        if(theFirstName != null){
            firstName = theFirstName;
        }
        else{
            throw new IllegalArgumentException("The First Name Cannot Be Null");
        }

        fiction = theFiction;

        if (!((theWeightKilograms <=0.0) || (theWeightKilograms >10.0))){
            weightKilograms = theWeightKilograms; 
        }
        else{
            throw new IllegalArgumentException("The Weight of the book is too small or too large");
        }
    }

    /**
     * The accessor for the title of the book
     * 
     * @return the title of the book
     */
    public String getTitle(){
        return title;
    }

    /**
     * The mutator method for the title
     * 
     * @param theTitle for the title of the book
     * @return the title of the book which is a String
     */
    public void setTitle(String theTitle){
        if(theTitle !=null){
            title = theTitle;
        }
        else{
            throw new IllegalArgumentException("Title Cannot Be Null!");
        }
    }

    /**
     * The accessor for the Last Name of the Author of the book
     * 
     * @return the last name of the author of the book
     */
    public String getLastName(){
        return lastName;
    }

    /**
     * The mutator method for the last name of the author
     * 
     * @param theLastName for the last name of the author of the book
     * @return the last name of the author of the book which is a string
     */
    public void setLastName(String theLastName){
        if(theLastName !=null){
            lastName = theLastName;
        }
        else{
            throw new IllegalArgumentException("The Last Name Cannot Be Null");
        }
    }

    /**
     * The accessor for the year published of the book
     * 
     * @return the year published of the book
     */
    public int getYearPublished(){
        return yearPublished;
    }

    /**
     * The mutator method for the year published for the book
     * 
     * @param theYearPublished for the year the book was published
     * @return the year published of the book as a int
     */
    public void setYearPublished(int theYearPublished){
        if((theYearPublished>=1455) && (theYearPublished<=2018)){
            yearPublished = theYearPublished;
        }
        else{
            throw new IllegalArgumentException("The Year Published is out of range");
        }
    }

    /**
     * The accessor for the First Name of the Author of the book
     * 
     * @return the first name of the author of the book
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * The mutator method for the first name of the author
     * 
     * @param theFirstName for the last name of the author of the book
     * @return the first name of the author of the book which is a string
     */
    public void setFirstName(String theFirstName){
        if(theFirstName != null){
            firstName = theFirstName;
        }
        else{
            throw new IllegalArgumentException("The First Name Cannot Be Null");
        }
    }

    /**
     * The accessor for if the book is fiction
     * 
     * @return if the book is fiction
     */
    public boolean getFiction(){
        return fiction;
    }

    /**
     * The mutator method to check if the book is fiction
     * 
     * @param theFiction for checking if it is fiction
     * @return if the book is fiction or not in boolean
     */
    public void setFiction(boolean theFiction){
        fiction = theFiction;
    }

    /**
     * The accessor for checking the weight in kilograms of the book
     * 
     * @return the weight of the book in kilograms
     */
    public double getWeightKilograms(){
        return weightKilograms;
    }

    /**
     * The mutator method to check if the book is not negative or more than 10kg
     * 
     * @param theWeightKilograms for checking the weight must not be negative or more than 10kg
     * @return if the book is fiction or not in boolean
     */
    public void setWeightKilograms(double theWeightKilograms){
        if (!((theWeightKilograms <=0.0) || (theWeightKilograms >10.0))){
            weightKilograms = theWeightKilograms;
        }
        else{
            throw new IllegalArgumentException("The Weight of the book is too small or too large"); 
        }
    }
}