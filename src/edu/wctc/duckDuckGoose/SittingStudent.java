package edu.wctc.duckDuckGoose;

public class SittingStudent extends Student {
    private SittingStudent left, right;

    public SittingStudent(String name, int age, Grade grade) {
        super(name, age, grade);
    }

    public SittingStudent getLeft() {
        return left;
    }

    public void setLeft(SittingStudent left) {
        this.left = left;
    }

    public SittingStudent getRight() {
        return right;
    }

    public void setRight(SittingStudent right) {
        this.right = right;
    }

    public boolean isGooseAndBecomesIt() {
        return Math.random() < .6;
    }

    public StandingStudent swap(StandingStudent it) {
        //Create a copy of the student who was sitting
        SittingStudent temp = copy();

        /* Replace the sitting student info with the one who was standing
           They won the chase and sat down
           So, their new left and right will be what the person was
           who was sitting there, so we don't change it
        */
        setName(it.getName());
        setAge(it.getAge());
        setGrade(it.getGrade());

        //Use the copy to set the new person who is it
        //They don't have a left or right
        it.setName(temp.getName());
        it.setAge(temp.getAge());
        it.setGrade(temp.getGrade());
        return it;
    }

    public SittingStudent copy() {
        SittingStudent newSittingStudent = new SittingStudent(getName(), getAge(), getGrade());
        newSittingStudent.setLeft(left);
        newSittingStudent.setRight(right);
        return newSittingStudent;
    }
}
