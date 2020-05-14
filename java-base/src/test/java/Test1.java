import org.junit.Test;
import pojo.Parent;
import pojo.Student;
import pojo.Teacher;

import java.util.*;

public class Test1 {
    @Test
    public void listTest(){
        //学生集合
        List<Student> studentList=new ArrayList<Student>();
        for (int i=0;i<10;i++){//添加10个学生
            studentList.add(new Student((char)(65+i)+"",18,(int) (Math.random()*100)));
        }

        //有序
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println("-----------------------------");

        //排序
        Collections.sort(studentList);
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    @Test
    public void queueTest(){
        //学生队列
        Queue<Student> studentQueue=new ArrayDeque<>();
        for (int i=0;i<10;i++){//添加10个学生
            studentQueue.add(new Student((char)(65+i)+"",18,(int) (Math.random()*100)));
        }

        for (Student student : studentQueue) {
            System.out.println(student);
        }

        System.out.println();
        //get类似单纯的查询
        System.out.println(((ArrayDeque<Student>) studentQueue).getFirst());
        System.out.println(((ArrayDeque<Student>) studentQueue).getFirst());

        System.out.println();
        //poll查询并删除
        System.out.println(((ArrayDeque<Student>) studentQueue).pollFirst());
        System.out.println(((ArrayDeque<Student>) studentQueue).pollFirst());
    }

    @Test
    public void mapTest(){
        //老师集合
        Map<String, Teacher> teacherMap=new HashMap<String, Teacher>();
        Map<String, Teacher> teacherLinkedMap=new LinkedHashMap<>();

        //初始化老师
        Teacher chineseTeacher=new Teacher("Chinese",30,10000.00);
        Teacher mathTeacher=new Teacher("Math",30,12000.00);
        Teacher englishTeacher=new Teacher("English",30,8000.00);
        //添加老师
        teacherMap.put("语文老师",chineseTeacher);
        teacherMap.put("数学老师",mathTeacher);
        teacherMap.put("英语老师",englishTeacher);
        teacherLinkedMap.put("语文老师",chineseTeacher);
        teacherLinkedMap.put("数学老师",mathTeacher);
        teacherLinkedMap.put("英语老师",englishTeacher);

        System.out.println("-----HashMap遍历结果-----");
        Iterator<Map.Entry<String, Teacher>> iterator = teacherMap.entrySet().iterator();
        while (iterator.hasNext()){//无序
            Map.Entry<String, Teacher> tempTeacher = iterator.next();
            System.out.println(tempTeacher.getKey()+": "+tempTeacher.getValue());
        }

        System.out.println("-----LinkedHashMap遍历结果-----");
        Iterator<Map.Entry<String, Teacher>> iteratorLinkedMap = teacherLinkedMap.entrySet().iterator();
        while (iteratorLinkedMap.hasNext()){//有序
            Map.Entry<String, Teacher> tempTeacher = iteratorLinkedMap.next();
            System.out.println(tempTeacher.getKey()+": "+tempTeacher.getValue());
        }
        System.out.println("-----添加重复值后遍历结果-----");

        //Map key不能重复，新增重复key则覆盖
        teacherMap.put("数学老师",englishTeacher);
        iterator = teacherMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Teacher> tempTeacher = iterator.next();
            System.out.println(tempTeacher.getKey()+": "+tempTeacher.getValue());
        }
    }

    @Test
    public void setTest(){
        //父母集合
        List<Parent> socialPeopleList=new ArrayList<Parent>();

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
        jobSet.forEach(parent-> System.out.println(parent));
    }

}
