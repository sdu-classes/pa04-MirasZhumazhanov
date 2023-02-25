public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        this("Nemo");
    }

    public Fish(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating", this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.printf("Fish %s is playing", this.name);
    }

    @Override
    public void walk() {
        throw new UnsupportedOperationException("Fish doesn't walk!!!");
    }
}