package proj.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static proj.jdbc.connection.ConnectionConst.*;

@Slf4j
public class ConnectionTest {
    
    @Test
    @DisplayName("DriverManager")
    void DriverManager() throws SQLException {
        final Connection con1 = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        final Connection con2 = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        log.info("connection={} class={}", con1, con1.getClass());
        log.info("connection={} class={}", con2, con2.getClass());
    }
}
