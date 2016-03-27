package za.ac.cput.malikah.malikah.Question_3.OCP.Violate;

/**
 * Created by Aphish on 2016/03/27.
 */
public class LecturerImpl implements PersonInterface{
    String name;
    String surname;
    int age;
    public Person getPersonDescription(){
        Person lecturer = new Person(name,surname,age);

        return lecturer;
    }
}
