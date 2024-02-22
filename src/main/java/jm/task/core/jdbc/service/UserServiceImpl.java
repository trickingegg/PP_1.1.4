package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private final UserDao userDao = new UserDaoJDBCImpl();

    public void createUsersTable() {
        userDao.createUsersTable();
    }

    public void dropUsersTable() {
        userDao.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
        System.out.printf("User с именем %s добавлен в базу данных\n", name);
    }

    public void removeUserById(long id) {
        userDao.removeUserById(id);
    }

    public List<User> getAllUsers() {
        List<User> users = userDao.getAllUsers();
        /*for (User user : users) {
            System.out.println(user.toString());
        }*/
        users.forEach(System.out::println);
        return users;
    }

    public void cleanUsersTable() {
        userDao.cleanUsersTable();
    }
}
