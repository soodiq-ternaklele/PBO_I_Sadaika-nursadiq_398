import java.util.Scanner;

class Admin {
    private String username = "admin";
    private String password = "admin123";

    public boolean login(String inputUsername, String inputPassword) {
        return username.equals(inputUsername) && password.equals(inputPassword);
    }
}

class Mahasiswa {

    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public boolean login(String inputNama, String inputNim) {
        return nama.equals(inputNama) && nim.equals(inputNim);
    }

    public void displayInfo() {
        System.out.println("Login berhasil!");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih jenis login : ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa");
        int pilihan = scanner.nextInt();
        scanner.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();
            Admin admin = new Admin();
            if (admin.login(username, password)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal!");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            Mahasiswa mahasiswa = new Mahasiswa("Budi", "123456");
            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal!");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();
    }
}
