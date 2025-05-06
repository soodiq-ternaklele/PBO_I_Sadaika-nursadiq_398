//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Hero batman = new Batman("Ken",30);
        //batman.attack();
        //batman.attack("Goverment");
        batman.melindungi();

        batman = new Hero();
        batman.melindungi();

    }
}