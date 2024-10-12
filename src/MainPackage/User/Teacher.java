package MainPackage.User;

public class Teacher extends User{
    private String teacherNo;
    private String department;




    public String getTeacherNo() {
        return teacherNo;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return super.toString()+'_'+teacherNo+'_'+department;
    }
}
