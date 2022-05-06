package br.com.grupofour.javaflix.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author DiegoCardosoDev
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_series")
public class SeriesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo_series", nullable = false, length = 30)
    private String titulo;

    @Column
    private LocalDateTime dataLacamento;

    @Column
    private Integer qtdTemporada;

    @Column
    private Integer qtdEpisodios;

    private Integer qtdTemporadas;
}
