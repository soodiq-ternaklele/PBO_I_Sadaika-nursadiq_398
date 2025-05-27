package com.example.praktikum.Pengguna;

import com.example.praktikum.Actions.MhsAction;
import com.example.praktikum.data.Item;
import com.example.praktikum.system.LoginSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Mahasiswa extends User implements MhsAction {
    private String name;
    public String nim;

    public Mahasiswa(String name, String nim) {
        super(name, nim);
        this.name = name;
        this.nim = nim;
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("==== Menu Mahasiswa ===");
            System.out.println("1. Lapor barang hilang");
            System.out.println("2. Lihat laporan");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            int pilih;
            try {
                pilih = scanner.nextInt();
                scanner.nextLine();
                if (pilih == 1) {
                    reportItems();
                } else if (pilih == 2) {
                    ViewReportItem();
                } else if (pilih == 0) {
                    System.out.println("Logout...");
                    break;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka.");
                scanner.nextLine();
                continue;
            }
        }
    }

    @Override
    public void reportItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama Barang: ");
        String itemName = scanner.nextLine();
        System.out.print("Deskripsi Barang: ");
        String description = scanner.nextLine();
        System.out.print("Lokasi Kehilangan: ");
        String location = scanner.nextLine();

        Item item = new Item(itemName, description, location);
        LoginSystem.reportedItems.add(item);
        System.out.println("Barang berhasil dilaporkan.");
    }

    @Override
    public void ViewReportItem() {
        if (LoginSystem.reportedItems.isEmpty()) {
            System.out.println("Belum ada laporan barang.");
            return;
        }

        for (Item item : LoginSystem.reportedItems) {
            if (item.getStatus().equalsIgnoreCase("Reported")) {
                item.displayItem();
            }
        }
    }
}
