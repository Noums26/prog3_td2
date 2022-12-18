package school.hei.prog3_td2.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import school.hei.prog3_td2.model.Sponsor;
import school.hei.prog3_td2.model.Team;
import school.hei.prog3_td2.repository.SponsorRepository;
import school.hei.prog3_td2.repository.TeamRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class SponsorService {
    private SponsorRepository repository;

    public List<Sponsor> getSponsor() {
        return repository.findAll();
    }

    public List<Sponsor> createSponsor(List<Sponsor> sponsor) {
        return repository.saveAll(sponsor);
    }

    public List<Sponsor> updateSponsor(List<Sponsor> sponsor) {
        return repository.saveAll(sponsor);
    }

    public Sponsor deleteSponsor(Integer sId) {
        Optional<Sponsor> sponsor = repository.findById(sId);

        if(sponsor.isEmpty()) {
            throw new RuntimeException();
        }
        return sponsor.get();
    }

}
