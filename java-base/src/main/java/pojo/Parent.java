package pojo;

//父母
public class Parent extends People{
    private String job;

    public Parent(String name, Integer age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
