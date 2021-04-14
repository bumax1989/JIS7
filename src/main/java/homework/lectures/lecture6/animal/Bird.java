package homework.lectures.lecture6.animal;

public class Bird extends Animal {
    private String wingsLength;

    public Bird() {
    }

    public Bird(Integer age, String name, String color, String weight, String height, String wingsLength) {
        super(age, name, color, weight, height);
        this.wingsLength = wingsLength;
    }

    public void flying() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eating() {
        System.out.println("Bird is eating");
    }

    @Override
    protected void sleeping() {
        System.out.println("Bird is sleeping");
    }

}
