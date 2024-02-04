public class Cheetah implements Animal {
    private int steps = 0;
    @Override
    public void makeSound() {
        System.out.println("Grrrr");
    }

    @Override
    public void run() {
        steps += 5;
    }
}
