class Enemy extends CharacterGame {
    public Enemy(String name, int health) {
        super(name, health);
    }

    @Override
    public void Punch(CharacterGame target) {
        System.out.println(getName() + " Damage per second");
        target.setHealt(target.getHealth() - 20);
        System.out.println(" Hp " + target.getName() + " tersisa " + target.getHealth());
    }
}