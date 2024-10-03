package com.idsoftware.cursos;

import java.util.Arrays;
import java.util.List;

public class CursosProvider {
    public static List<CursoModel> getCursos(){
        return Arrays.asList(
                new CursoModel("Cursos profesional de Java", 6.5f, 50, 200 ),
                new CursoModel("Cursos profesional de Python", 8.5f, 60, 800 ),
                new CursoModel("Cursos profesional de DB", 4.5f, 70, 700 ),
                new CursoModel("Cursos profesional de Android", 7.5f, 10, 400 ),
                new CursoModel("Cursos profesional de Escritura", 1.5f, 10, 300 )
        );
    }
}
