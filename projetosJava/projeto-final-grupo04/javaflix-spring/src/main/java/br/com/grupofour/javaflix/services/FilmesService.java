package br.com.grupofour.javaflix.services;

/*classe reponsável pela regras de negócio*/

import br.com.grupofour.javaflix.models.FilmesModel;
import br.com.grupofour.javaflix.repositories.FilmesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class FilmesService {


    /*INJELÇAO DO REPOSITORY*/
    private FilmesRepository filmesRepository;

    /*METODO PARA LISTAR TODOS*/
    public List<FilmesModel> findAll() {
        return filmesRepository.findAll();
    }


}
