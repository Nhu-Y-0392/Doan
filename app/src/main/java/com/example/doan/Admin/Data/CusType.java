package com.example.doan.Admin.Data;

public class CusType {
    //attribute
    private  int id;
    private String nameCusType;
    private String description;

    //getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameCusType() {
        return nameCusType;
    }

    public void setNameCusType(String nameCusType) {
        this.nameCusType = nameCusType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //constructor
    public CusType(){}
    public CusType(int id, String nameCusType, String description) {
        this.id = id;
        this.nameCusType = nameCusType;
        this.description = description;
    }
}
