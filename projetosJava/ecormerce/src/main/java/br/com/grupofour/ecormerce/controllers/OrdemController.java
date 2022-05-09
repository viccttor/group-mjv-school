package br.com.grupofour.ecormerce.controllers;

import br.com.grupofour.ecormerce.models.OrdemDeServico;
import br.com.grupofour.ecormerce.repositories.OrdemRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pedidos")
public class OrdemController {


         private OrdemRepository ordemRepository;

    public OrdemController(OrdemRepository ordemRepository) {
        this.ordemRepository = ordemRepository;
    }

    @GetMapping
    public ResponseEntity<List<OrdemDeServico>> getAll(){
        return ResponseEntity.ok().body(ordemRepository.findAll());
    }
}
