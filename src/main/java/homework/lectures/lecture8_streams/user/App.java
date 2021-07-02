package homework.lectures.lecture8_streams.user;

import org.apache.log4j.Logger;

public class App {

    public static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {

        UserRepository userRepository = new UserRepository();

        log.info("__________1___________");
        log.info(UserService.updateUserStatusAndFlag(userRepository.userList));
        log.info("__________2___________");
        log.info(UserService.sortUsersByNickNameWithAgeMoreThenEighteenAndSetIsActiveFalseAndSetUserStatusToGuest(userRepository.userList));
        log.info("__________3___________");
        log.info(UserService.getUsersWithStatusUserAndIsActiveTrue(userRepository.userList));


    }
}
