package school.hei.prog3_td2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "play_against")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    private LocalDateTime datetime;
    private String stadium;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id_1", nullable = false)
    private Team team_1;
    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "team_id_2", nullable = false)
    private Team team_2;
}
