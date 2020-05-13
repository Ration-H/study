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

        for (int i=0;i<10;i++){//添加10个学生
            studentList.add(new Student((char)(65+i)+"",18,(int) (Math.random()*100)));
        }

        System.out.println(studentList); System.out.println();


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
        System.out.println(jobSet);System.out.println();

        //初始化老师
        Teacher chineseTeacher=new Teacher("Chinese",30,10000.00);
        Teacher mathTeacher=new Teacher("Math",30,10000.00);
        Teacher PETeacher=new Teacher("PE",30,8000.00);
        //添加老师
        teacherMap.put("语文老师",chineseTeacher);
        teacherMap.put("数学老师",mathTeacher);
        teacherMap.put("体育老师",PETeacher);
        System.out.println("晴天----"+teacherMap); System.out.println();

        teacherMap.put("数学老师",PETeacher);
        System.out.println("雨天----"+teacherMap); System.out.println();

        //学生成绩排名
        Collections.sort(studentList);
        System.out.println(studentList);

    }
}
