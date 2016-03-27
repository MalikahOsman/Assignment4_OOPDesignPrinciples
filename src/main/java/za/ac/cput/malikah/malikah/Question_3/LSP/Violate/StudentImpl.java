package za.ac.cput.malikah.malikah.Question_3.LSP.Violate;

/**
 * Created by Aphish on 2016/03/27.
 */
public class StudentImpl implements StudentInterface{
    String name;
    String surname;
    int age;

    public Student getStudent(){
        Student student = new Student(name,surname,age);
        return  student;
    }


}
