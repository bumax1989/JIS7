package homework.lectures.lecture6.animal;

public class App {
    public static void main(String[] args) {

        Cat cat = new Cat(2, "Vaska", "black", "4 kg", "15 cm", 40.0);
        cat.eating();
        cat.mewing();
        cat.sleeping();
        cat.setAge(15);

        Dog dog = new Dog(2, "Riokko", "tiger", "25 kg", "70 cm", 39.0);
        dog.eating();
        dog.barking();
        dog.sleeping();

        Parrot parrot = new Parrot();
        parrot.eating();
        parrot.flying();
        parrot.setAge(3);
        parrot.setName("Keshka");

    }
}
