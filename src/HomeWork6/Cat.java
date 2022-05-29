package HomeWork6;

public class Cat extends Animal {
    public static int countCat = 0;
    public Cat(String type, String name, int run, int swim) {
        super(type, name, run, swim);
        ++countCat;
    }
}
