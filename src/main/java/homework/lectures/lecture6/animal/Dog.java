package homework.lectures.lecture6.animal;

public class Dog extends Mammal {
    public Dog(Integer age, String name, String color, String weight, String height, Double bodyTemperature) {
        super(age, name, color, weight, height, bodyTemperature);
    }

    public void eating() {
        System.out.println("Dog is eating");
    }

    public void barking() {
        System.out.println("Dog is barking");
    }

    @Override
    protected void sleeping() {
        System.out.println("Dog is sleeping");
    }


}
