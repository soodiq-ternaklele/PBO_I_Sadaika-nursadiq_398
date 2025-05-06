package com.praktikum.Main;

import com.praktikum.users.User;
import com.praktikum.users.Mahasiswa;
import com.praktikum.users.Admin;

import java.util.Scanner;

public class LoginSystem {
    public static void main(String[]args){
        Admin admin1 =  new Admin("AdminAsw", "AdminGanteng");
        Mahasiswa mahas = new Mahasiswa("Sodiq", "2024398");
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih (Admin or Mahasiswa) : ");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.println("Pilih : ");
        int login = input.nextInt();

        if (login == 1){
            admin1.login();
        }else if (login == 2){
            mahas.login();
            mahas.DisplayAppMenu();
        }else {
            System.out.println("============================");
            System.out.println("|      DATA TIDAK VALID    |");
            System.out.println("============================");
        }
    }
}