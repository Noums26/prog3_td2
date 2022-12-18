package school.hei.prog3_td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.prog3_td2.model.Team;
import school.hei.prog3_td2.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class TeamService {
    private TeamRepository repository;

    public List<Team> getTeams() {
        return repository.findAll();
    }

    public List<Team> createTeam(List<Team> teams) {
        return repository.saveAll(teams);
    }

    public List<Team> updateTeam(List<Team> teams) {
        return repository.saveAll(teams);
    }

    public Team deleteTeam(Integer teamId) {
        Optional<Team> team = repository.findById(teamId);

        if(team.isEmpty()) {
            throw new RuntimeException();
        }
        return team.get();
    }

}
