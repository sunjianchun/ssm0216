package test.ssm.dao.domain;


/**
 * Created by sunjianchun on 17/2/16.
 */
public class UserDomain {
    private Integer id;
    private String username;
    private String address;
    private String sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() { return username; }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

  //  @Override
    public String toString1(){
        return "姓名：" + this.username + " 性别：" + this.sex + "地址：" + this.address;
    }
}

