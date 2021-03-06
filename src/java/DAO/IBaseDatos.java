package DAO;

import java.sql.SQLException;
import java.util.List;

public interface IBaseDatos<T> {

    List<T> findAll() throws SQLException;

    T find(int id) throws SQLException;

    boolean insert(T t) throws SQLException;

    boolean update(T t) throws SQLException;

    boolean delete(T t) throws SQLException;

}
