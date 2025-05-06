import java.util.Scanner;

public class Mahasiswa extends User{
    String name;
    String NIM;
    public Mahasiswa(String name, String NIM) {
        super(name, NIM);
        this.name = name;
        this.NIM = NIM;
    }
    @Override
    public void login() {
        Scanner Milih = new Scanner(System.in);
            System.out.println("Masukan Nama : ");
            String name = Milih.nextLine();
            System.out.println("Masukan NIM : ");
            String NIM = Milih.nextLine();

        if (getName().equals(name) &&  getNIM().equals(NIM)){
            DisplayInfo();
        } else {
            System.out.println("Nama atau NIM tidak terdaftar");
        }
    }
    //@Override
    public void DisplayInfo(){
        super.DisplayInfo();
    }
}
