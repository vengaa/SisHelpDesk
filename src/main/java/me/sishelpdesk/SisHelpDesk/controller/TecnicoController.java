package me.sishelpdesk.SisHelpDesk.controller;

import me.sishelpdesk.SisHelpDesk.domain.Tecnico;
import me.sishelpdesk.SisHelpDesk.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/tecnicos")
public class TecnicoController {

    // localhost:8080/tecnicos/1

    @Autowired
    private TecnicoService tecnicoService;

    @GetMapping(value = "/{id}")
    public ResponseEntity<Tecnico> findById(@PathVariable Integer id) {
        Tecnico obj = tecnicoService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

}
