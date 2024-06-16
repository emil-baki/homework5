public class Main {
    public static void main(String[] args) {
    Boss boss = new Boss();
    boss.setDamage(22);
    boss.setHealth(266);
    boss.setDefence("Magic");
        System.out.println("Boss information: ");
        System.out.println("boss health: " + boss.getHealth());
        System.out.println("boss damage:" + boss.getDamage());
        System.out.println("boss defence: " + boss.getDefence());

        System.out.println("Heroes information: ");
        Hero [] heroes = createHero();
        for (Hero hero : heroes){
            System.out.println("hero health: " + hero.getHealth());
            System.out.println("hero damage: " + hero.getDamage());
            System.out.println("hero superpower: " + hero.getSuperPower());
        }
    }
    public static Hero [] createHero(){
        Hero hero1 = new Hero(150,25,"fly");
        Hero hero2 = new Hero(200,24,"fire");
        Hero hero3 = new Hero(222,11);
        return new Hero [] {hero1, hero2, hero3};
    }
}