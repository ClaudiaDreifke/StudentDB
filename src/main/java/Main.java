import model.ComputerScienceStudent;
import model.Student;
import model.StudentDB;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ComputerScienceStudent student1 = new ComputerScienceStudent("Lisa", "890", "Java");
        ComputerScienceStudent student2 = new ComputerScienceStudent("Lena", "45", "Phyton");
        ComputerScienceStudent student3 = new ComputerScienceStudent("Tom", "856", "Java");
        ComputerScienceStudent student4 = new ComputerScienceStudent("Lars", "564", "C++");

        Map<String, Student> allStudents = new HashMap<>();
        StudentDB studentDB = new StudentDB(allStudents);

        studentDB.addStudent(student1);
        studentDB.addStudent(student2);
        studentDB.addStudent(student3);
        studentDB.addStudent(student4);

        System.out.println(studentDB.randomStudent(allStudents));

        studentDB.removeStudent(student1);

        System.out.println(studentDB);

        try {
            System.out.println(studentDB.findById("45"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
