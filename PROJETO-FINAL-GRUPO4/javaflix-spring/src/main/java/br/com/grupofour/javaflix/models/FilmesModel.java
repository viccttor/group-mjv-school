package br.com.grupofour.javaflix.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author DiegoCardosoDev
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "tb_filmes")
public class FilmesModel {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo_filme")
    private String titulo;

    @Column
    private LocalDate dataLacamento;

    @Column
    private Double notaImdb;

    @Column
    private LocalTime duracao;
}
