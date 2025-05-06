class Hero extends CharacterGame{
    public Hero(String name, int health){
        super(name , health);
    }
    @Override
    public void Punch(CharacterGame target){
        System.out.println(getName() + " Damage area");
        target.setHealt(target.getHealth() - 25);
        System.out.println(" Hp " + target.getName() + " tersisa " + target.getHealth());
    }

}
