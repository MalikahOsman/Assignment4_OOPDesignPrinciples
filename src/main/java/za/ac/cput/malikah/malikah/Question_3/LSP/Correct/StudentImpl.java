package za.ac.cput.malikah.malikah.Question_3.LSP.Correct;

/**
 * Created by Malikah Osmen on 2016-03-26.
 */
public class StudentImpl implements StudentInterface{

    String name;
    String surname;
    int age;

    public Student getStudent(){
        Student student = new Student(name,surname,age);

        return student;
    }
}
