package MainPackage.User;
import MainPackage.Team.Team;
import java.util.List;
public class Student extends User{
    private String studentNo;
    private boolean gender;
    private String grade;
    private String department;

    public String getStudentNo() {
        return studentNo;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public List<Team> getTeamList(){

    }

    @Override
    public String toString() {
        return super.toString();
    }
}
