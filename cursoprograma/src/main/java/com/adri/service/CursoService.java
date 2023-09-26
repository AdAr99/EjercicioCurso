package com.adri.service;

import java.util.List;

import com.adri.model.Curso;

public interface CursoService {
    List<Curso> altaCurso(Curso curso);
    List<Curso> eliminarCurso(int codigo);
    Curso buscarCurso(int codigo);
    void actualizarHoras(int codigo, int duracion);
}
