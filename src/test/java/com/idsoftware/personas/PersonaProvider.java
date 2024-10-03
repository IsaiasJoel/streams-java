package com.idsoftware.personas;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PersonaProvider {
    public static List<PersonaModel> get(){
        return Arrays.asList(
                new PersonaModel(1, "Mito", LocalDate.of(1991, 1, 21)),
                new PersonaModel(2, "Code", LocalDate.of(1990, 2, 21)),
                new PersonaModel(3, "Jaime", LocalDate.of(1980, 6, 23)),
                new PersonaModel(4, "Duke", LocalDate.of(2019, 5, 15)),
                new PersonaModel(5, "James", LocalDate.of(2010, 1, 4))
        );
    }
}