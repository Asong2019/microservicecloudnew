package com.eying.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author ShenGuiSong
 * @create 2020-02-09 17:55
 */
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    public static final long serialVersionUID=1L;

    private Long deptNo;
    private String deptName;
    private String dbSource;

    public Dept(String deptName){
        super();
        this.deptName=deptName;
    }

    public Dept(){}


    public Dept(Long deptNo, String deptName, String dbSource) {
        this.deptNo = deptNo;
        this.deptName = deptName;
        this.dbSource = dbSource;
    }
}
