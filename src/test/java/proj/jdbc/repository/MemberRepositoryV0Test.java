package proj.jdbc.repository;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import proj.jdbc.domain.Member;

import java.sql.SQLException;

@Slf4j
public class MemberRepositoryV0Test {

   MemberRepositoryV0 repository = new MemberRepositoryV0();

   @Test
   @DisplayName("crud 테스트")
   void crud_테스트() throws SQLException {
       // given
       final Member member = new Member("memberV1", 10000);
       repository.save(member);

       // find By Id
       final Member findMember = repository.findById(member.getMemberId());
       log.info("findmember= {}", findMember);

       // 내가 비교 하려는것
       Assertions.assertThat(findMember).isEqualTo(member);
   }
}
