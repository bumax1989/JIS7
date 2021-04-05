package homework.lectures.lecture3.dog;
//********Checked***********
public class Dog {
    private int age;
    private String name;
    private String color;

    public Dog(int age, String name, String color) {
        this.age = age;
        this.name = name;
        this.color = color;
    }

    public void voice() {
        System.out.println(name + " is barking. He is " + age + " years old.");
    }

    public void eat() {
        System.out.println(name + " is eating. His color is " + color);
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

}
