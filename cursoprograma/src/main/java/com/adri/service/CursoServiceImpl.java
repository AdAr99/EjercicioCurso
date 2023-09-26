package com.adri.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.adri.model.Curso;

@Service
public class CursoServiceImpl implements CursoService{

    List<Curso> cursos;

    
    public CursoServiceImpl() {
        cursos = new ArrayList<>();
        cursos.add(new Curso(111,"M08",360,50));
        cursos.add(new Curso(222,"M09",270,60));
        cursos.add(new Curso(333,"M03",310,70));
        cursos.add(new Curso(444,"M06",215,27));
    }

    @Override
    public List<Curso> altaCurso(Curso curso) {
        cursos.add(curso);
        return cursos;
    }

    @Override
    public List<Curso> eliminarCurso(int codigo) {

        Curso cursoElim = buscarCurso(codigo);
        cursos.remove(cursoElim);

        return cursos;
    }

    @Override
    public Curso buscarCurso(int codigo) {

        return cursos.stream()
        .filter(curso -> curso.getCodigo() == codigo)
        .collect(Collectors.toList())
        .get(0);
        
       
    }

    @Override
    public void actualizarHoras(int codigo, int duracion) {

        Curso cursoAct = buscarCurso(codigo);
        
        cursoAct.setDuracionCurso(duracion);
    }
    
}
