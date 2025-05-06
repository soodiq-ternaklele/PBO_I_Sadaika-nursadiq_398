import javax.lang.model.element.Name;

public class Hewan{
    String Nama;
    String Jenis;
    String Suara;

    void tampilkanInfo(){
        System.out.println("Nama  : " + Nama);
        System.out.println("Jenis : " + Jenis);
        System.out.println("Suara : " + Suara);
    }
    public static void main(String[] args) {
        Hewan hewan001 = new Hewan();
        Hewan hewan002 = new Hewan();

        hewan001.Nama = " Kucing";
        hewan001.Jenis =" Mamalia";
        hewan001.Suara =" Miawww";

        hewan002.Nama  =" Anjing";
        hewan002.Jenis =" Mamalia";
        hewan002.Suara =" Woouf-woof";


        hewan001.tampilkanInfo();
        System.out.println("");
        hewan002.tampilkanInfo();

    }
}