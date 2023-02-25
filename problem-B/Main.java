public class Main {
    public static void main(String[] args) {
        Fish d = new Fish();
        d.eat();
        try {
            d.walk();
        } catch (UnsupportedOperationException e) {
            System.out.println("\n" + e.getMessage());
        }

        Cat c = new Cat("Fluffy");
        c.eat();
        c.setName("Masya");
        c.eat();
        c.play();

        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
    }
}
