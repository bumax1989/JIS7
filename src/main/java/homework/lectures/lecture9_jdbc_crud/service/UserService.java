package homework.lectures.lecture9_jdbc_crud.service;

import homework.lectures.lecture9_jdbc_crud.user.Status;
import homework.lectures.lecture9_jdbc_crud.user.User;

import java.sql.SQLException;
import java.util.Collection;

public interface UserService {

    User create(String firstName, String lastName, String username, Status status, String email) throws SQLException, ClassNotFoundException;

    User updateUser(User user, String username, Status status) throws SQLException, ClassNotFoundException;

    User findUserById(Integer id) throws SQLException, ClassNotFoundException;

    Collection<User> findUserByUsernameStartsWithFirstChAndEndsWithLastCh(Character firstCh, Character lastCh) throws SQLException, ClassNotFoundException;

    Collection<User> findAll() throws SQLException, ClassNotFoundException;

    void delete(Integer id) throws SQLException, ClassNotFoundException;
}
