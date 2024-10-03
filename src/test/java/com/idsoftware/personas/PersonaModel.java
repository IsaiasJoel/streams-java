package com.idsoftware.personas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.Period;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonaModel {
    private Integer id;
    private String nombre;
    private LocalDate cumpleanios;

    public int getEdad() {
        return Period.between(cumpleanios, LocalDate.now()).getYears();
    }
}