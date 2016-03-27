package za.ac.cput.malikah.malikah.Question_3.LSP.Correct;

/**
 * Created by Malikah Osmen on 2016-03-26.
 */
public class StudentValidation implements ValiadteStudentInterface{

    String name;
    String surname;
    int age;

    public boolean isStudent(){
        Student student = new Student(name,surname,age);

        if (student.getAge()==24){
            return true;
        } else{
            return false;
        }


    }
}
