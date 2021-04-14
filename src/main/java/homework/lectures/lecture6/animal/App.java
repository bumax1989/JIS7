package homework.lectures.lecture6.animal;

public class App {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eating();
        animal.sleeping();

        Mammal mammal = new Mammal();
        mammal.eating();
        mammal.sleeping();

        Cat cat = new Cat();
        cat.eating();
        cat.mewing();
        cat.sleeping();
        cat.setAge(15);

        Dog dog = new Dog();
        dog.eating();
        dog.barking();
        dog.sleeping();

        Bird bird = new Bird();
        bird.eating();
        bird.flying();
        bird.sleeping();

        Parrot parrot = new Parrot();
        parrot.eating();
        parrot.flying();
        parrot.setAge(3);
        parrot.setName("Keshka");

    }
}
