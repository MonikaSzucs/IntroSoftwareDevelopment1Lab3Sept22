
/**
 * Write a description of class Main here.
 *
 * @author Monika Szucs
 * @version September 23, 2018
 */
public class Main
{
    /**
     * The main entry to the planets information.
     * 
     * 8 new objects created for the solar system.
     * 
     */
    public static void main(String[] args){
        Planet p1 = new Planet("Mercury", false, 0.4, 0.055);
        Planet p2 = new Planet("Venus", false, 0.7, 0.815);
        Planet p3 = new Planet("Earth", false, 1.0, 1.0);
        Planet p4 = new Planet("Mars",false, 1.5, 1.07);
        Planet p5 = new Planet("Jupiter", false, 5.2, 318.0);
        Planet p6 = new Planet("Saturn",false, 9.5, 95.0);
        Planet p7 = new Planet("Uranus",false, 19.2, 14.0);
        Planet p8 = new Planet("Neptune",false, 30.1, 17.0);
        
        String name1 = p1.getName();
        boolean s1 = p1.isSimilarToEarth();
        double aU1 = p1.getAstronomicalUnitsFromSun();
        double earthMasses1 = p1.getEarthMasses();
        String planetData1 = p1.getPlanetaryData();
        
        String name2 = p2.getName();
        boolean s2 = p2.isSimilarToEarth();
        double aU2 = p2.getAstronomicalUnitsFromSun();
        double earthMasses2 = p2.getEarthMasses();
       
        String name3 = p3.getName();
        boolean s3 = p3.isSimilarToEarth();
        double aU3 = p3.getAstronomicalUnitsFromSun();
        double earthMasses3 = p3.getEarthMasses();
        
        String name4 = p4.getName();
        boolean s4 = p4.isSimilarToEarth();
        double aU4 = p4.getAstronomicalUnitsFromSun();
        double earthMasses4 = p4.getEarthMasses();
        
        String name5 = p5.getName();
        boolean s5 = p5.isSimilarToEarth();
        double aU5 = p5.getAstronomicalUnitsFromSun();
        double earthMasses5 = p5.getEarthMasses();
        String planetData5 = p5.getPlanetaryData();
        
        String name6 = p6.getName();
        boolean s6 = p6.isSimilarToEarth();
        double aU6 = p6.getAstronomicalUnitsFromSun();
        double earthMasses6 = p6.getEarthMasses();
        
        String name7 = p7.getName();
        boolean s7 = p7.isSimilarToEarth();
        double aU7 = p7.getAstronomicalUnitsFromSun();
        double earthMasses7 = p7.getEarthMasses();
        
        String name8 = p8.getName();
        boolean s8 = p8.isSimilarToEarth();
        double aU8 = p8.getAstronomicalUnitsFromSun();
        double earthMasses8 = p8.getEarthMasses();
        String planetData8 = p8.getPlanetaryData();
        
        System.out.println(planetData1);
        System.out.println(name2 + " is an " + s2 + " , weighs " + earthMasses2 + " Earth masses, and is " + aU2 + " AU from the Sun.");
        System.out.println(name3 + " is an " + s3 + " , weighs " + earthMasses3 + " Earth masses, and is " + aU3 + " AU from the Sun.");
        System.out.println(name4 + " is an " + s4 + " , weighs " + earthMasses4 + " Earth masses, and is " + aU4 + " AU from the Sun.");
        System.out.println(planetData5);
        System.out.println(name6 + " is an " + s6 + " , weighs " + earthMasses6 + " Earth masses, and is " + aU6 + " AU from the Sun.");
        System.out.println(name7 + " is an " + s7 + " , weighs " + earthMasses7 + " Earth masses, and is " + aU7 + " AU from the Sun.");
        System.out.println(planetData8);
        
    }
}
