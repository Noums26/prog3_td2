package school.hei.prog3_td2.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import school.hei.prog3_td2.model.Player;
import school.hei.prog3_td2.model.Team;
import school.hei.prog3_td2.service.PlayerService;
import school.hei.prog3_td2.service.TeamService;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlayerController {
    private PlayerService service;

    @GetMapping("/players")
    public List<Player> getPlayer() {
        return service.getPlayer();
    }

    @PostMapping("/players")
    public List<Player> createPlayer(@RequestBody List<Player> toCreate) {
        return service.createPlayer(toCreate);
    }

    @PutMapping("/players")
    public List<Player> updatePlayer(@RequestBody List<Player> toUpdate) {
        return service.updatePlayer(toUpdate);
    }

    @DeleteMapping("/players/{pId}")
    public Player deletePlayer(@PathVariable Integer pId) {
        return service.deletePlayer(pId);
    }
}
