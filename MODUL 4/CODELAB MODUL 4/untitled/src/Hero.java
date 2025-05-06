public class Hero {
    private String name;
    public int umur;

    public Hero(String name, int umur) {
        this.name = name;
        this.umur = umur;
    }

    public Hero(String name) {
        this.name = name;
    }
    public Hero() {
    }
    public void melindungi() {
        System.out.println("Hero melindungi masyarakay");
    }
}
