package MainPackage.Team;
import MainPackage.User.*;

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
     */
    private List<Student> studentList;

    /**
     * 关联属性，老师列表
     * 0...*个老师
     */
    private List<Teacher> teacherList;





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

    @Override
    public String toString(){
        return super.toString()+'_'+teamId+'_'+teamName+'_'+department+'_'+creator;
    }

    public List<Student> getStudentList(){
        return studentList;

    }

    public List<Teacher> getTeacherList(){
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
