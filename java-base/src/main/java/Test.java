import pojo.Parent;
import pojo.Student;
import pojo.Teacher;

import java.util.*;

@SuppressWarnings("Duplicates")
public class Test {
    public static void main(String[] args) {
        //学生集合
        List<Student> studentList=new ArrayList<Student>();
        //老师集合
        Map<String, Teacher> teacherMap=new HashMap<String, Teacher>();
        //父母集合
        List<Parent> socialPeopleList=new ArrayList<Parent>();
        //
        Queue<Student> studentQueue=new ArrayDeque<>();
        for (int i=0;i<10;i++){//添加10个学生
            studentList.add(new Student((char)(65+i)+"",18,(int) (Math.random()*100)));
        }

        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-----------------------------");

        //排序
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println();

        //添加父母
        socialPeopleList.add(new Parent("A爸",45,"工程师"));
        socialPeopleList.add(new Parent("B爸",46,"HR"));
        socialPeopleList.add(new Parent("C妈",42,"HR"));
        socialPeopleList.add(new Parent("D妈",43,"架构师"));
        socialPeopleList.add(new Parent("E爸",48,"架构师"));

        //学生的父母们从事哪些职业
        Set<String> jobSet=new HashSet<String>();
        for (Parent parent : socialPeopleList) {
            jobSet.add(parent.getJob());
        }
        //Set 适合去重
        System.out.println(jobSet);System.out.println();

        //初始化老师
        Teacher chineseTeacher=new Teacher("Chinese",30,10000.00);
        Teacher mathTeacher=new Teacher("Math",30,12000.00);
        Teacher PETeacher=new Teacher("PE",30,8000.00);
        //添加老师
        teacherMap.put("语文老师",chineseTeacher);
        teacherMap.put("数学老师",mathTeacher);
        teacherMap.put("体育老师",PETeacher);
        Iterator<Map.Entry<String, Teacher>> iterator = teacherMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Teacher> tempTeacher = iterator.next();
            System.out.println(tempTeacher.getKey()+": "+tempTeacher.getValue());
        }
        System.out.println("------------------------");

        //Map key不能重复，新增重复key则覆盖
        teacherMap.put("数学老师",PETeacher);
        iterator = teacherMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Teacher> tempTeacher = iterator.next();
            System.out.println(tempTeacher.getKey()+": "+tempTeacher.getValue());
        }
    }
}
