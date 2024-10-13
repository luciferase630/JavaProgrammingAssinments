package MainPackage.Team;
import MainPackage.User.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String teamId;
    private String teamName;
    private String department;
    private Student creator;

    /**
     * 关联属性，学生列表
     * 1...*个学生
     * @version 1.01 直接给它改成ArrayList，因为有直接返回方法
     * @version 1.02 直接给他初始化
     */
    private ArrayList<Student> studentList=new ArrayList<>();

    /**
     * 关联属性，老师列表
     * 0...*个老师
     * @version 1.01 直接给它改成ArrayList，因为有直接返回方法
     * @version 1.02 直接给他初始化，我受不了了
     */
    private ArrayList<Teacher> teacherList=new ArrayList<>();





    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getDepartment() {
        return department;
    }

    public Student getCreator() {
        return creator;
    }

    /**
     * @version 这个把父类的toString给调用了
     * @return 返回它的属性值
     */
    @Override
    public String toString(){
        return teamId+'_'+teamName+'_'+department+'_'+creator;
    }

    public ArrayList<Student> getStudentList(){
        return studentList;

    }

    public ArrayList<Teacher> getTeacherList(){
        return teacherList;

    }

    public void addStudent(Student student){
        studentList.add(student);

    }
    public void addTeacher(Teacher teacher){
        teacherList.add(teacher);
    }

    public Team(String teamId, String teamName, String department, Student creator) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.department = department;
        this.creator = creator;
        studentList =new ArrayList<Student>();
        teacherList =new ArrayList<Teacher>();
    }
}
