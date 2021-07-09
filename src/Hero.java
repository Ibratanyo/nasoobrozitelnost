import java.util.Random;

public class Hero {
   private int health;
   private int damage;
   private int superPowerDamage;

    public Hero(int health, int damage, int superPowerDamage) {
        this.health = health;
        this.damage = damage;
        this.superPowerDamage = superPowerDamage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;

    }

    public int getDamage() {
        return damage;

    }

    public void setDamage(int damage) {
        this.damage = damage;

    }

    public int getSuperPowerDamage() {
        return superPowerDamage;

    }

    public void setSuperPowerDamage(int superPowerDamage) {
        this.superPowerDamage = superPowerDamage;

    }

    public void superpower() {
        Random random = new Random();
        int power = random.nextInt(5);
        if (power == 1) {
            System.out.println("using power: Rasengan");

        }

        if (power == 2) {
            System.out.println("using power: rasenshuriken");

        }

        if (power == 3) {
            System.out.println("using power: odama rasengan");

        }


        if (power == 4) {
            System.out.println("using power: shadow cloning");

        }


    }
}
