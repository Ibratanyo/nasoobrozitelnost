public class Main {
    public static void main(String[] args) {
        MagicDoor magic = new MagicDoor();

        for (int i = 0; i < magic.getHeroes().length; i++) {
            System.out.println(magic.getHeroes()[i].getHealth() + " " + magic.getHeroes()[i].getDamage());
        }

    }
}
