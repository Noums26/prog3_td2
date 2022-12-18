package school.hei.prog3_td2.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import school.hei.prog3_td2.model.Sponsor;
import school.hei.prog3_td2.model.Team;
import school.hei.prog3_td2.service.SponsorService;
import school.hei.prog3_td2.service.TeamService;

import java.util.List;

@RestController
@AllArgsConstructor
public class SponsorController {
    private SponsorService service;

    @GetMapping("/sponsors")
    public List<Sponsor> getSponsor() {
        return service.getSponsor();
    }

    @PostMapping("/sponsors")
    public List<Sponsor> createSponsor(@RequestBody List<Sponsor> toCreate) {
        return service.createSponsor(toCreate);
    }

    @PutMapping("/sponsors")
    public List<Sponsor> updateSponsor(@RequestBody List<Sponsor> toUpdate) {
        return service.updateSponsor(toUpdate);
    }

    @DeleteMapping("/sponsors/{teamId}")
    public Sponsor deleteSponsor(@PathVariable Integer sId) {
        return service.deleteSponsor(sId);
    }
}
