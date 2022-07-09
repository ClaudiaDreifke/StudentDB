package model;

import java.util.Objects;

public abstract class Student {

    private String name;
    private String id;
    private String subjectOfStudies;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void newFancyMethod();

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", subjectOfStudies='" + subjectOfStudies + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectOfStudies() {
        return subjectOfStudies;
    }

    public void setSubjectOfStudies(String subjectOfStudies) {
        this.subjectOfStudies = subjectOfStudies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
