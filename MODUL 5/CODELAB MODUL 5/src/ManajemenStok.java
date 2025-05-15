import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ManajemenStok {
    public static void main(String[] args) {
        ArrayList<Barang> daftarBarang = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        daftarBarang.add(new Barang("Pensil", 10));
        daftarBarang.add(new Barang("Buku", 15));

        boolean running = true;

        while (running) {
            System.out.println("==== Menu Manajemen Stok ====");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");

            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine();

                if (pilihan == 1) {
                    System.out.print("Nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Jumlah barang: ");
                    try {
                        int stok = scanner.nextInt();
                        scanner.nextLine();
                        daftarBarang.add(new Barang(nama, stok));
                        System.out.println("Barang berhasil ditambahkan.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input stok harus berupa angka.");
                        scanner.nextLine();
                    }
                } else if (pilihan == 2) {
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Stok barang habis.");
                    } else {
                        System.out.println("Daftar Barang:");
                        for (Barang barang : daftarBarang) {
                            System.out.println(barang);
                        }
                    }
                } else if (pilihan == 3) {
                    if (daftarBarang.isEmpty()) {
                        System.out.println("Tidak ada barang yang bisa dikurangi.");
                    } else {
                        System.out.println("Pilih barang yang ingin dikurangi:");
                        for (int i = 0; i < daftarBarang.size(); i++) {
                            System.out.println(i + ": " + daftarBarang.get(i));
                        }
                        try {
                            System.out.print("Masukkan index barang: ");
                            int index = scanner.nextInt();

                            Barang barang = daftarBarang.get(index);

                            System.out.print("Jumlah barang yang ingin dikurangi: ");
                            int jumlah = scanner.nextInt();

                            if (jumlah > barang.getStok()) {
                                throw new StokTidakException("Stok untuk " + barang.getNamaBarang() + " hanya tersisa " + barang.getStok());
                            }

                            barang.setStok(barang.getStok() - jumlah);
                            System.out.println("Stok berhasil dikurangi.");
                        } catch (InputMismatchException e) {
                            System.out.println("Input harus berupa angka.");
                            scanner.nextLine();
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Input barang tidak valid.");
                        } catch (StokTidakException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                } else if (pilihan == 4) {
                    System.out.println("Terima kasih telah menggunakan program.");
                    running = false;
                } else {
                    System.out.println("Pilihan tidak valid.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
