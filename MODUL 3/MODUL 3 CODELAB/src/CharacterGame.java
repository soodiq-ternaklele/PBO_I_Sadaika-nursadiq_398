class CharacterGame {
    private String name;
    private int health;

    public CharacterGame(String name, int health){
        this.name = name;
        this.health = health;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }
    public int getHealth(){
        return health;
    }
    public void setHealt(int health){
        this.health = health;
    }
    public void Punch(CharacterGame target){
        System.out.println(getName() + "attack a enemy");
    }
}