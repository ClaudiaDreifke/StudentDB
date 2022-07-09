package model;

import java.util.*;

public class StudentDB {

    Map<String, Student> allStudents = new HashMap<>();

    public StudentDB(Map<String, Student> allStudents) {
        this.allStudents = allStudents;
    }


    @Override
    public String toString() {
        return "StudentDB{" +
                "allStudents=" + allStudents +
                '}';
    }

    public Student randomStudent(Map<String, Student> allStudents) {
        List<String> keyList = new ArrayList<>(allStudents.keySet());
        String randomKey = keyList.get((int) (Math.random()* keyList.size()));
        return allStudents.get(randomKey);
    }

    public void addStudent(Student student) {
        allStudents.put(student.getId(), student);
    }

    public void removeStudent(Student student) {
        allStudents.remove(student.getId(), student);

    }

    public Map<String, Student> getAllStudents() {
        return allStudents;
    }
}