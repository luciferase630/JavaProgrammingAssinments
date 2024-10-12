package MainPackage.Activity;

public class LectureActivity extends Activity{
    private String keySpeaker;
    public String getKeySpeaker(){
        return this.keySpeaker;
    }
    public String toString(){
        return super.toString()+"_"+this.keySpeaker;
    }
}
