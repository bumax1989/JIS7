package homework.lectures.lectrure5.exceptions1;

public class UserValidationDemo {
    public static void main(String[] args) {
        User user = new User("Adgg","Wertdsdf",150);

        UserValidationService.validate(user);
    }
}
