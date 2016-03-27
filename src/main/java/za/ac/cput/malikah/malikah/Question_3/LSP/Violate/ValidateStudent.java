package za.ac.cput.malikah.malikah.Question_3.LSP.Violate;

/**
 * Created by Aphish on 2016/03/27.
 */
public class ValidateStudent implements IsStudentInterface {

    String name;
    String surname;
    int age;

    public boolean isStudent(Student student) {

        student = new Student(name,surname,age);

        if (student.getAge()==24){
            return true;
        }else{
            return false;
        }
    }
}
