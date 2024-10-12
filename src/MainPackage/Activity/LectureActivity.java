package MainPackage.Activity;

import java.util.Date;

public class LectureActivity extends Activity{
    /**
     * 主讲人
     */
    private String keySpeaker;



    public String getKeySpeaker(){
        return this.keySpeaker;
    }
    public String toString(){
        return super.toString()+"_"+this.keySpeaker;
    }

    public LectureActivity(String id, String name, Date startTime, Date endTime, String description, String site, String keySpeaker) {
        super(id, name, startTime, endTime, description, site);
        this.keySpeaker = keySpeaker;
    }
}
