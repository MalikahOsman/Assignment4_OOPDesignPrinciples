package za.ac.cput.malikah.malikah.TestQuestion2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.malikah.Question2.Cylinder;

/**
 * Created by Malikah Osmen on 2016-03-27.
 */
public class TestComposition {
    @Before
    public void setUp() throws Exception {
        System.out.println("A Cylinder 'has a' Circle as its base. ");
        System.out.println("Calculating Volume of cylinder");
    }

    @Test
    public void testComposition() throws Exception {
        Cylinder cyl = new Cylinder();

       Assert.assertEquals(392.5, cyl.volume(5,5),.0);
        System.out.println("Surface Area : "+cyl.surfaceArea(5,5));
        System.out.println("Volume : "+cyl.volume(5,5));
    }
}
