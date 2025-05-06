import java.util.Scanner;

class Admin extends User {
    private String username;
    private String password;
    Scanner scan = new Scanner(System.in);

    public Admin(String username, String password) {
        super(username, password);
        this.username = username;
        this.password = password;
    }

    public void login() {
        Scanner Milih = new Scanner(System.in);
        System.out.println("Masukan Username : ");
        String username = Milih.nextLine();
        System.out.println("Masukan password : ");
        String password = Milih.nextLine();

        if (username.equals(username) && this.password.equals(password)) {
            System.out.println("Berhasil Login!");
            System.out.println("Username : "+ username);
            System.out.println("Code     : 0001");
        } else {
            System.out.println("Password atau username salah!");
        }
    }
        @Override
        public void DisplayInfo(){
            super.DisplayInfo();
        }
    }
