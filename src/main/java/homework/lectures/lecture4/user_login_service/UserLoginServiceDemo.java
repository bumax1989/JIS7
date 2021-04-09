package homework.lectures.lecture4.user_login_service;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class UserLoginServiceDemo {
    private static final Logger logger = Logger.getLogger(UserLoginServiceDemo.class);

    public static void main(String[] args) {
        BasicConfigurator.configure();

        UserLoginService service = new UserLoginService();
        User userOne = new User("user-login", "user-password");
        User userTwo = new User("user-login", "user-password-12345");

        logger.info("Number attempts: " + userOne.getNumberAttempts());
        logger.info("User is blocked? " + userOne.isBlocked());
        logger.info("Password correct? " + service.login(userOne, "user-password-12345"));
        logger.info("Number attempts: " + userOne.getNumberAttempts());
        logger.info("is blocked " + userOne.isBlocked());
        logger.info("password correct " + service.login(userOne, "user-password-12345"));
        logger.info("Number attempts: " + userOne.getNumberAttempts());
        logger.info("is blocked " + userOne.isBlocked());
        logger.info("password correct " + service.login(userOne, "user-password-12345"));
        logger.info("is blocked " + userOne.isBlocked());
        logger.info("Number attempts: " + userTwo.getNumberAttempts());
        logger.info("User is blocked? " + userTwo.isBlocked());
        logger.info("Password correct? " + service.login(userTwo, "user-password-1234"));
        logger.info("Number attempts: " + userTwo.getNumberAttempts());
        logger.info("User is blocked? " + userTwo.isBlocked());
        logger.info("Password correct? " + service.login(userTwo, "user-password-12345"));
        logger.info("Number attempts: " + userTwo.getNumberAttempts());
    }
}
