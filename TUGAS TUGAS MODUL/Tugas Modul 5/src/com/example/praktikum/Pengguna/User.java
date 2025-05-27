package com.example.praktikum.Pengguna;

public abstract class User {
    protected String name;
    protected String nim;

    public User(String name, String nim) {
        this.name = name;
        this.nim = nim;
    }
    public String getname() {
        return name; }
    public void setUsername(){
        this.name = name;
    }
    public String getNim() {
        return nim; }
    public void setPassword(){
        this.nim = nim;
    }

    public void displayInfo(){
        System.out.println("Nama : " + name);
        System.out.println("NIM  : " + nim);
    }
    public abstract void displayAppMenu();
}
