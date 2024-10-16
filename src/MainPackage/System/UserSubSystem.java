package MainPackage.System;

import MainPackage.User.Organizer;
import MainPackage.User.Student;
import MainPackage.User.Teacher;
import MainPackage.User.User;
import MainPackage.Team.Team;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UserSubSystem {

    /**
     * 关联属性，用户列表
     * 数量0...*users
     * @version 修改返回值类型
     */
    private ArrayList<User> userList;

    public void addStudent(Student student){
        userList.add(student);//直接调用这个得了

    }

    public void removeStudentById(String id){
        userList.remove(getStudentById(id));

    }

    public Student getStudentById(String id){
        for(User student:userList){
            if(student instanceof Student) {
                if ((student.getId()).equals(id)) {
                    return (Student) student;
                }
            }
        }
        return null;
    }

    /**
     * @version 1.01
     * @return 使得返回类型为Arraylist
     */
    public ArrayList<Student> getStudentList(){
        ArrayList<Student> result=new ArrayList<Student>();
        for (User student:userList){//使用student来遍历，但是这个student实际上是user类型
            if (student instanceof Student){//如果这个对象是student类型的话，那么就把它放进我的容器
                result.add((Student) student);
            }
        }
        return result;

    }

    public void addOrganizer(Organizer organizer){
        userList.add(organizer);

    }

    public void removeOrganizerById(String id){
        userList.remove(getOrganizerById(id));

    }

    public Organizer getOrganizerById(String id){
        for (User organizer:userList){//实际上我这个是在尝试用organizer来进行遍历，然后尝试
            if(organizer instanceof Organizer){
                return (Organizer) organizer;
            }
        }
        return null;

    }

    /**
     * @version 1.01
     * @return 修改返回值类型为ArrayList
     */
    public ArrayList<Organizer> getOrganizerList(){
        ArrayList<Organizer> result=new ArrayList<Organizer>();
        for (User organizer:userList){
            if (organizer instanceof Organizer){
                result.add((Organizer) organizer);
            }
        }
        return result;

    }

    public void addTeacher(Teacher teacher){
        userList.add(teacher);

    }

    public void removeTeacherById(String id){
        userList.remove(this.getTeacherById(id));
    }

    public Teacher getTeacherById(String id){
        for (User teacher:userList){//实际上我这个是在尝试用organizer来进行遍历，然后尝试
            if(teacher instanceof Teacher){
                return (Teacher) teacher;
            }
        }
        return null;

    }

    /**
     * @version 1.01 修改返回值类型
     * @return 返回一个Arraylist
     */
    public ArrayList<Teacher> getTeacherList(){
        ArrayList<Teacher> result=new ArrayList<Teacher>();
        for (User teacher:userList){
            if (teacher instanceof Teacher){
                result.add((Teacher) teacher);
            }
        }
        return result;

    }

    public void createTeam(String creatorId,String teamId,String teamName,String department){
        Student creator=this.getStudentById(creatorId);//通过id来寻找这个学生
        Team team = new Team(teamId,teamName,department,creator);//创建成功
        creator.getTeamList().add(team);//把这个team放在创建者学生的list里


    }

    public void addStudentToTeam(String creatorId,String studentId,String teamId){
        Student creator=this.getStudentById(creatorId);//找到创建者
        for(Team team:creator.getTeamList()){
            if (team.getTeamId().equals(teamId)){//找到这个活动
                team.getStudentList().add(this.getStudentById(studentId));//在这个活动维护的学生列表里增添一个学生
                return;
            }
        }
        return;//其实不必要，因为这是最后一句
    }

    public void addTeacherToTeam(String creatorId,String teacherId,String teamId){
        Student creator=this.getStudentById(creatorId);//通过id找到学生
        for (Team team:creator.getTeamList()){//在它创建的team类里遍历
            if (team.getTeamId().equals(teamId)){//找到那个team
                team.getTeacherList().add(this.getTeacherById(teacherId));//加入老师
            }
            return;
        }
        return;//反正循环到最后都会返回

    }

    /**
     * 就初始化一下它要操作的User列表
     */
    public UserSubSystem() {//在这初始化了
        userList=new ArrayList<User>();
    }
}
