class User {
    private String name;
    private String NIM;

    public User(String name, String NIM) {
        this.name = name;
        this.NIM = NIM;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNIM(){
        return NIM;
    }
    public void setNIM(String NIM){
        this.NIM = NIM;
    }

    public void login() {
            //System.out.println("Login method");
    }
    public void DisplayInfo(){
        System.out.println("Data User : ");
        System.out.println("Name : " + name);
        System.out.println("NIM  : " + NIM);
    }
}