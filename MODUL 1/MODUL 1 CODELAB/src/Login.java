import java.util.Scanner;
public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String validAdminUsername = "Admin010";
        String validAdminPassword = "password010";

        String validNamaMahasiswa = "Sodiq";
        String validNIMMahasiswa = "2024398";

        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        scanner.nextLine();
        if (pilihan == 1) {
            System.out.print("Masukkan Username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan Password: ");
            String password = scanner.nextLine();
            if (username.equals(validAdminUsername) && password.equals(validAdminPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();
            if (nama.equals(validNamaMahasiswa) && nim.equals(validNIMMahasiswa)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
        scanner.close();}
}