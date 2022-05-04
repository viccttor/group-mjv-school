package br.com.grupofour.javaflix.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * @author DiegoCardosoDev
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "series")
public class SeriesModel {

    @Id
    private Long id;
    private String titulo;
    private LocalDateTime dataLacamento;
    private Integer qtdTemporada;
    private Integer qtdEpisodios;
}
