package edu.wctc.duckDuckGoose;

public class Student extends Human {
    private Grade grade;


    public Student(String name, int age, Grade grade) {
        super(name, age);
        this.grade = grade;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return super.toString() + ", grade " + grade;
    }
}
