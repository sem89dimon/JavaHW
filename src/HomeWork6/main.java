package HomeWork6;

public class main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Cat("Cat", "Barsik", 90, 1);
        animals[1] = new Cat("Cat", "Murzik", 120, 1);
        animals[2] = new Dog("Pug", "Juggernaut", 180, 11);
        animals[3] = new Dog("Buldog", "Barboss", 120, 12);


        for (int i = 0; i < animals.length ; i++) {
            System.out.println(animals[i].getInfo());

        }
        System.out.println("All animals = " + Animal.count + " > cat count = " + Cat.countCat + " > dog count = " + Dog.countDog);
        System.out.println("****************");
        for (int i = 0; i < animals.length; i++) {
            animals[i].run(100);
        }
        for (int i = 0; i < animals.length; i++) {
            animals[i].swim(10);
        }
    }

}
