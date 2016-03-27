package za.ac.cput.malikah.malikah.Question_3.DIP;

/**
 * Created by Malikah Osmen on 2016-03-27.
 */
public class Admin {
    IPerson person;

    public void setPerson(IPerson p)
    {
        person = p;
    }

    public void administration()
    {
        person.job();
    }
}
