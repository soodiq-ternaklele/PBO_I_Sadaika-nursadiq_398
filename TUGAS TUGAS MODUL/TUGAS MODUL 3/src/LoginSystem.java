import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Admin admin = new Admin("Admin Sigit", "AdminBaik");
        Mahasiswa mhs1 = new Mahasiswa("Budi", "20241000");

        Scanner Milih = new Scanner(System.in);

        System.out.println("pilih Login : ");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa ");
        System.out.print("1/2 :");
        int Pilihan = Milih.nextInt();

        if (Pilihan == 1) {
            admin.login();
        } else if (Pilihan == 2) {
            mhs1.login();
        } else {
            System.out.println("Informasi tidak di ketahui");
        }
    }
}