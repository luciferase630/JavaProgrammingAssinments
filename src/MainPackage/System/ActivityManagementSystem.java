package MainPackage.System;

import MainPackage.Activity.Activity;
import MainPackage.User.Organizer;
import MainPackage.User.Student;
import MainPackage.User.Teacher;
import MainPackage.User.User;

import java.util.Iterator;

public class ActivityManagementSystem {
    /**
     * 关联属性，子系统：活动管理系统
     * 数量 1
     */
    private ActivitySubSystem activitySubSystem;
    /**
     * 关联属性，子系统：用户管理系统
     * 数量 1
     */
    private UserSubSystem userSubSystem;

    /**
     * @version 1.01
     * 思路：用三个迭代器把他们的所有信息全部输出到控制台上
     */
    public void displayUserSubSystem(){
        Iterator<Student>studentIterator=userSubSystem.getStudentList().iterator();
        Iterator<Teacher>teacherIterator=userSubSystem.getTeacherList().iterator();
        Iterator<Organizer>organizerIterator=userSubSystem.getOrganizerList().iterator();
        //然后用迭代器遍历
        while(studentIterator.hasNext()){
            System.out.println(studentIterator.next().toString());//这样并非死循环
        }
        System.out.println("以上是所有学生的信息");
        System.out.println("-------------------------------------------------");
        while(teacherIterator.hasNext()){
            System.out.println(teacherIterator.next().toString());
        }
        System.out.println("以上是所有老师的信息");
        System.out.println("-------------------------------------------------");
        while(organizerIterator.hasNext()){
            System.out.println(organizerIterator.next().toString());
        }
        System.out.println("以上是所有主办方的信息");
        System.out.println("-------------------------------------------------");


    }

    /**
     * @version 1.01 同样用迭代器把所用东西遍历一遍，输出到控制台上。
     */
    public void displayActivitySubSystem(){
        Iterator<Activity>activityIterator=activitySubSystem.getActivityList().iterator();
        while(activityIterator.hasNext()){
            System.out.println(activityIterator.next().toString());
        }
        System.out.println("以上是所有活动的信息");
        System.out.println("-------------------------------------------------");

    }

    public UserSubSystem getUserSubSystem(){
        return userSubSystem;
    }

    public ActivitySubSystem getActivitySubSystem(){
        return activitySubSystem;
    }

    /**
     * 我感觉无参构造就够了好像。。反正两个子系统在那个test里也是自己先进行无参构建啊。
     */
    public ActivityManagementSystem() {
        activitySubSystem=new ActivitySubSystem();//这个初始化内部已经初始化列表了
        userSubSystem =new UserSubSystem();//同样这个初始化也初始化了列表
    }
}
