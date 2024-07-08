package com.example.doan.Admin.Data;

public class Account {
    private String idUser;
    private String passwordUser;
    private String nameUser;
    private boolean conditionUser;
    private String roleUser;

    // Getter and Setter
    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getPasswordUser() {
        return passwordUser;
    }

    public void setPasswordUser(String passwordUser) {
        this.passwordUser = passwordUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public boolean isConditionUser() {
        return conditionUser;
    }

    public void setConditionUser(boolean conditionUser) {
        this.conditionUser = conditionUser;
    }

    public String getRoleUser() {
        return roleUser;
    }

    public void setRoleUser(String roleUser) {
        this.roleUser = roleUser;
    }

    // Constructor
    public Account() {
    }

    public Account(String idUser, String passwordUser, String nameUser, boolean conditionUser, String roleUser) {
        this.idUser = idUser;
        this.passwordUser = passwordUser;
        this.nameUser = nameUser;
        this.conditionUser = conditionUser;
        this.roleUser = roleUser;
    }
}
