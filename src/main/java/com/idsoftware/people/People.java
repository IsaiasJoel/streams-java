package com.idsoftware.people;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class People {
    private Integer id;
    private String name;
    private LocalDate birthDate;

    public static List<People> getPeople(){
        return Arrays.asList(
                new People(1, "Mito", LocalDate.of(1991, 1, 21)),
                new People(2, "Code", LocalDate.of(1990, 2, 21)),
                new People(3, "Jaime", LocalDate.of(1980, 6, 23)),
                new People(4, "Duke", LocalDate.of(2019, 5, 15)),
                new People(5, "James", LocalDate.of(2010, 1, 4))
        );
    }
}