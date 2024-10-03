package com.idsoftware.cursos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoModel {
    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos
}
