package cn.bean;

//import 
import java.io.Serializable;

public class Clazz implements Serizlizable{

    private String cno;
    private String cname;
    private String year;
    private String dept;
    
    public Clazz(){
    }
    public void setCno(String cno){
        this.cno = cno;
    }
    public void setCname(String cname){
        this.cname = cname;
    }
    public void setYear(String year){
        this.year = year;
    }
    public void setDept(String dept){
        this.dept = dept;
    }
    
    public String getCno(){
        return this.cno;
    }
    public String getCname(){
        return this.cname;
    }
    public String getYear(){
        return this.year;
    }
    public Stirng getDept(){
        return this.dept;
    }
}
