package com.example.praktikum.Pengguna;
import com.example.praktikum.Actions.AdminAction;
import com.example.praktikum.data.Item;
import com.example.praktikum.system.LoginSystem;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class Admin extends User implements AdminAction {
    private String username;
    private String password;

    public Admin(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    public Admin() {
        super("", "");
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void displayAppMenu() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===== Menu Admin ====");
            System.out.println("1. Kelola Barang");
            System.out.println("2. Kelola Mahasiswa");
            System.out.println("0. Logout");
            System.out.print("Pilih: ");
            int pilih = LoginSystem.getIntInput(scanner);

            if (pilih == 1) manageItems();
            else if (pilih == 2) manageUsers();
            else if (pilih == 0) break;
            else System.out.println("Pilihan tidak valid.");
        }
    }

    @Override
    public void manageItems() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Lihat Semua Laporan");
        System.out.println("2. Tandai Barang Diambil");
        System.out.print("Pilih: ");
        int pilih = LoginSystem.getIntInput(scanner);

        if (pilih == 1) {
            for (Item item : LoginSystem.reportedItems) {
                item.displayItem();
            }
        } else if (pilih == 2) {
            int index = 0;
            for (Item item : LoginSystem.reportedItems) {
                if ("Reported".equalsIgnoreCase(item.getStatus())) {
                    System.out.println(index + ". " + item.getItemName());
                }
                index++;
            }
            System.out.print("Masukkan indeks item: ");
            try {
                int idx = scanner.nextInt();
                scanner.nextLine();
                Item item = LoginSystem.reportedItems.get(idx);
                if ("Reported".equalsIgnoreCase(item.getStatus())) {
                    item.setStatus("Claimed");
                    System.out.println("Barang berhasil ditandai 'Claimed'.");
                } else {
                    System.out.println("Barang sudah pernah diambil.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Masukan harus angka.");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Indeks tidak valid.");
            }
        }
    }

    @Override
    public void manageUsers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Hapus Mahasiswa");
        System.out.print("Pilih: ");
        int pilih = LoginSystem.getIntInput(scanner);

        if (pilih == 1) {
            System.out.println("==========================");
            System.out.println("Masukan Nama dan NIM: ");
            String nama = scanner.nextLine();
            System.out.println("Masukan NIM: ");
            String nim = scanner.nextLine();
            LoginSystem.userList.add(new Mahasiswa(nama, nim));
            System.out.println("=========================");
            System.out.println("Mahasiswa ditambahkan.");

        } else if (pilih == 2) {
            scanner.nextLine();
            System.out.print("Masukkan NIM Mahasiswa yang ingin dihapus: ");
            String nim = scanner.nextLine();
            Iterator<User> it = LoginSystem.userList.iterator();
            boolean found = false;
            while (it.hasNext()) {
                User user = it.next();
                if (user instanceof Mahasiswa m && m.nim.equals(nim)) {
                    it.remove();
                    found = true;
                    System.out.println("Mahasiswa dihapus.");
                    break;
                }
            }
            if (!found) System.out.println("Mahasiswa tidak ditemukan.");
        }
    }
}
