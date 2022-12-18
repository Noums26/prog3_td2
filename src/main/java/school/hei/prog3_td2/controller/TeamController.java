package school.hei.prog3_td2.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import school.hei.prog3_td2.model.Team;
import school.hei.prog3_td2.service.TeamService;

import java.util.List;

@RestController
@AllArgsConstructor
public class TeamController {
    private TeamService service;

    @GetMapping("/teams")
    public List<Team> getTeams() {
        return service.getTeams();
    }

    @PostMapping("/teams")
    public List<Team> createTeams(@RequestBody List<Team> toCreate) {
        return service.createTeam(toCreate);
    }

    @PutMapping("/teams")
    public List<Team> updateTeams(@RequestBody List<Team> toUpdate) {
        return service.updateTeam(toUpdate);
    }

    @DeleteMapping("/teams/{teamId}")
    public Team deleteTeam(@PathVariable Integer teamId) {
        return service.deleteTeam(teamId);
    }
}
