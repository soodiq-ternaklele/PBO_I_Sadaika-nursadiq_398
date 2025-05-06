import java.util.Scanner;

public class Rekening {

    String NomorRekening;
    String NamaPemilik;
    double saldo;

    public Rekening(String NomorRekening, String NamaPemilik, double saldo) {
        this.NomorRekening = NomorRekening;
        this.NamaPemilik = NamaPemilik;
        this.saldo = saldo;
    }

    void tampilkanInfo() {
        System.out.println("Nomor rekening : " + NomorRekening);
        System.out.println("Nama Pemilik   : " + NamaPemilik);
        System.out.println("Saldo          : Rp." + saldo);
        System.out.println();
    }

    public void SetorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(NamaPemilik + " Setor : Rp." + jumlah);
        System.out.println("Saldo sekarang : Rp." + saldo);
        System.out.println();
    }

    public void NarikDana(double jumlah) {
        if (jumlah > saldo) {
            System.out.println("Saldo anda tidak cukup");
        } else {
            saldo -= jumlah;
            System.out.println("Saldo yang ditarik : Rp." + jumlah);
            System.out.println("Saldo sekarang : Rp." + saldo);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Rekening rekening001 = new Rekening("202410370110398", "Soodiq", 500000);
        Rekening rekening002 = new Rekening("202410370110999", "Noeer", 200000);

        rekening001.tampilkanInfo();
        rekening002.tampilkanInfo();

        rekening001.SetorUang(150000);
        rekening002.NarikDana(50000);

        rekening001.tampilkanInfo();
        rekening002.tampilkanInfo();
    }
}
