package mvc.POJO;

import mvc.POJO.helper.IdAdapter;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement(name="USER")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"username", "password", "userType", "name"})
public class User {

    @XmlAttribute
    @XmlJavaTypeAdapter(IdAdapter.class)
    private Integer id;

    private String username;

    private String password;

    private String userType;

    private String name;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
