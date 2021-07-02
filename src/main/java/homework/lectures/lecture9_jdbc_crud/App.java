package homework.lectures.lecture9_jdbc_crud;

import homework.lectures.lecture9_jdbc_crud.service.UserService;
import homework.lectures.lecture9_jdbc_crud.service.UserServiceImpl;
import homework.lectures.lecture9_jdbc_crud.user.Status;
import homework.lectures.lecture9_jdbc_crud.user.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class App {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        UserService userService = new UserServiceImpl();

        var use1 = userService.create("Max", "Ivanov", "max1733", Status.VIP, "max@mail.ru");
        var user2 = userService.create("Olga", "Petrova", "Simona", Status.USER, "olga@mail.ru");
        var user3 = userService.create("Alex", "Alexov", "destroyer777888", Status.USER, "destroyer777888@mail.ru");
        var user4 = userService.create("Victor", "Victorov", "blade", Status.GUEST, "blade@mail.ru");
        var user5 = userService.create("Andre", "Andreev", "Vic_tik", Status.VIP, "andre@mail.ru");
        var user6 = userService.create("Sergey", "Svetlakov", "mavenik3", Status.GUEST, "serg@tut.by");

        System.out.println(userService.findUserById(2));

        ArrayList<User> all = (ArrayList<User>) userService.findAll();
        all.forEach(System.out::println);

        userService.updateUser(all.get(1), "olga1234", Status.VIP);

        userService.delete(4);

        ArrayList<User> usersWithFilterAZ = (ArrayList<User>) userService.findUserByUsernameStartsWithFirstChAndEndsWithLastCh('m', '3');
        usersWithFilterAZ.forEach(System.out::println);

    }
}