package br.com.grupofour.javaflix.controllers;
import br.com.grupofour.javaflix.models.FilmesModel;
import br.com.grupofour.javaflix.services.FilmesService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(value = "/filmes")
public class FilmesController {

    /*injeção do service    */
    private FilmesService filmesService;

    /*listar todos filmes*/
    @GetMapping(value = "todos-filmes")
    public ResponseEntity<List<FilmesModel>> getAllFilmes(){
        return ResponseEntity.status(HttpStatus.OK).body(filmesService.findAll());
    }
}
