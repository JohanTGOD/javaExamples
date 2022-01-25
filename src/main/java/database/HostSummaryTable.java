package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import static database.DataBaseConfiguration.*;

public interface HostSummaryTable extends IDBConnection {

    void createSome();

    default ArrayList<Object> read() {
        try (Connection connection = connectToDb()) {
            String query = "SELECT * FROM " + TABLE_HOST_SUMMARY;
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String string = resultSet.getString(TABLE_HOST_SUMMARY_STAMENTS);
                String string2 = resultSet.getString(TABLE_HOST_LATENCY);
                System.out.println("Information is: " + string + " And " + string2);
            }
        } catch (SQLException throwables) {
            System.out.println("Something is wrong");
            throwables.printStackTrace();
        }
        return new ArrayList<Object>();
    }
}
