package com.praktikum.users;
import com.praktikum.Action.AdminAction;

import java.util.Scanner;

public class Admin extends User implements AdminAction {
    public String username;
    public String password;
    Scanner scan = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    @Override
    public void login() {
        Scanner Milih = new Scanner(System.in);
        System.out.println("Masukan Username : ");
        String username = Milih.nextLine();
        System.out.println("Masukan password : ");
        String password = Milih.nextLine();

        if (username.equals(username) && this.password.equals(password)) {
        } else {
            System.out.println("Password atau username salah!");
        }
    }

    @Override
    public void DisplayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilih;
        do {
            System.out.println("Masukan pilihan");
            System.out.println("1. Kelola Laporan barang");
            System.out.println("2. Kelola Data Mahasiswa");
            System.out.println("3. Logout");
            System.out.println("Pilih 1-3");
            pilih = input.nextInt();

            if (pilih == 1) {
                ManageItem();
            } else if (pilih == 2) {
                ManageUsers();
            } else if (pilih == 3) {
                System.out.println("Thank youuu");
            } else {
                System.out.println("Data yang anda masukan salah");
            }
        } while (pilih != 3);
    }

    @Override
    public void ManageItem() {
        System.out.println("======================================");
        System.out.println("  Fitur kelola barang belum Tersedia  ");
        System.out.println("======================================");
    }

    @Override
    public void ManageUsers() {
        System.out.println("======================================");
        System.out.println("  Fitur kelola Mahasiswa belum Tersedia  ");
        System.out.println("=====================================");

    }
}