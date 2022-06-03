package proj.jdbc.repository;

import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import proj.jdbc.domain.Member;

import java.sql.SQLException;
import java.util.NoSuchElementException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@Slf4j
public class MemberRepositoryV0Test {

   MemberRepositoryV0 repository = new MemberRepositoryV0();

   @Test
   @DisplayName("crud 테스트")
   void crud_테스트() throws SQLException {
       // given
       final Member member = new Member("memberV6", 10000);
       repository.save(member);

       // findById
       final Member findMember = repository.findById(member.getMemberId());
       log.info("findmember= {}", findMember);
       log.info("findmember= {}", findMember == member);
       log.info("findmember=equirs {}", findMember.equals(member));

       // 내가 비교 하려는것
       assertThat(findMember).isEqualTo(member);

       // update: money: 10000 -> 20000
       repository.update(member.getMemberId(), 20000);
       final Member updateMember = repository.findById(member.getMemberId());
       assertThat(updateMember.getMoney()).isEqualTo(20000);

       repository.delete(member.getMemberId());
       assertThatThrownBy(() -> repository.findById(member.getMemberId())).isInstanceOf(NoSuchElementException.class);
   }
}
