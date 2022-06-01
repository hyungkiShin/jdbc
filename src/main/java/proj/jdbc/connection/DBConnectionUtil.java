package proj.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static proj.jdbc.connection.ConnectionConst.*;

@Slf4j
public class DBConnectionUtil {
    // jdbc interface 의 표준 connection
    public static Connection getConnection() {
        try {
            final Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get connection={}, class={}",connection, connection.getClass());
            return connection;
        } catch (SQLException e) {
            throw new IllegalStateException();
        }
    }
}
