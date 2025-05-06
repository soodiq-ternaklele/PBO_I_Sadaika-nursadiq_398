
public class Main {
    public static void main(String[] args) {
        CharacterGame karakter = new CharacterGame("Karakter Umum", 100);
        Hero entoni = new Hero("Entoni", 150);
        Enemy niki = new Enemy("Niki", 200);

        System.out.println("==STATUS AWAL==");
        System.out.println("karakter memiliki kesehatan: " + karakter.getHealth());
        System.out.println(entoni.getName() + " memiliki kesehatan: " + entoni.getHealth());
        System.out.println(niki.getName() + " memiliki kesehatan: " + niki.getHealth());

        System.out.println("\n--- PERTARUNGAN ---");

        entoni.Punch(niki);
        niki.Punch(entoni);
    }
}