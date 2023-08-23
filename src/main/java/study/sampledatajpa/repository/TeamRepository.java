package study.sampledatajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.sampledatajpa.entity.Team;

public interface TeamRepository extends JpaRepository<Team, Long> {
}
