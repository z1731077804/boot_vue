package com.by.entity;

import lombok.ToString;

import java.io.Serializable;

/**
 * (TStu)实体类
 *
 * @author makejava
 * @since 2019-12-12 20:40:51
 */
@ToString
public class TStu implements Serializable {
    private static final long serialVersionUID = 893530769477672249L;
    
    private Integer stuId;
    
    private String stuName;
    
    private Integer stuAge;
    
    private Integer stuSex;


    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getStuAge() {
        return stuAge;
    }

    public void setStuAge(Integer stuAge) {
        this.stuAge = stuAge;
    }

    public Integer getStuSex() {
        return stuSex;
    }

    public void setStuSex(Integer stuSex) {
        this.stuSex = stuSex;
    }

}