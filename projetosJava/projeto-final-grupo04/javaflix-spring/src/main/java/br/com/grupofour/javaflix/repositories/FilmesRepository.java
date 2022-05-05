package br.com.grupofour.javaflix.repositories;

import br.com.grupofour.javaflix.models.FilmesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmesRepository extends JpaRepository<FilmesModel, Long> {



}
