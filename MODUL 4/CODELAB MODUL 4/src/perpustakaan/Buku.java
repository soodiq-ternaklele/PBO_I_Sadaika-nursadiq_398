package perpustakaan;

public abstract class Buku {
    public String judul, penulis, genre;
    public Buku(String judul, String penulis, String genre){
        this.judul = judul;
        this.penulis = penulis;
        this.genre = genre;
    }

    public abstract void displayInfo();
}