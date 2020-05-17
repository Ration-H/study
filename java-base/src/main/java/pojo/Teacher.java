package pojo;

//老师类
public class Teacher extends People{
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
}
