package homework.lectures.lecture6.animal;

public abstract class Mammal extends Animal {
    private Double bodyTemperature;


    Mammal(Integer age, String name, String color, String weight, String height, Double bodyTemperature) {
        super(age, name, color, weight, height);
        this.bodyTemperature = bodyTemperature;
    }

    public Double getBodyTemperature() {
        return bodyTemperature;
    }

    public void setBodyTemperature(Double bodyTemperature) {
        this.bodyTemperature = bodyTemperature;
    }

    @Override
    public abstract void eating();


}
