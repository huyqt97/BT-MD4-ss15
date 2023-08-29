package rikkei.academy.service;

import java.sql.SQLException;
import java.util.List;

public interface IUserService<T, E> {
     void insertUser(T t) throws SQLException;
    T selectUser(E e);
    List<T> selectAllUsers();
    boolean deleteUser(E e) throws SQLException;
    boolean updateUser(T t) throws SQLException;

}
