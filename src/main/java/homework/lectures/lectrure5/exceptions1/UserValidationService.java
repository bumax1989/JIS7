package homework.lectures.lectrure5.exceptions1;

import org.apache.log4j.Logger;

public class UserValidationService {
    private static final Logger logger = Logger.getLogger(UserValidationService.class);

    public static void validate(User user) {
        //TODO

        Integer firstNameLength = user.getFirstName().length();
        if (firstNameLength <= 3 || firstNameLength >= 15) {
            throw new UserValidationException("The name should be greater than 3 symbols");
        }

        Integer lastNameLength = user.getLastName().length();
        if (lastNameLength <= 3 || lastNameLength >= 15) {
            throw new UserValidationException("The last name should be greater than 3 symbols");
        }

        Integer ageRange = user.getAge();
        if (ageRange <= 0 || ageRange > 120) {
            throw new UserValidationException("The range must be not less then 0 and not greater than 120 years");
        }
    }


}
