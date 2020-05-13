package pojo;

import interfaces.Speak;

//老师类，实现Speak接口
public class Teacher extends People implements Speak {
    private Double salary;

    public Teacher(String name, Integer age, Double salary) {
        super(name, age);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +super.toString()+
                "salary=" + salary +
                '}';
    }

    @Override
    public void say() {
        System.out.println(this.getName()+":上课");
    }
}
