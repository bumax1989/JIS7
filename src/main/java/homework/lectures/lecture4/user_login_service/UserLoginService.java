package homework.lectures.lecture4.user_login_service;

public class UserLoginService {

    public boolean login(User user, String password) {

        boolean result;

        if (password.equals(user.getPassword()) && !user.blockUser()) {
            user.resetNumberAttempts();
            result = true;
        } else {

            user.setNumberAttempts(user.getNumberAttempts() - 1);
            if (user.getNumberAttempts() == 0) {
                user.blockUser();
            }
            result = false;
        }
        return result;
    }
}
