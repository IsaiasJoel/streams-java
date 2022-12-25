package com.idsoftware.sqlequivalents;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.stream.Stream;

/** Common SQL Clauses and Their Equivalents in Java 8 Streams
 * By: https://blog.jooq.org/common-sql-clauses-and-their-equivalents-in-java-8-streams/
 * */
public class SqlMain {
    public static void main(String[] args) {

        /*----------FROM = of(), stream(), etc. ----------*/
//        Stream.of(
//                new Tupla(1, 1),
//                new Tupla(2, 2)
//        ).forEach(System.out::println);

//        //Crear un nuevo Stream
//        var response = Stream.of("Luna de miel","Prófugos","En la ciudad de la furia");
//        response.forEach(System.out::println);



        /*----------CROSS JOIN = flatMap() ----------*/
//        List<Integer> s1 = Arrays.asList(1, 2);
//        List<String> s2 = Arrays.asList("A", "B");
//
//        s1.stream()
//                .flatMap(v1 -> s2.stream()
//                        .map(v2 -> new Tupla(v1, v2)))
//                .forEach(System.out::println);



        /*----------INNER JOIN = flatMap() with filter() ----------*/
        List<Integer> s1 = Arrays.asList(1, 2);
        List<Integer> s2 = Arrays.asList(1, 3);

        s1.stream()
                .flatMap(v1 -> s2.stream()
                        .map(v2 -> new Tupla(v1, v2)))
                .filter(t -> Objects.equals(t.getV1(), t.getV2()))
                .forEach(System.out::println);
    }
}
