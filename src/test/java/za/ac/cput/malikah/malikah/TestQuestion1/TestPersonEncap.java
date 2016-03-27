package za.ac.cput.malikah.malikah.TestQuestion1;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.malikah.Question1.Person;

import static org.junit.Assert.assertEquals;

/**
 * Created by Malikah Osmen on 2016-03-25.
 */
public class TestPersonEncap {

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testPerson() throws Exception {

        Person p1 = new Person();
        p1.setName("Malikah");
        p1.setIdNum("9412160000001");
        p1.setAge(21);
        p1.setCareer("Information Technology");


        System.out.println(""+p1.toString());

        Person p2 = new Person("Gouwa", "2103880002001", 28, "Chef");
        System.out.println(""+p2.toString());
        Assert.assertNotSame(p1,p2);
    }



}
