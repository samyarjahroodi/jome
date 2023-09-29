package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SuppressWarnings("unused")
public class DataSource {
    private static Connection connection;

    static {
        try {
            connection = DriverManager.getConnection(ApplicationProperties.URL
                    , ApplicationProperties.USERNAME, ApplicationProperties.PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return connection;
    }

}
