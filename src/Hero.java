public class Hero {
    private int health;
    private int damage;
    private String superPower;

    public Hero(int health,int damage,String superPower) {
        this.superPower = superPower;
        this.health = health;
        this.damage = damage;

    }
    public Hero(int health,int damage ) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}
