package entity;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.hibernate.validator.internal.xml.mapping.MappingXmlParser;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

public class User {
    @NotBlank(message = "name can not be empty")
    private  String name;
    @Length(min = 6 ,max = 13,message = "can no be empty")
    private  String password;
    @Range(min = 18 ,max = 60 ,message = "between 18 to 60")
    private  Integer age;
    @Email(message = "email address")
    private  String email;
    @Pattern(regexp = "^1[3|5|8][0-9]{9}$")
    private  String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
