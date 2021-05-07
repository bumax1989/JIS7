package homework.lectures.lecture6.animal;

public abstract class Bird extends Animal {
    private String wingsLength;

    public Bird() {
    }

    public Bird(Integer age, String name, String color, String weight, String height, String wingsLength) {
        super(age, name, color, weight, height);
        this.wingsLength = wingsLength;
    }

    public abstract void flying();

}
