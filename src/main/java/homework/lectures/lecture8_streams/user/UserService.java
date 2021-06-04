package homework.lectures.lecture8_streams.user;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class UserService {

    private static final Integer EIGHTEEN = 18;

    //TODO 1. Написать методы которые проходят по коллекции юзеров в стриме и если
    // юзеры имеют статус guest, то засетать им статус USER  и перевести флаг isActive в true,
    // а если уже был USER и isActive то перевести в VIP USER.

    public static List<User> changeStatusAndFlag(List<User> userList) {
        return userList.stream()
                .filter(Objects::nonNull)
                .peek(it -> {
                    if (it.getUserStatus() == UserStatus.USER && it.isActive()) {
                        it.setUserStatus(UserStatus.VIPUSER);
                    }
                    if (it.getUserStatus() == UserStatus.GUEST) {
                        it.setUserStatus(UserStatus.USER);
                        it.setActive(true);
                    }
                })
                .collect(Collectors.toList());
    }

    //TODO 2.Написать метод который сортирует юзеров по нику и отфильтровывает чтобы в этой коллекции
    // были юзеры старше 18 лет, если младше то тем юзерам флаг меняется на isActive false и статус
    // переходит в guest

    public static List<User> sortUsersByNickName(List<User> userList) {

        return userList.stream()
                .filter(Objects::nonNull)
                .sorted(Comparator.comparing(User::getNickName))
                .peek(it -> {
                    if (it.getAge() < EIGHTEEN) {
                        it.setUserStatus(UserStatus.GUEST);
                        it.setActive(false);
                    }
                })
                .filter(it -> it.getAge() > EIGHTEEN)
                .collect(Collectors.toList());
    }

    //TODO 3. Написать метод который выводит количество юзеров со статусом USER и флагом true

    public static List<User> getUsersWithStatusUSERAndIsActiveTRUE(List<User> userList) {
        return userList.stream()
                .filter(Objects::nonNull)
                .filter(it -> it.getUserStatus() == UserStatus.USER && it.isActive())
                .collect(Collectors.toList());
    }


}
