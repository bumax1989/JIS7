package homework.lectures.lecture6.animal;

import java.util.Objects;

public class Animal {
    private Integer age;
    private String name;
    private String color;
    private String weight;
    private String height;

    public Animal() {
    }

    public Animal(Integer age, String name, String color, String weight, String height) {
        this.age = age;
        this.name = name;
        this.color = color;
        this.weight = weight;
        this.height = height;
    }

    public void eating(){
        System.out.println("Animal is eating");
    }

    protected void sleeping(){
        System.out.println("Animal is sleeping");
    }

    private void running(){
        System.out.println("Animal is running");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(age, animal.age) &&
                Objects.equals(name, animal.name) &&
                Objects.equals(color, animal.color) &&
                Objects.equals(weight, animal.weight) &&
                Objects.equals(height, animal.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color, weight, height);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                '}';
    }
}
