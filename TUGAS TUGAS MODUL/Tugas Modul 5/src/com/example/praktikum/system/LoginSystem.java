package com.example.praktikum.system;

import com.example.praktikum.Pengguna.*;
import com.example.praktikum.data.Item;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LoginSystem {
    public static ArrayList<User> userList = new ArrayList<>();
    public static ArrayList<Item> reportedItems = new ArrayList<>();

    public static void main(String[] args) {
        userList.add(new Admin("admin","Admin777"));
        userList.add(new Mahasiswa("Anto", "20232025"));
        userList.add(new Mahasiswa("Sonia", "20232024"));


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Sistem Pelaporan Kehilangan ===");
            System.out.print("Username/Nama: ");
            String name = scanner.nextLine();
            System.out.print("Password/NIM: ");
            String nim = scanner.nextLine();

            User loggedIn = null;
            for (User user : userList) {
                if (user.getname().equals(name) && user.getNim().equals(nim)) {
                    loggedIn = user;
                    break;
                }
            }

            if (loggedIn != null) {
                loggedIn.displayAppMenu();
            } else {
                System.out.println("Login gagal. Coba lagi.");
            }
        }
    }

    public static int getIntInput(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine();
            return -1;
        }
    }
}
