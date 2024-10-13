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

    /**
     * @version 1.01 这里怎么还在调用super的tostring啊？？，错误，改了
     * @return
     */
    @Override
    public String toString() {
    return id+'_'+name+'_'+phoneNo+'_'+email;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof User){
            User comparableUser = (User) obj;//可以替换为模式变量，但我不替换
            if(this.id.equals(comparableUser.id) ){//可以简化if，但我不简化
                return true;//仅有这一种情况是同一个学生
            }
        }
       return false;

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
