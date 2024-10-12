package MainPackage.Activity;

public class PartyActivity extends Activity{
    private String theme;
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
}
