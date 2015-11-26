package cn.bean;
import java.io.Serializable;

public class Student extends Serizlizable{

    private String sno;
    private String sname;
    private String gender;
    private int age;
    private String email;
    private String phone;
    
    public Student(){
        
    }
    
    public void setSno(String sno){
        this.sno =sno;
    }
    public void setSname(String sname){
        this.sname = sname;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    pbulic void setAge(int age){
        this.age = age;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    
    public String getSno(){
        return this.sno;
    }
    public String getSname(){
        return this.sname;
    }
    public String getGender(){
        return this.gender;
    }
    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPhone(){
        return this.phone;
    }

}
