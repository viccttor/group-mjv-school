package br.com.grupofour.javaflix.controllers;
import br.com.grupofour.javaflix.models.FilmesModel;
import br.com.grupofour.javaflix.services.FilmesService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping(value = "/filmes")
public class FilmesController {

    private FilmesService filmesService;

    @GetMapping
    public ResponseEntity<List<FilmesModel>> listAll(){
        List<FilmesModel> list = filmesService.listAll();
        return ResponseEntity.ok().body(list);
    }
}
