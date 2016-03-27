package za.ac.cput.malikah.malikah.TestQuestion3.DIP;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.omg.PortableServer.AdapterActivator;
import za.ac.cput.malikah.malikah.Question_3.DIP.Admin;
import za.ac.cput.malikah.malikah.Question_3.DIP.IPerson;
import za.ac.cput.malikah.malikah.Question_3.DIP.Lecturer;
import za.ac.cput.malikah.malikah.Question_3.DIP.Student;

import static junit.framework.Assert.assertSame;

/**
 * Created by Malikah Osmen on 2016-03-27.
 */
public class TestDIP {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testCorrect() throws Exception {
        Admin a = new Admin();
        Student s = new Student();

        assertSame("Study and graduate", s.job());

    }

    @Test
    public void testViolate() throws Exception {
        Admin a = new Admin();
        Lecturer l = new Lecturer();

        assertSame("Lecture, make students pass", l.job());
    }
}
