package br.com.grupofour.javaflix.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
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
    private Long id;
    private String titulo;
    private LocalDateTime dataLacamento;
    private Double notaImdb;
    private LocalTime duracao;
}
