package com.adri.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.adri.model.Curso;
import com.adri.service.CursoService;

@RestController
public class CursosController {

    @Autowired
    CursoService service;

    @PostMapping(value="curso", consumes=MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> altaCurso(@RequestBody Curso curso){

        return service.altaCurso(curso);
    }

    @DeleteMapping(value="curso/{codigo}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Curso> eliminarCurso(@PathVariable ("codigo") int codigo){
        
        return service.eliminarCurso(codigo);
    }

    @GetMapping(value="curso/{codigo}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso buscarCurso(@PathVariable ("codigo") int codigo){
        return service.buscarCurso(codigo);
    }

    @PutMapping(value="curso/{codigo}/{duracion}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void actualizarHoras(@PathVariable("codigo") int codigo, @PathVariable("duracion") int duracion){
        service.actualizarHoras(codigo, duracion);
    }
    
}
