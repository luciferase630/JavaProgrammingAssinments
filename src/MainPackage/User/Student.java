package MainPackage.User;
import MainPackage.Team.Team;

import java.util.ArrayList;
import java.util.List;
public class Student extends User{
    private String studentNo;

    /**
     * 本程序规定
     * true 为男性
     * false为女性
     */
    private boolean gender;
    private String grade;
    private String department;

    /**
     * 关联属性，这个学生所创建的team列表
     * 数量 0...*个
     */
    private List<Team> teamList;

    public String getStudentNo() {
        return studentNo;
    }

    public boolean getGender() {
        return gender;
    }

    public String getGrade() {
        return grade;
    }

    public String getDepartment() {
        return department;
    }

    public List<Team> getTeamList(){
        return this.teamList;

    }

    @Override
    public String toString() {
        if(this.gender) {
            return super.toString() + '_' + studentNo + '_' + "male" + '_' + grade + department;
        }
        else {
            return super.toString() + '_' + studentNo + '_' + "female" + '_' + grade + department;

        }
    }

    public Student(String id, String name, String phoneNo, String email, String studentNo, boolean gender, String grade, String department) {
        super(id, name, phoneNo, email);
        this.studentNo = studentNo;
        this.gender = gender;
        this.grade = grade;
        this.department = department;
        teamList=new ArrayList<Team>();
    }

}
