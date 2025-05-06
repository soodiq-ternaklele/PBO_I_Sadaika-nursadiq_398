package com.praktikum.users;

import com.praktikum.Action.MahasiswaAction;

import java.util.Scanner;

public class Mahasiswa extends User implements MahasiswaAction {
    String nama;
    String nim;

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
        this.nama = nama;
        this.nim = nim;
    }

    @Override
    public void login() {
        Scanner milih = new Scanner(System.in);
        System.out.println("Masukin Nama : ");
        String nama = milih.nextLine();
        System.out.println("Masukan NIM : ");
        String nim = milih.nextLine();

        if (nama.equals(nama) && this.nim.equals(nim)) {
        } else {
            System.out.println("Nama atau NIM salah!");
        }
    }

    @Override
    public void DisplayAppMenu() {
        Scanner input = new Scanner(System.in);
        int pilih;
        do {

            System.out.println("Data kehilangan Mahasiswa");
            System.out.println("===Masukan Pillihan===");
            System.out.println("1. Laporan Barang Hilang/Temuan");
            System.out.println("2. Lihat Daftar Laporan");
            System.out.println("3. Log out");
            System.out.println("Silahkan dipilih");
            pilih = input.nextInt();

            if (pilih == 1) {
                ReportItem();
            } else if (pilih == 2) {
                ViewReportItem();
            } else if (pilih == 3) {
                System.out.println("====Thank youuuuu -.-====");
            } else {
                System.out.println("Data yang anda masukan salah");
            }
        } while (pilih != 3);
    }

    @Override
    public void ReportItem() {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nama Barang");
        String Barang = input.nextLine();
        System.out.println("Masukan Deskripsi Barang : ");
        String Deskripsi = input.nextLine();
        System.out.print("Lokasi Barang terakhir/ditemukan : ");
        String lokasi = input.nextLine();
        System.out.println("Data laporan diterima. Terimakasih! ");
    }

    @Override
    public void ViewReportItem() {
        System.out.println("Fitur Laporan belum Tersedia");
    }
}
