/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

public class Student implements Serializable
{
    private long id;
    private String name;
    private String uname;
    private Date dob;
    private String gender;
    private String mailId;
    private String mobileNo;
    private String password;
    private String rePassword;
    private String encPassword; //Encrypted password
    private String program;
    private String branch;
    private int semester;
    private Timestamp addDate;
    
    public Student() {}
    
    public Student(String name, Date dob, String gender, String mailId, String mobileNo, 
                    String password, String rePassword, String program, String branch, int semester) 
    {
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.rePassword = rePassword;
        this.program = program;
        this.branch = branch;
        this.semester = semester;
    }
    
    public Student(long id, String name, Date dob, String gender, String mailId, String mobileNo, 
                   /*String password, String rePassword*/ String program, String branch, int semester) 
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        //this.password = password;
        //this.rePassword = rePassword;
        this.program = program;
        this.branch = branch;
        this.semester = semester;
    }
    
    public Student(long id, String name, Date dob, String gender, String mailId, String mobileNo, 
                   String password, String rePassword, String program, String branch, int semester, Timestamp addDate) 
    {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.mailId = mailId;
        this.mobileNo = mobileNo;
        this.password = password;
        this.rePassword = rePassword;
        this.program = program;
        this.branch = branch;
        this.semester = semester;
        this.addDate = addDate;
    }
    
    @Override
    public String toString() 
    {
        return "Student(" + "id = " + id + ", name = " + name + ", dob = " + dob + ", gender = "
               + gender + ", mailId = " + mailId + ", mobileNo = " + mobileNo + ", password = "
               + password + ", rePassword = " + rePassword + ", program = " + program + ", branch = "
               + branch + ", semester = " + semester + ", addDate = " + addDate + '}';
    }

    public String getUname() { return this.uname; }
    public void setUname(String uname) { this.uname = uname; }
    public long getId() { return this.id; }
    public void setId(long id) { this.id = id; }
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
    public Date getDob() { return this.dob; }
    public void setDob(Date dob) { this.dob = dob; }
    public String getGender() { return this.gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getMailId() { return mailId; }
    public void setMailId(String mailId) { this.mailId = mailId; }
    public String getMobileNo() { return mobileNo; }
    public void setMobileNo(String mobileNo) { this.mobileNo = mobileNo; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password;}
    public String getRePassword() { return rePassword; }
    public void setRePassword(String rePassword) { this.rePassword = rePassword; }
    public String getProgram() { return program; }
    public void setProgram(String program) { this.program = program; }
    public String getBranch () { return branch; }
    public void setBranch (String branch) { this.branch = branch; }
    public int getSemester() { return semester; }
    public void setSemester (int semester) { this.semester = semester; }
    public Timestamp getAddDate () { return addDate; }
    public void setAddDate (Timestamp addDate) { this.addDate = addDate; }
    public String getEncPassword() { return encPassword; }
    public void setEncPassword (String encPassword) { this.encPassword = encPassword; }
}
