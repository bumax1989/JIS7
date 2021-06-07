package homework.lectures.lecture8_streams.user;

import java.util.ArrayList;
import java.util.List;

public class UserImplementationService {

    //TODO Создать модель User с полями id,  имя, фамилия, никнейм, возраст, емайл, пароль,
    // статус, флаг isActive. Статусы юзера могут быть: GUEST, USER, VIP USER. Создайте  юзеров
    // с разными статусами.

    List<User> userList = new ArrayList<>() {{
        add(new User(1L, "Max", "Buchynski", "Bumax1989", 31, "bumax1989@gmail.com", "123456", UserStatus.USER, true));
        add(new User(2L, "Aleksey", "Ivanov", "AIvanov", 20, "aivanov@gmail.com", "654321", UserStatus.GUEST, false));
        add(new User(3L, "Sergey", "Prtrov", "SPrtrov", 15, "sprtrov@gmail.com", "sgfsdg54654s", UserStatus.USER, false));
        add(new User(4L, "Olga", "Sidorova", "OSidorova", 13, "osidorova@gmail.com", "sDGS!<sf4", UserStatus.VIP_USER, true));
        add(new User(5L, "Ekaterina", "Bosaya", "EBosaya", 22, "ebosaya@gmail.com", "11111111", UserStatus.USER, false));
        add(new User(6L, "Viktoriya", "Polyakova", "VPolyakova", 22, "vpolyakova@gmail.com", "5011018", UserStatus.GUEST, true));
        add(new User(7L, "Ruslan", "Bernatov", "RBernatov", 24, "rbernatov@gmail.com", "qqqwwweeerrrtttyyy", UserStatus.GUEST, false));
        add(new User(8L, "Roman", "Hilkevich", "RHilkevich", 40, "rhilkevich@gmail.com", "asdasdasdad", UserStatus.VIP_USER, true));
        add(null);
    }};
}
