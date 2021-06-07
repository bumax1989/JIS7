package homework.lectures.lecture8_streams.user;

import org.apache.log4j.Logger;

public class App {

    public static final Logger log = Logger.getLogger(App.class);

    public static void main(String[] args) {

        UserImplementationService userImplementationService = new UserImplementationService();

        log.info("__________1___________");
        log.info(UserService.changeStatusAndFlag(userImplementationService.userList));
        log.info("__________2___________");
        log.info(UserService.sortUsersByNickName(userImplementationService.userList));
        log.info("__________3___________");
        log.info(UserService.getUsersWithStatusUSERAndIsActiveTRUE(userImplementationService.userList));


    }
}
