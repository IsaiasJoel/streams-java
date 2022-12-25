package com.idsoftware.people;

import com.idsoftware.products.ProductsMain;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeopleMain {
    public static void main(String[] args) {
        List<People> peopleList = People.getPeople();

        //Listar a las personas mayores de 18 años
//        List<People> filteredList1 = peopleList.stream()
//                .filter(p -> PeopleMain.getAge(p.getBirthDate()) >= 18)
//                .collect(Collectors.toList());


        // 2-Map (param: Function)
//        Function<String, String> coderFunction = name -> "Coder " + name;
//        List<String> filteredList2 = peopleList.stream()
//                .map(People::getName)
//                .map(coderFunction)
//                .collect(Collectors.toList());

        //Ordenamientos
        Comparator<People> byNameAsc = Comparator.comparing(People::getName);
        Comparator<People> byNameDesc = Comparator.comparing(People::getName).reversed();
        Comparator<People> byBirthDay = Comparator.comparing(People::getBirthDate);

        //Ordenar ASCENDENTEMENTE por Nombre
//        peopleList.stream()
//                .sorted(byNameAsc)
//                .forEach(System.out::println);

        //Ordenar DESCENDENTEMENTE por nombre
//        peopleList.stream()
//                .sorted(byNameDesc)
//                .forEach(System.out::println);

        //Ordenar ASCENDENTEMENTE por fecha de nacimiento
//        peopleList.stream()
//                .sorted(byBirthDay)
//                .forEach(System.out::println);

        // 4-Match (param: Predicate)
//        Predicate<People> startsWithPredicate = People -> People.getName().startsWith("J");
//
//        // anyMatch : No evalua todo el stream, termina en la coincidencia
//        boolean rpta1 = peopleList.stream()
//                .anyMatch(startsWithPredicate);
//
//        // allMatch : Evalua todo el stream bajo la condicion
//        boolean rpta2 = peopleList.stream()
//                .allMatch(startsWithPredicate);
//
//        // noneMatch : Evalua todo el stream bajo la condicion
//        boolean rpta3 = peopleList.stream()
//                .noneMatch(startsWithPredicate);
//
//        // 5-Limit/Skip
//        int pageNumber = 1;
//        int pageSize = 2;
//        List<People> filteredList4 = peopleList.stream()
//                .skip(pageNumber * pageSize)
//                .limit(pageSize)
//                .collect(Collectors.toList());
    }

    public static int getAge(LocalDate birthDate) {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
