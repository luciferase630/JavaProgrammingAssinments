package MainPackage.User;
import MainPackage.Team.Team;

import java.lang.reflect.Array;
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
     * @version 1.01就直接给它改成ArrayList类型了
     * @version 1.02 直接给他初始化
     */
    private ArrayList<Team> teamList=new ArrayList<>();

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

    /**
     * @version 修改返回值类型
     * @return
     */
    public ArrayList<Team> getTeamList(){
        return this.teamList;

    }


    /**
     * 这个就相当于是自己修改了一下男女的返回toString 类型吧
     * @return
     */
    @Override
    public String toString() {//我觉得我这样写一点问题没有，这toString显然就是为了标明这个学生的 身份的
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
