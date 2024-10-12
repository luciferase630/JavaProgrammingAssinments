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

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString()+'_'+teacherNo+'_'+department;
    }

    public Teacher(String id, String name, String phoneNo, String email, String teacherNo, String department) {
        super(id, name, phoneNo, email);
        this.teacherNo = teacherNo;
        this.department = department;
    }
}
