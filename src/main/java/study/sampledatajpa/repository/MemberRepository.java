package study.sampledatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.sampledatajpa.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {
}
