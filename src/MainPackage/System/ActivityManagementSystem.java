package MainPackage.System;

public class ActivityManagementSystem {
    /**
     * 关联属性，子系统：活动管理系统
     * 数量 1
     */
    private ActivitySubSystem activitySubSystem;
    /**
     * 关联属性，子系统：用户管理系统
     * 数量 1
     */
    private UserSubSystem userSubSystem;

    public void displayUserSubSystem(){

    }

    public void displayActivitySubSystem(){

    }

    public UserSubSystem getUserSubSystem(){
        return userSubSystem;
    }

    public ActivitySubSystem getActivitySubSystem(){
        return activitySubSystem;
    }

    /**
     * 我感觉无参构造就够了好像。。反正两个子系统在那个test里也是自己先进行无参构建啊。
     */
    public ActivityManagementSystem() {

    }
}
