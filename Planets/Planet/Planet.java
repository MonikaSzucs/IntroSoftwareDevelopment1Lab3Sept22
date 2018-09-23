
/**
 * Write a description of class Planet here.
 *
 * @author Monika Szucs
 * @version September 23, 2018
 * 
 * This is the Planet class.
 * 
 */
public class Planet
{
    // instance variables
    private String name;
    //private boolean innerPlanet;
    private double astronomicalUnitsFromSun;
    private double earthMasses;

    /**
     * Constructor for objects of class Planet.
     * 
     * @param theName is the name of the Planet
     */
    public Planet(String theName, double theAstronomicalUnitsFromSun, double theEarthMasses){
        // initialise instance variables
        if(theName !=null){
            name = theName;
        }
        else {
            throw new IllegalArgumentException("Title cannot be null");
        }
        
        if(theAstronomicalUnitsFromSun < 1.0){
            astronomicalUnitsFromSun = theAstronomicalUnitsFromSun;
        }
        
        if(theEarthMasses < 15.0){
            earthMasses = theEarthMasses;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    public void setName(String theName){
        if(theName !=null){
            name = theName;
        }
        else {
            throw new IllegalArgumentException("Title cannot be null");
        }
    }
    
    public double getAstronomicalUnitsFromSun(){
        return astronomicalUnitsFromSun;
    }
    
    public void setAstronomicalUnitsFromSun(double theAstronomicalUnitsFromSun){
        if(theAstronomicalUnitsFromSun < 1.0){
            astronomicalUnitsFromSun = theAstronomicalUnitsFromSun;
        }
        
    }
    
    public double getEarthMasses(){
        return earthMasses;
    }
    
    public void setEarthMasses(double theEarthMasses){
        if(theEarthMasses < 15.0){
            earthMasses = theEarthMasses;
        }
    }
    
}
