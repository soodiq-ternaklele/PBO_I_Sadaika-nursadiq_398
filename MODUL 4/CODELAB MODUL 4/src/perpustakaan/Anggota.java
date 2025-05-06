package perpustakaan;

public class Anggota implements perpustakaan.Peminjaman {
    String nama, idAnggota, bukuDipinjam;

    public Anggota(String nama, String idAnggota){
        this.nama = nama;
        this.idAnggota = idAnggota;
        System.out.println("Anggota: " + nama + " " + idAnggota);
    }

    @Override
    public void pinjamBuku(String judul){
        System.out.println(nama + " meminjam buku berjudul: " + judul);
        bukuDipinjam = judul;
    }

    public void pinjamBuku(String judul, int durasi){
        System.out.println(nama + " meminjam buku \"" + judul + "\" selama " + durasi + " hari");
        bukuDipinjam = judul;
    }

    @Override
    public void kembalikanBuku(){
        System.out.println(nama + " mengembalikan buku berjudul: " + bukuDipinjam);
    }
}