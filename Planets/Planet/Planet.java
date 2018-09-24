
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
    private boolean innerPlanet;
    private double astronomicalUnitsFromSun;
    private double earthMasses;

    /**
     * Constructor for objects of class Planet.
     * 
     * @param theName is the name of the Planet
     */
    public Planet(String theName, boolean theInnerPlanet, double theAstronomicalUnitsFromSun, double theEarthMasses){
        // initialise instance variables
        if(theName !=null){
            name = theName;
        }
        else {
            throw new IllegalArgumentException("Title cannot be null");
        }

        innerPlanet = theInnerPlanet;

        if(theAstronomicalUnitsFromSun > 0.0){
            astronomicalUnitsFromSun = theAstronomicalUnitsFromSun;
        }

        if(theEarthMasses > 0.0){
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

    public boolean getInnerPlanet(){
        return innerPlanet;
    }

    public double getAstronomicalUnitsFromSun(){
        return astronomicalUnitsFromSun;
    }

    public double getEarthMasses(){
        return earthMasses;
    }

    

    public Boolean isSimilarToEarth(){
        if((astronomicalUnitsFromSun <= 1.0)||(earthMasses <= 15.0)){
            return innerPlanet=true;
        }
        else {
            return innerPlanet=false;
        }
    }
    
    public String getPlanetaryData(){
        if(innerPlanet==true){
            return name + " is an inner planet, weighs " + earthMasses + " Earth masses, and is " + astronomicalUnitsFromSun + " AU from the sun.";
        }
        else{
            return name + " is an outer planet, weighs " + earthMasses + " Earth masses, and is " + astronomicalUnitsFromSun + " AU from the sun.";
        }
    }

}
