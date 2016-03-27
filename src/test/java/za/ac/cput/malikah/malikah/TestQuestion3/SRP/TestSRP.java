package za.ac.cput.malikah.malikah.TestQuestion3.SRP;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.malikah.Question_3.SRP.correct.Rectangle;

/**
 * Created by Malikah Osmen on 2016-03-27.
 */
public class TestSRP {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testArea() throws Exception {
        Rectangle rect = new Rectangle(5,5);

        Assert.assertEquals(25, rect.area(5,5),.0);
        System.out.println(""+rect.toString());
        System.out.println("Area of the rectangle with length = 5 and width = 5 : "+rect.area(5,5));

    }

    /*@Test
    public void testViolate() {

        Assert.assertEquals("John", emp.emp(document));
    }*/
}
