package MainPackage.System;

import MainPackage.Activity.Activity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ActivitySubSystem {
    /**
     * 关联属性，活动列表
     */
    private List<Activity> activityList;//到时候具体怎么实例化你得想好，一般用ArrayList？


    public void  addActivity(Activity activity){
        activityList.add(activity);
    }

    public void removeActivityById(String id){
      activityList.remove(this.getActivityByID(id));
    }

    public Activity getActivityByID(String id){
        for (Activity activity:activityList){//遍历
            if (activity.getId().equals(id)){
                return activity;
            }
        }
        return null;

    }

    public List<Activity> getActivitiesByDate(Date date){
        //这个DATE得在start和end中间吧
        List<Activity> targetActivityList=new ArrayList<Activity>();
        for(Activity targetactivity:activityList){
            targetactivity.getEndTime();
            targetactivity.getStartTime();
            int startmark=0,endmark=0;
            startmark=date.compareTo(targetactivity.getStartTime());//如果date比开始时间晚，则返回正整数，（相等为0）
            endmark  = date.compareTo(targetactivity.getEndTime());//如果datea比结束时间早，则返回负整数
            if (startmark >= 0 && endmark <= 0){//如果同时满足，则放入
                targetActivityList.add(targetactivity);
            }

        }
        return targetActivityList;


    }

    public List<Activity> getActivityList(){
        return activityList;

    }

    public int CheckActivityNumberOfTeam(String teamId){
        return activityList.size();

    }

    public ActivitySubSystem() {
        this.activityList=new ArrayList<Activity>();
    }
}
