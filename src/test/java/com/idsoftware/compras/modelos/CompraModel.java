package com.idsoftware.compras.modelos;

import com.idsoftware.productos.ProductoModel;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompraModel {
    private Integer id;
    private LocalDate fechaPedido;
    private LocalDate fechaEntrega;
    private String estado;
    private ClienteModel clienteModel;
    List<ProductoModel> productos;
}
