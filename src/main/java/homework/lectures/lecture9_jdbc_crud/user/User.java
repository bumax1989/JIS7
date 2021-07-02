package homework.lectures.lecture9_jdbc_crud.user;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {

    private Integer id;
    private String firstName;
    private String lastName;
    private String username;
    private Status status;
    private String email;

    public User(String firstName, String lastName, String username, Status status, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.status = status;
        this.email = email;
    }
}