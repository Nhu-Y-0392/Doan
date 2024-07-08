package com.example.doan.Admin.Data;

public class User {
    // Atributos
    private String idUser;
    private String nameUser;
    private String phoneUser;
    private String conditUser;

    // getter and setter
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getPhoneUser() {
        return phoneUser;
    }

    public void setPhoneUser(String phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getConditUser() {
        return conditUser;
    }

    public void setConditUser(String conditUser) {
        this.conditUser = conditUser;
    }

    //constructor
    public User() {
    }

    public User(String idUser, String nameUser, String phoneUser, String conditUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.phoneUser = phoneUser;
        this.conditUser = conditUser;
    }
}
