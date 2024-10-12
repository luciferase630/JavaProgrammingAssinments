package MainPackage.User;

public class Organizer extends User{
    private String unit;



    public String getUnit() {
        return unit;
    }

    @Override
    public String toString() {
        return super.toString()+'_'+unit;
    }

    public Organizer(String id, String name, String phoneNo, String email, String unit) {
        super(id, name, phoneNo, email);
        this.unit = unit;
    }

}
