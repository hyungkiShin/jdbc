package proj.jdbc.connection;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

import static org.assertj.core.api.Assertions.assertThat;

@Slf4j
public class DBConnectionUtilTest {

    @Test
    @DisplayName("db 커넥션 테스트")
    void db_커넥션_테스트() {
        // given
        final Connection connection = DBConnectionUtil.getConnection();
        // when then
        assertThat(connection).isNotNull();
    }
}
