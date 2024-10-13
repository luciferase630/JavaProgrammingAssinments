package MainPackage.Activity;
import MainPackage.Team.*;//需要和Team和User共同作用
import MainPackage.User.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Activity {

    private String id;
    private String name;
    private Date    startTime;
    private Date    endTime;
    private String  description;
    private String  site;

    /**
     * 关联属性，团队列表
     * 数量0...*
     * @version 1.01 改变teamlist类型为动态数组类型
     * @version 1.02 初始化还是别在构造函数里搞了,直接在这里操作
     */
    private ArrayList<Team> teamList=new ArrayList<>();

    /**
     * 关联属性，老师列表
     * 数量1...*
     * @version 1.01 改变teacherlist类型为动态数组类型
     * @version 1.02 初始化还是别在构造函数里搞了
     */
    private ArrayList<Teacher> teacherList=new ArrayList<>();

    /**
     * 关联属性，组织者列表
     * 数量1...*
     * @version 1.01 改变organizerlist类型为动态数组类型
     * @version 1.02 初始化还是别在构造函数里搞了
     */
    private ArrayList<Organizer> organizerList=new ArrayList<>();





    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getStartTime() {
        return startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public String getDescription() {
        return description;
    }

    public String getSite() {
        return site;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void addTeamToActivity(Team team){
        teamList.add(team);

    }
    public void removeTeamFromActivity(String id){

        Iterator<Team> teamIterator = this.getTeamIterator();//危险，迭代器操作的可是原本的容器
        Team targetTeam;
        while(teamIterator.hasNext()){//正常迭代循环
            targetTeam=teamIterator.next();//从第一个开始赋值

            if (targetTeam.getTeamId().equals(id)){//如果说迭代到的这个东西是id匹配的话，那就是目标team
                teamList.remove(targetTeam);
                break;//迭代器如果指向空引用，java会自动回收，我有点担心我如果一直不处理这些迭代器，这些东西会越来越多
                //好像没必要这么干啊，这反正是局部变量。。算了保险一点
            }


        }
    }
    public void addTeacherToActivity(Teacher teacher){
        teacherList.add(teacher);

    }

    /**
     * @version 1.01 我真是服了，我居然没在teamlist里尝试删除teacher,再把那个迭代器指向null这句话删掉
     * @param id
     */
    public void removeTeacherFromActivity(String id){
        Iterator<Teacher> teacherIterator=this.getTeacherIterator();
        Teacher targetTeacher;
        while(teacherIterator.hasNext()){
            targetTeacher=teacherIterator.next();
            if (targetTeacher.getId().equals(id)){//逻辑完全同上。这里的id指的是id而不是teacherNo
                teacherList.remove(targetTeacher);
                break;
            }
        }

    }
    public void addOrganizerToActivity(Organizer organizer){
        organizerList.add(organizer);

    }

    /**
     * @version 1.01 修改2024-10-13 删除了将迭代器指向null的方法
     * @param Id
     */
    public void removeOrganizerFromActivity(String Id){
        Iterator<Organizer> organizerIterator=this.getOrganizerIterator();
        Organizer targetOrganizer;
        while(organizerIterator.hasNext()){
            targetOrganizer=organizerIterator.next();
            if (targetOrganizer.getId().equals(id)){
                organizerList.remove(targetOrganizer);
                break;
            }
        }


    }

    /**
     * @version 10-13-13:30 发现id和name，和各种属性之间没有下划线
     * @return
     */
    @Override
    public String toString(){
        return id+'_'+name+'_'+String.valueOf(startTime)+'_'+String.valueOf(endTime)+'_'+site;

    }
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Activity ){
            Activity comparableActivity = (Activity)obj;
            if (this.id.equals(comparableActivity.id)) {
                return true;
            }
        }
        return false;

    }
    public Iterator<Team> getTeamIterator(){

        //这迭代器直接用引用类型对吗（后面记得修改)
        //  估计就是直接用某个list的迭代器方法直接返回一个迭代器
        return teamList.iterator();
    }


    public Iterator<Teacher> getTeacherIterator(){
        return teacherList.iterator();
    }

    public Iterator<Organizer> getOrganizerIterator(){
        return organizerList.iterator();
    }

    /**
     * 构造函数
     * @param id 活动代码
     * @param name 活动名称
     * @param startTime 活动起始时间
     * @param endTime 活动结束时间
     * @param description 活动结束
     * @param site 活动网站
     */
    public Activity(String id, String name, Date startTime, Date endTime, String description, String site) {
        this.id = id;
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.site = site;
    }
}
