package HomeWork6;

public class Dog extends Animal {
    public static int countDog = 0;
    public Dog(String type, String name, int run, int swim) {
        super(type, name, run, swim);
        ++countDog;
    }
}
