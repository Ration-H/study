import common.MyEnum;
import common.MyException;
import org.junit.Test;
import pojo.Student;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class Test2 {

    @Test//Checked Exception，必须处理
    public void Test2() {
        try {
            FileReader fileReader = new FileReader("d:/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test//Runtime Exception
    public void Test3() {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(null);
        try {
            studentList.get(0).getScore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test//自定义异常
    public void Test4() {
        List<Student> studentList = new ArrayList<Student>();
        Student student = new Student("A", 20, -10);

        try {
            if(student.getScore()<0){//成绩异常
            throw new MyException(MyEnum.DATA_EXCEPTION);
            }
            studentList.add(student);
            System.out.println("学生信息："+studentList);

        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("状态码："+e.getMyEnum().getCode()+" 错误信息："+e.getMyEnum().getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
