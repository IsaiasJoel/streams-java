package com.idsoftware.personas;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

@Slf4j
class PersonaTest {

    List<PersonaModel> personas = PersonaProvider.get();

    @Test
    @DisplayName("Listar a las personas mayores de 18 años")
    void ejercicio1() {
        personas.stream()
                .filter(persona -> persona.getEdad() >= 18)
                .map(PersonaModel::getNombre)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Map (param: Function)")
    void ejercicio2() {
        Function<String, String> coderFunction = name -> "Coder " + name;
        personas.stream()
                .map(PersonaModel::getNombre)
                .map(coderFunction)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Ordenar ASCENDENTEMENTE por Nombre")
    void ejercicio3() {
        Comparator<PersonaModel> byNameAsc = Comparator.comparing(PersonaModel::getNombre);
        personas.stream()
                .sorted(byNameAsc)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Ordenar DESCENDENTEMENTE por nombre")
    void ejercicio4() {
        Comparator<PersonaModel> byNameDesc = Comparator.comparing(PersonaModel::getNombre).reversed();
        personas.stream()
                .sorted(byNameDesc)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Ordenar ASCENDENTEMENTE por fecha de nacimiento")
    void ejercicio5() {
        Comparator<PersonaModel> byBirthDay = Comparator.comparing(PersonaModel::getCumpleanios);
        personas.stream()
                .sorted(byBirthDay)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Match (param: Predicate)")
    void ejercicio6() {
        Predicate<PersonaModel> startsWithPredicate = People -> People.getNombre().startsWith("J");
        // anyMatch : No evalua la totalidad del stream, termina en la coincidencia
        boolean rptaAnyMatch = personas.stream()
                .anyMatch(startsWithPredicate);

        // allMatch : Evalua la totalidad del stream bajo la condicion
        boolean rptaAllMatch = personas.stream()
                .allMatch(startsWithPredicate);

        // noneMatch : Evalua la totalidad del stream bajo la condicion
        boolean rptaNoneMatch = personas.stream()
                .noneMatch(startsWithPredicate);

        System.out.println("anyMatch: " + rptaAnyMatch);
        System.out.println("allMatch" + rptaAllMatch);
        System.out.println("noneMatch" + rptaNoneMatch);
    }

    @Test
    @DisplayName("Limit/Skip")
    void ejercicio7() {
        int pageNumber = 1;
        int pageSize = 2;
        personas.stream()
                .skip(pageNumber * pageSize)
                .limit(pageSize)
                .forEach(System.out::println);
    }
}
