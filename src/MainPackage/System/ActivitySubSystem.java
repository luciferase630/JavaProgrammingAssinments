package MainPackage.System;

import MainPackage.Activity.Activity;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivitySubSystem {
    /**
     * 关联属性，活动列表
     * @version 1.01 13:49 直接修改成arraylist得了
     */
    private ArrayList<Activity> activityList;//到时候具体怎么实例化你得想好，一般用ArrayList？


    public void  addActivity(Activity activity){
        activityList.add(activity);
    }

    public void removeActivityById(String id){
      activityList.remove(this.getActivityById(id));
    }

    public Activity getActivityById(String id){
        for (Activity activity:activityList){//遍历
            if (activity.getId().equals(id)){
                return activity;
            }
        }
        return null;

    }

    /**
     * 返回类型应该全部都为Arraylist
     * @param date 时间
     * @version 1.02 修改了一下返回值类型
     * @return
     */
    public ArrayList<Activity> getActivitiesByDate(Date date){
        //这个DATE得在start和end中间吧
        ArrayList<Activity> targetActivityList=new ArrayList<Activity>();
        for(Activity targetactivity:activityList){

            int startmark=0,endmark=0;
            startmark=date.compareTo(targetactivity.getStartTime());//如果date比开始时间晚，则返回正整数，（相等为0）
            endmark  = date.compareTo(targetactivity.getEndTime());//如果datea比结束时间早，则返回负整数
            if (startmark >= 0 && endmark <= 0){//如果同时满足，则放入
                targetActivityList.add(targetactivity);//它没有具体实现，所以调用的是arrylist方法
            }

        }
        return targetActivityList;


    }

    public List<Activity> getActivityList(){
        return activityList;

    }

    public int checkActivityNumOfTeam(String teamId){
        return activityList.size();

    }

    public ActivitySubSystem() {
        this.activityList=new ArrayList<Activity>();
    }
}
