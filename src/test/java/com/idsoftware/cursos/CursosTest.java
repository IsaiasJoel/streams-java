package com.idsoftware.cursos;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
class CursosTest {

    List<CursoModel> cursos = CursosProvider.getCursos();

    @Test
    @DisplayName("Obtener la cantidad de cursos con una duración mayor a 5 horas.")
    void ejercicio1() {
        int respuesta = cursos.stream()
                .filter(course -> course.getDuracion() > 5)
                .toList().size();
        System.out.println(respuesta);
    }

    @Test
    @DisplayName("Obtener la cantidad de cursos con una duración menor a 2 horas.")
    void ejercicio2() {
        int respuesta = cursos.stream()
                .filter(course -> course.getDuracion() < 2)
                .toList().size();
        System.out.println(respuesta);
    }

    @Test
    @DisplayName("Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50.")
    void ejercicio3() {
        cursos.stream()
                .filter(course -> course.getVideos() > 50)
                .map(CursoModel::getTitulo)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Mostrar en consola la duración total de todos los cursos.")
    void ejercicio4() {
        cursos.forEach(x -> {
            System.out.println(x.getTitulo() + " -> " + x.getDuracion());
        });
    }

    @Test
    @DisplayName("Mostrar en consola el título de los 3 cursos con mayor duración.")
    void ejercicio5() {
        cursos.stream()
                .sorted(Comparator.comparing(CursoModel::getDuracion).reversed())
                .limit(3)
                .map(CursoModel::getTitulo)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere.")
    void ejercicio6() {
        var promedio = cursos.stream().collect(Collectors.summarizingDouble(CursoModel::getDuracion)).getAverage();
        cursos.stream()
                .filter(x -> x.getDuracion() > promedio)
                .map(CursoModel::getTitulo)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500.")
    void ejercicio7() {
        cursos.stream()
                .filter(x -> x.getAlumnos() < 500)
                .map(x -> x.getTitulo() + " -> " + x.getDuracion())
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Obtener el curso con mayor duración.")
    void ejercicio8() {
        CursoModel curso = cursos.stream()
                .max(Comparator.comparing(CursoModel::getDuracion))
                .orElse(null);
        System.out.println("El curso de mayor duración es: " + curso);
    }

    @Test
    @DisplayName("Crear una lista de Strings con todos los titulos de los cursos.")
    void ejercicio9() {
        cursos.stream()
                .map(CursoModel::getTitulo)
                .forEach(System.out::println);
    }
}
