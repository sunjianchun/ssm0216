package test.ssm.api.model;


import java.io.Serializable;

/**
 * Created by sunjianchun on 17/2/16.
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String address;
    private String sex;
    private static final long serialVersionUID = 1L;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

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

    @Override
    public String toString(){
        return "User{" +
                "id=" + id +
                ", username=" + username +
                ", address=" + address +
                ", sex=" + sex +
                "}";
    }
}
