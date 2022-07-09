import model.ComputerScienceStudent;
import model.Student;
import model.StudentDB;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        ComputerScienceStudent student1 = new ComputerScienceStudent("Lisa", "890", "Java");
        ComputerScienceStudent student2 = new ComputerScienceStudent("Lena", "45", "Phyton");
        ComputerScienceStudent student3 = new ComputerScienceStudent("Tom", "856", "Java");
        ComputerScienceStudent student4 = new ComputerScienceStudent("Lars", "564", "C++");

        Student [] studentArray = {student1,student2, student3};

        StudentDB studentDB = new StudentDB(studentArray);

        System.out.println(studentDB.randomStudent(studentArray));

        studentDB.addStudent(student4);

        System.out.println(studentDB.toString());
        System.out.println(studentArray.toString());

       // studentDB.removeStudent(student1);

        student1.newFancyMethod();


    }
}
