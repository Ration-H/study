import pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        //学生集合
        List<Student> studentList = new ArrayList<Student>();

        //Error异常
        try {
            while (true){//无限制添加学生
                studentList.add(new Student("A", 18, 100));
            }
        } catch (Error e) {
           // System.out.println(studentList);
            e.printStackTrace();
        }

    }
}
