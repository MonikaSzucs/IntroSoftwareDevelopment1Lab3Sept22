
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
        Planet p1 = new Planet("Mercury",0.39, 0.0553);
        Planet p2 = new Planet("Venus",0.723, 0.815);
        Planet p3 = new Planet("Earth",1.0, 1.0);
        Planet p4 = new Planet("Mars",1.524, 1.07);
        Planet p5 = new Planet("Jupiter",5.203, 318.0);
        Planet p6 = new Planet("Saturn",9.539, 95.2);
        Planet p7 = new Planet("Uranus",19.18, 14.5);
        Planet p8 = new Planet("Neptune",30.06, 17.1);
        
        String name1 = p1.getName();
        double aU1 = p1.getAstronomicalUnitsFromSun();
        double earthMasses1 = p1.getEarthMasses();
        
        String name2 = p2.getName();
        double aU2 = p2.getAstronomicalUnitsFromSun();
        double earthMasses2 = p2.getEarthMasses();
       
        String name3 = p3.getName();
        double aU3 = p3.getAstronomicalUnitsFromSun();
        double earthMasses3 = p3.getEarthMasses();
        
        String name4 = p4.getName();
        double aU4 = p4.getAstronomicalUnitsFromSun();
        double earthMasses4 = p4.getEarthMasses();
        
        String name5 = p5.getName();
        double aU5 = p5.getAstronomicalUnitsFromSun();
        double earthMasses5 = p5.getEarthMasses();
        
        String name6 = p6.getName();
        double aU6 = p6.getAstronomicalUnitsFromSun();
        double earthMasses6 = p6.getEarthMasses();
        
        String name7 = p7.getName();
        double aU7 = p7.getAstronomicalUnitsFromSun();
        double earthMasses7 = p7.getEarthMasses();
        
        String name8 = p8.getName();
        double aU8 = p8.getAstronomicalUnitsFromSun();
        double earthMasses8 = p8.getEarthMasses();
        
        System.out.println(name1 + " is an outer planet, weighs " + earthMasses1 + " Earth masses, and is " + aU1 + " AU from the Sun.");
        System.out.println(name2 + " is an outer planet, weighs " + earthMasses2 + " Earth masses, and is " + aU2 + " AU from the Sun.");
        System.out.println(name3 + " is an outer planet, weighs " + earthMasses3 + " Earth masses, and is " + aU3 + " AU from the Sun.");
        System.out.println(name4 + " is an outer planet, weighs " + earthMasses4 + " Earth masses, and is " + aU4 + " AU from the Sun.");
        System.out.println(name5 + " is an outer planet, weighs " + earthMasses5 + " Earth masses, and is " + aU5 + " AU from the Sun.");
        System.out.println(name6 + " is an outer planet, weighs " + earthMasses6 + " Earth masses, and is " + aU6 + " AU from the Sun.");
        System.out.println(name7 + " is an outer planet, weighs " + earthMasses7 + " Earth masses, and is " + aU7 + " AU from the Sun.");
        System.out.println(name8 + " is an outer planet, weighs " + earthMasses8 + " Earth masses, and is " + aU8 + " AU from the Sun.");
    }
}
