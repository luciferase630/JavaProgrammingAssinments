package MainPackage.User;

public class User {
    private String id;
    private String name;
    private String phoneNo;
    private String email;



    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
    return super.toString()+'_'+id+name+phoneNo+email;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User){
            User comparableUser = (User) obj;
            if(this.id.equals(comparableUser.id) ){
                return true;
            }else {
                return false;
            }
        }
        else {
            return false;
        }

    }

    /**
     *
     * @param id 用户的代码
     * @param name 用户的名字
     * @param phoneNo 用户的手机号
     * @param email 用户的电子邮件地址
     */
    public User(String id, String name, String phoneNo, String email) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.email = email;
    }
}
