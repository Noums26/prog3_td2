package school.hei.prog3_td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.prog3_td2.model.Match;
import school.hei.prog3_td2.model.Player;

public interface MatchRepository extends JpaRepository<Match, Integer> {
}
