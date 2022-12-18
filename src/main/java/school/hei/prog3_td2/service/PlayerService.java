package school.hei.prog3_td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.prog3_td2.model.Player;
import school.hei.prog3_td2.model.Team;
import school.hei.prog3_td2.repository.PlayerRepository;
import school.hei.prog3_td2.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PlayerService {
    private PlayerRepository repository;

    public List<Player> getPlayer() {
        return repository.findAll();
    }

    public List<Player> createPlayer(List<Player> players) {
        return repository.saveAll(players);
    }

    public List<Player> updatePlayer(List<Player> players) {
        return repository.saveAll(players);
    }

    public Player deletePlayer(Integer pId) {
        Optional<Player> player = repository.findById(pId);

        if(player.isEmpty()) {
            throw new RuntimeException();
        }
        return player.get();
    }

}
