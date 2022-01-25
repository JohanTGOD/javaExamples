package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static database.DataBaseConfiguration.*;

public interface IDBConnection {
    default Connection connectToDb() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL + DB, USER, PASSWORD);
            if (connection != null) {
                System.out.println("There is a connection");
            }
        } catch (SQLException throwables) {
            System.out.println("Something is wrong 2");
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Something is wrong 3");
            e.printStackTrace();
        } finally {
            return connection;
        }
    }
}
