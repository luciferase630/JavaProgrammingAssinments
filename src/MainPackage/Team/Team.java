package MainPackage.Team;
import MainPackage.User.*;
import java.util.List;

public class Team {
    private String teamId;
    private String teamName;
    private String department;
    private Student creator;



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

    }

    public List<Student> getStudentList(){

    }

    public List<Teacher> getTeacherList(){

    }

    public void addStudent(Student student){

    }
    public void addTeacher(Teacher teacher){

    }

}
