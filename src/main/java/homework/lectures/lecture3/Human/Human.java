package homework.lectures.lecture3.Human;

public class Human {
    private int age;
    private String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void greet() {
        System.out.println("Hi! My name is " + name + ", I'm " + age + " years old");
    }
}
