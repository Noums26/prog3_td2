package school.hei.prog3_td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.prog3_td2.model.Match;
import school.hei.prog3_td2.model.Player;
import school.hei.prog3_td2.repository.MatchRepository;
import school.hei.prog3_td2.repository.PlayerRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MatchService {
    private MatchRepository repository;

    public List<Match> getMatch() {
        return repository.findAll();
    }

    public List<Match> createMatch(List<Match> matches) {
        return repository.saveAll(matches);
    }

    public List<Match> updateMatch(List<Match> matches) {
        return repository.saveAll(matches);
    }

    public Match deleteMatch(Integer mId) {
        Optional<Match> match = repository.findById(mId);

        if(match.isEmpty()) {
            throw new RuntimeException();
        }
        return match.get();
    }

}
