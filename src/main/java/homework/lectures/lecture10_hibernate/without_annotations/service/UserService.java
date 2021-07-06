package homework.lectures.lecture10_hibernate.without_annotations.service;

import homework.lectures.lecture10_hibernate.without_annotations.entity.User;

public interface UserService {

    public User create(String firstName, String lastName, String username, String email);
}
