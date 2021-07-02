package homework.lectures.lecture9_jdbc_crud.service;

import homework.lectures.lecture9_jdbc_crud.dbconfig.PostgresConnector;
import homework.lectures.lecture9_jdbc_crud.user.Status;
import homework.lectures.lecture9_jdbc_crud.user.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public class UserServiceImpl implements UserService {

    @Override
    public User create(String firstName, String lastName, String username, Status status, String email) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "INSERT INTO \"user\" (first_name, last_name, username, status, email) VALUES (?, ?, ?, ?, ?)";
        var statement = connection.prepareStatement(sql);

        statement.setString(1, firstName);
        statement.setString(2, lastName);
        statement.setString(3, username);
        statement.setString(4, status.name());
        statement.setString(5, email);

        var rowsCreated = statement.executeUpdate();
        if (rowsCreated > 0) {
            System.out.println("A new user with username " + username + " was created successfully!");
        }
        statement.close();
        connection.close();
        return new User(firstName, lastName, username, status, email);
    }

    @Override
    public User updateUser(User user, String username, Status status) throws SQLException, ClassNotFoundException {
        var connection = PostgresConnector.getConnection();
        String sql = "UPDATE \"user\" SET first_name = ?, last_name = ?, username = ?, status = ?, email = ?  WHERE id = " + user.getId();
        var statement = connection.prepareStatement(sql);

        statement.setString(1, user.getFirstName());
        statement.setString(2, user.getLastName());
        statement.setString(3, username);
        statement.setString(4, status.name());
        statement.setString(5, user.getEmail());

        var rowUpdate = statement.executeUpdate();
        if (rowUpdate > 0) {
            System.out.println("The user with id " + user.getId() + " was updated successfully");
        }
        statement.close();
        connection.close();
        return user;
    }

    @Override
    public User findUserById(Integer id) throws SQLException, ClassNotFoundException {
        var statement = PostgresConnector.getStatement();
        String sql = "SELECT * FROM \"user\" WHERE id = " + id;
        var resultSet = statement.executeQuery(sql);

        User user = new User();
        while (resultSet.next()) {
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setUsername(resultSet.getString("username"));
            user.setStatus(Status.valueOf(resultSet.getString("status")));
            user.setEmail(resultSet.getString("email"));
        }
        resultSet.close();
        statement.close();
        statement.getConnection().close();
        return user;
    }

    @Override
    public Collection<User> findUserByUsernameStartsWithFirstChAndEndsWithLastCh(Character firstCh, Character lastCh) throws SQLException, ClassNotFoundException {

        var connection = PostgresConnector.getConnection();
        String sql = "SELECT * FROM \"user\" WHERE username LIKE ?;";
        var statement = connection.prepareStatement(sql);
        statement.setString(1, firstCh + "%" + lastCh);
        var resultSet = statement.executeQuery();

        Collection<User> userList = new ArrayList<>();

        System.out.println("Users that presented in database:");

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setUsername(resultSet.getString("username"));
            user.setStatus(Status.valueOf(resultSet.getString("status")));
            user.setEmail(resultSet.getString("email"));
            userList.add(user);
        }
        resultSet.close();
        statement.close();
        statement.getConnection().close();
        return userList;
    }

    @Override
    public Collection<User> findAll() throws SQLException, ClassNotFoundException {
        var statement = PostgresConnector.getStatement();
        String sql = "SELECT * FROM \"user\";";
        var resultSet = statement.executeQuery(sql);

        Collection<User> userList = new ArrayList<>();

        System.out.println("Users that presented in database:");

        while (resultSet.next()) {
            User user = new User();
            user.setId(resultSet.getInt("id"));
            user.setFirstName(resultSet.getString("first_name"));
            user.setLastName(resultSet.getString("last_name"));
            user.setUsername(resultSet.getString("username"));
            user.setStatus(Status.valueOf(resultSet.getString("status")));
            user.setEmail(resultSet.getString("email"));
            userList.add(user);
        }

        resultSet.close();
        statement.close();
        statement.getConnection().close();
        return userList;
    }

    @Override
    public void delete(Integer id) throws SQLException, ClassNotFoundException {
        var statement = PostgresConnector.getStatement();

        String sql = "DELETE FROM \"user\" WHERE id = " + id;

        statement.executeUpdate(sql);
        System.out.println("The user with id = " + id + " was deleted");
        statement.close();
        statement.getConnection().close();
    }
}