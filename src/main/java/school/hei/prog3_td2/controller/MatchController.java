package school.hei.prog3_td2.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import school.hei.prog3_td2.model.Match;
import school.hei.prog3_td2.model.Player;
import school.hei.prog3_td2.service.MatchService;
import school.hei.prog3_td2.service.PlayerService;

import java.util.List;

@RestController
@AllArgsConstructor
public class MatchController {
    private MatchService service;

    @GetMapping("/match")
    public List<Match> getMatch() {
        return service.getMatch();
    }

    @PostMapping("/match")
    public List<Match> createMatch(@RequestBody List<Match> toCreate) {
        return service.createMatch(toCreate);
    }

    @PutMapping("/match")
    public List<Match> updateMatch(@RequestBody List<Match> toUpdate) {
        return service.updateMatch(toUpdate);
    }

    @DeleteMapping("/match/{mId}")
    public Match deleteMatch(@PathVariable Integer mId) {
        return service.deleteMatch(mId);
    }
}
