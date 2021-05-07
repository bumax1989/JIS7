package homework.lectures.lecture6.animal;

public class Cat extends Mammal {

    public Cat(Integer age, String name, String color, String weight, String height, Double bodyTemperature) {
        super(age, name, color, weight, height, bodyTemperature);
    }

    @Override
    public void eating() {
        System.out.println("Cat is eating");
    }

    @Override
    protected void sleeping() {
        System.out.println("Cat is sleeping");
    }

    public void mewing() {
        System.out.println("Cat is mewing");
    }


}
