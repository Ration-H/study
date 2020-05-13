package pojo;


import service.Speak;

//学生类，实现Speak、Comparable
public class Student extends People implements Speak,Comparable<Student> {
    private Integer score;

    public Student(String name, Integer age, Integer score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public void say() {
        System.out.println("老师好");
    }

    @Override
    public int compareTo(Student o) {
        return o.score-this.score;
    }

    @Override
    public String toString() {
        return "Student{" +super.toString()+
                "score=" + score +
                '}';
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
