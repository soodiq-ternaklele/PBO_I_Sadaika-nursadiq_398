package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args){
        Buku nonFiksi = new NonFiksi("Madilog", "Tan malaka", "(Bidang : Sejarah dan Ilmu Pengetahuan)");
        Buku fiksi = new Fiksi("Hainuwele : Sang Putri Kelapa", "Lubu", "(Genre: Dongeng)");

        nonFiksi.displayInfo();
        fiksi.displayInfo();
        System.out.println();

        Anggota anggota = new Anggota("Sena" , "(ID: I999)");
        Anggota anggota1 = new Anggota("hernios", "(ID: I888)");
        System.out.println();

        anggota.pinjamBuku(nonFiksi.judul);
        anggota1.pinjamBuku(fiksi.judul, 2);
        System.out.println();

        anggota.kembalikanBuku();
        anggota1.kembalikanBuku();

    }
}