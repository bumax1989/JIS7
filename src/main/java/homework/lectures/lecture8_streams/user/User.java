package homework.lectures.lecture8_streams.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String name;
    private String lastName;
    private String nickName;
    private Integer age;
    private String email;
    private String password;
    private UserStatus userStatus;
    private boolean isActive;
}
