package com.idsoftware.courses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private String titulo;
    private float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos

    public static List<Course> getCourses(){
        return Arrays.asList(
                new Course("Cursos profesional de Java", 6.5f, 50, 200 ),
                new Course("Cursos profesional de Python", 8.5f, 60, 800 ),
                new Course("Cursos profesional de DB", 4.5f, 70, 700 ),
                new Course("Cursos profesional de Android", 7.5f, 10, 400 ),
                new Course("Cursos profesional de Escritura", 1.5f, 10, 300 )
        );
    }
}
