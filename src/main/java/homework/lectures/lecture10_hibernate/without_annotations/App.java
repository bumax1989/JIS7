package homework.lectures.lecture10_hibernate.without_annotations;

import homework.lectures.lecture10_hibernate.without_annotations.service.UserServiceImpl;

public class App {
    public static void main(String[] args) {
        var userService = new UserServiceImpl();
        var userEntity = userService.create("Serg", "ss", "asdas","asdas89@gmail.com");
        System.out.println(userEntity);
    }
}
