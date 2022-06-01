package com.example.Student.studentinfo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;

import java.util.Date;

//import javax.persitence;
//@TableName
//@EntityScan

@TableName("STUD_INFO")
public class studinfo {

    @TableId(value = "ID", type = IdType.AUTO)

    private Integer ID;
    private String STUD_FNAME;
    private String STUD_LNAME;
    private Integer AGE;
    private String EMAIL;
    private Date BIRTHDATE;
    private String STUD_MNAME;


    @Override
    public String toString() {
        return "studinfo{" +
                "ID=" + ID +
                ", STUD_FNAME='" + STUD_FNAME + '\'' +
                ", STUD_MNAME='" + STUD_MNAME + '\'' +
                ", STUD_LNAME='" + STUD_LNAME + '\'' +
                ", AGE=" + AGE +
                ", EMAIL='" + EMAIL + '\'' +
                ", BIRTHDATE=" + BIRTHDATE +
                '}';
    }



    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSTUD_FNAME() {
        return STUD_FNAME;
    }

    public void setSTUD_FNAME(String STUD_FNAME) {
        this.STUD_FNAME = STUD_FNAME;
    }

    public String getSTUD_MNAME() {
        return STUD_MNAME;
    }

    public void setSTUD_MNAME(String STUD_MNAME) {
        this.STUD_MNAME = STUD_MNAME;
    }

    public String getSTUD_LNAME() {
        return STUD_LNAME;
    }

    public void setSTUD_LNAME(String STUD_LNAME) {
        this.STUD_LNAME = STUD_LNAME;
    }

    public Integer getAGE() {
        return AGE;
    }

    public void setAGE(Integer AGE) {
        this.AGE = AGE;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public void setEMAIL(String EMAIL) {
        this.EMAIL = EMAIL;
    }

    public Date getBIRTHDATE() {
        return BIRTHDATE;
    }

    public void setBIRTHDATE(Date BIRTHDATE) {
        this.BIRTHDATE = BIRTHDATE;
    }




}

