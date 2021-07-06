package homework.lectures.lecture10_hibernate.without_annotations.service;

import homework.lectures.lecture10_hibernate.without_annotations.entity.User;
import homework.lectures.lecture10_hibernate.without_annotations.session_factory_config.Configure;

public class UserServiceImpl implements UserService {
    @Override
    public User create(String firstName, String lastName, String username, String email) {
        var configure = new Configure();
        var sessionFactory = configure.init();
        var session = sessionFactory.openSession();

        var transaction = session.beginTransaction();

        User user = User.builder()
                .firstName(firstName)
                .lastName(lastName)
                .username(username)
                .email(email)
                .build();

        session.save(user);
        transaction.commit();
        session.close();
        return user;
    }
}
