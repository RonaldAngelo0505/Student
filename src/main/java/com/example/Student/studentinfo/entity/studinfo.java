package com.example.Student.studentinfo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.autoconfigure.domain.EntityScan;
//import jdk.nashorn.internal.objects.annotations.Getter;
//import jdk.nashorn.internal.objects.annotations.Setter;
//import lombok.Getter;
import java.util.Date;

//import javax.persitence;
//@TableName
//@EntityScan
//@Getter
//@Setter


@Data
@Getter
@Setter
@TableName("stud_info")
public class studinfo {

    @TableId(value = "ID", type = IdType.AUTO)

    private Integer ID;
    private String STUD_FNAME;
    private String STUD_LNAME;
    private Integer AGE;
    private String EMAIL;
    private Date BIRTHDATE;
    private String STUD_MNAME;


}

