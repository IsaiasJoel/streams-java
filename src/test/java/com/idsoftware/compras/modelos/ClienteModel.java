package com.idsoftware.compras.modelos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClienteModel {
    private Integer id;
    private String nombre;
    private Integer nivel;
}
