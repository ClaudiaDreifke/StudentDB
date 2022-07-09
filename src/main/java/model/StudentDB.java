package model;

import java.util.Arrays;

public class StudentDB {

    Student[] studentArray;

    public StudentDB(Student[] studentArray) {
        this.studentArray = studentArray;
    }

    public Student[] getAllStudents(){
        return studentArray;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "studentArray=" + Arrays.toString(studentArray) +
                '}';
    }

    public Student randomStudent(Student[] studentArray) {
        int randomIndex = (int) (studentArray.length * Math.random());
        return studentArray[randomIndex];
    }

    public void addStudent(Student student) {
        int length = studentArray.length;
        Student[] updatedStudentArray = new Student[length + 1];
        for (int i = 0; i < length; i++) {
            updatedStudentArray[i] = studentArray[i];
        }
        updatedStudentArray[length - 1] = student;
        studentArray = updatedStudentArray;
    }

    // removeStudent() funktioniert nicht :(
    public void removeStudent(Student student) {
        int length = studentArray.length;
        for (int i = 0; i < length; i++) {
            if (studentArray[i].equals(student)) {
                Student[] updatedStudentArray = new Student[length - 1];
                for (int j = 0; j < (length - 1); j++) {
                    if (j != i) {
                        updatedStudentArray[j] = studentArray[i];
                    }
                }
                studentArray = updatedStudentArray;
            }
        }

    }
}