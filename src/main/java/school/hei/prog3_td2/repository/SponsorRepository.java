package school.hei.prog3_td2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import school.hei.prog3_td2.model.Player;
import school.hei.prog3_td2.model.Sponsor;

public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
}
