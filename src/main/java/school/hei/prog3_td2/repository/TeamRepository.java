package school.hei.prog3_td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.prog3_td2.model.Team;

public interface TeamRepository extends JpaRepository<Team, Integer> {
}
