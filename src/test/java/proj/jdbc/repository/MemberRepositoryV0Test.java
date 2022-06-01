package proj.jdbc.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import proj.jdbc.domain.Member;

import java.sql.SQLException;

public class MemberRepositoryV0Test {

   MemberRepositoryV0 repository = new MemberRepositoryV0();

   @Test
   @DisplayName("crud 테스트")
   void crud_테스트() throws SQLException {
       // given
       final Member member = new Member("memberV1", 10000);
       repository.save(member);
   }
}
