package com.idsoftware.courses;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CoursesMain {
    public static void main(String[] args) {
        List<Course> cursos = Course.getCourses();

        //Obtener la cantidad de cursos con una duración mayor a 5 horas.
        var respuesta = cursos.stream()
                .filter(course -> course.getDuracion() > 5)
                .collect(Collectors.toList()).size();
        System.out.println(respuesta);

        //Obtener la cantidad de cursos con una duración menor a 2 horas.
        var respuesta2 = cursos.stream()
                .filter(course -> course.getDuracion() < 2)
                .collect(Collectors.toList()).size();
        System.out.println(respuesta2);

        //Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.
        var respuesta3 = cursos.stream()
                .filter(course -> course.getVideos() > 50)
                .map(x -> x.getTitulo())
                .collect(Collectors.toList());
        imprimir(respuesta3);

        //Mostrar en consola la duración total de todos los cursos.
        cursos.forEach(x -> {
            System.out.println(x.getTitulo() + " -> " + x.getDuracion());
        });

        //Mostrar en consola el título de los 3 cursos con mayor duración.
        var respuesta4 = cursos.stream()
                .sorted(Comparator.comparing(Course::getDuracion).reversed())
                .limit(3)
                .map(x -> x.getTitulo())
                .collect(Collectors.toList());
        imprimir(respuesta4);

        //Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.
        var promedio = cursos.stream().collect(Collectors.summarizingDouble(Course::getDuracion)).getAverage();
        var respuesta5 = cursos.stream()
                .filter(x -> x.getDuracion() > promedio)
                .map(Course::getTitulo)
                .collect(Collectors.toList());
        imprimir(respuesta5);

        //Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.
        var respuesta6 = cursos.stream()
                .filter(x -> x.getAlumnos() < 500)
                .map(x -> x.getTitulo() + " -> " + x.getDuracion())
                .collect(Collectors.toList());
        imprimir(respuesta6);

        //Obtener el curso con mayor duración.
        var respuesta7 = cursos.stream()
                .max(Comparator.comparing(Course::getDuracion))
                .get();
        System.out.println(respuesta7);

        //Crear una lista de Strings con todos los titulos de los cursos.
        cursos.stream()
                .map(Course::getTitulo)
                .forEach(System.out::println);
    }

    public static void imprimir(List<?> lista) {
        lista.forEach(System.out::println);
    }

}
