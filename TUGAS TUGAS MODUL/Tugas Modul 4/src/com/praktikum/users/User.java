package com.praktikum.users;

public abstract class User {

    private String name;
    private String NIM;

    public User(String name, String NIM) {
        this.name = name;
        this.NIM = NIM;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNIM(){
        return NIM;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public abstract void login();
    public abstract void DisplayAppMenu();


}
