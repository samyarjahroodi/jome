import domain.User;
import util.ApplicationContext;

import java.sql.SQLException;

public class OopJdbcConnection {
    public static void main(String[] args) throws SQLException {
        ApplicationContext applicationContext = new ApplicationContext();
        User user = new User(5, "zahra");
        applicationContext.getUserService().update(user);

//        applicationContext.getUserService().s;

    }
}
