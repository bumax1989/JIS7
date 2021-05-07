package homework.lectures.lecture6.animal;

public class Parrot extends Bird {

    public Parrot() {
    }

    @Override
    public void flying() {
        System.out.println("Parrot is flying");
    }

    @Override
    public void eating() {
        System.out.println("Parrot is eating");
    }

    @Override
    protected void sleeping() {
        System.out.println("The parrot is sleeping");
    }

    public void talking() {
        System.out.println("Parrot is talking");
    }
}
