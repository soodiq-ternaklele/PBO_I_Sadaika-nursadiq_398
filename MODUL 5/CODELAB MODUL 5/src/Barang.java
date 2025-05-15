public class Barang {
    public String NamaBarang;
    private int Stok;

    public Barang(String NamaBarang, int stok) {
        this.NamaBarang = NamaBarang;
        this.Stok = stok;
    }

    public void setNamaBarang(String namaBarang) {
        this.NamaBarang = namaBarang;
    }

    public String getNamaBarang() {
        return NamaBarang;
    }

    public void setStok(int stok) {
        this.Stok = stok;
    }

    public int getStok() {
        return Stok;
    }
}
