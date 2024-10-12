package MainPackage.Activity;
import MainPackage.Team.*;//需要和Team和User共同作用
import MainPackage.User.*;
import java.util.Date;
import java.util.Iterator;

public class Activity {
    private String id;
    private String name;
    private Date    startTime;
    private Date    endTime;
    private String  description;
    private String  site;




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

    }
    public void removeTeamFromActivity(String id){

    }
    public void addTeacherToActivity(Teacher teacher){

    }
    public void removeTeacherFromActivity(String id){

    }
    public void addOrganizerToActivity(Organizer organizer){

    }
    public void removeOrganizerFromActivity(String Id){

    }
    @Override
    public String toString(){

    }
    @Override
    public boolean equals(Object object){

    }
    public Iterator<Team> getTeamIterator(){
//这迭代器直接用引用类型对吗（后面记得修改
    }
    public Iterator<Teacher> getTeacherIterator(){

    }

    public Iterator<Organizer> getOrganizerIterator(){

    }

}
