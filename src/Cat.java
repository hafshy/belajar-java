public class Cat implements Animal, Pet {
    private int steps = 0;
    @Override
    public void makeSound() {
        System.out.println("Meow meow");
    }

    @Override
    public void run() {
        steps += 1;
    }

    @Override
    public void patPat() {
        System.out.println("Krrrr");
    }
}
