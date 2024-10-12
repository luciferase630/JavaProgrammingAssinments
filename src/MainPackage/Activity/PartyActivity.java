package MainPackage.Activity;

import java.util.Date;

public class PartyActivity extends Activity{
    /**
     * 团日活动主题
     */
    private String theme;
    /**
     * 团日活动的分类
     */
    private String classification;



    public String getTheme() {
        return theme;
    }

    public String getClassification() {
        return classification;
    }
    public String toString(){
        return super.toString()+"_"+theme+"_"+classification;
    }

    public PartyActivity(String id, String name, Date startTime, Date endTime, String description, String site, String theme, String classification) {
        super(id, name, startTime, endTime, description, site);
        this.theme = theme;
        this.classification = classification;
    }
}
