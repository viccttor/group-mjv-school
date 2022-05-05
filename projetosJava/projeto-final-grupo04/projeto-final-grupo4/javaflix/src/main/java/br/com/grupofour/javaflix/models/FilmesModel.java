package br.com.grupofour.javaflix.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author DiegoCardosoDev
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "filmes")
public class FilmesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String titulo;

    @Column
    private LocalDateTime dataLacamento;

    @Column
    private Double notaImdb;

    @Column
    private LocalTime duracao;
}
