package homework.lectures.lecture4.user_login_service;

public class User {

    private String login;
    private String password;
    private boolean isBlocked;
    private  Integer numberAttempts = 3;

    public boolean isBlocked() {
        return isBlocked;
    }

    public void setBlocked(boolean blocked) {
        isBlocked = blocked;
    }

    public Integer getNumberAttempts() {
        return numberAttempts;
    }

    public void setNumberAttempts(Integer numberAttempts) {
        this.numberAttempts = numberAttempts;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer resetNumberAttempts() {
        numberAttempts = 3;
        return numberAttempts;
    }

    public boolean blockUser() {
            if(numberAttempts==0) {
                isBlocked = true;
            }
            return isBlocked;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
}


