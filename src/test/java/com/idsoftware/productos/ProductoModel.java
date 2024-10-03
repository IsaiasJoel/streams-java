package com.idsoftware.productos;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductoModel {
    private Integer id;
    private String nombre;
    private String categoria;
    @With
    private Double precio;
}
