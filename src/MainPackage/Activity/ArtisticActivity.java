package MainPackage.Activity;

import java.util.Date;

public class ArtisticActivity extends Activity{
    /**
     * 活动类型
     */
    private String type;



    public String getType(){
    return this.type;//还是习惯用实例变量来写
    }

    @Override
    public String toString(){
    return super.toString()+"_"+this.type;//在 Java 中，你可以在类的方法中直接使用属性名，而不需要使用 this 关键字。this
        // 关键字主要用于区分实例变量和方法参数或局部变量（如果它们的名字相同）。如果没有命名冲突，你可以直接使用属性名。
    }


    public ArtisticActivity(String id, String name, Date startTime, Date endTime, String description, String site, String type) {
        super(id, name, startTime, endTime, description, site);
        this.type = type;
    }
}
