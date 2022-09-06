package classes;

public class Audi extends Car implements Runnable{
    @Override
    public void drive() {
        super.drive();
        System.out.println("Audi class...");
    }

    @Override
    public void run() {
        System.out.println("This is Thread implement");
    }
}
