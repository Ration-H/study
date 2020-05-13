import pojo.Student;
import utils.MyException;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("Duplicates")
public class Test2 {
    public static void main(String[] args) {
        //学生集合
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(null);

//        //Error异常
//        try {
//            while (true){//添加10个学生
//                studentList.add(new Student("A", 18, 100));
//            }
//        } catch (Error e) {
//            System.out.println(studentList);
//            e.printStackTrace();
//        }

        //Checked Exception
//        try {
//            FileReader fileReader=new FileReader("d:/a.txt");
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        //Runtime Exception异常
//        try {
//            studentList.get(0).getScore();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //自定义异常
        try {
            throw new MyException("自定义异常");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
