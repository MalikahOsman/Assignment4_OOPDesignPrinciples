package za.ac.cput.malikah.malikah.TestQuestion1;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.malikah.Question1.Circle;
import za.ac.cput.malikah.malikah.Question1.Cylinder;

import static org.junit.Assert.assertEquals;

/**
 * Created by Malikah Osmen on 2016-03-25.
 */
public class TestInheritance {

    @Before
    public void setUp() throws Exception {
        System.out.println("Setting up and testing Iheritance with Circle and Cylinder.");

    }

    @Test
    public void testCircle() throws Exception {
        Circle circle1 = new Circle();
        System.out.println("Area of the circle with radius 5 is "+circle1.area(5));
        assertEquals(10,circle1.diameter(5),0.0);
        assertEquals(31.4,circle1.circumference(5),0.1);
        assertEquals(78.5,circle1.area(5),0.0);

    }

    @Test
    public void testCylinder() throws Exception {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Surface Area of the cylinder with radius 5 is and height 6 is "+cylinder1.surfaceArea(5,6));
        assertEquals(345.4,cylinder1.surfaceArea(5,6),0);
        assertEquals(471.0,cylinder1.volume(5,6),0);


    }


}
