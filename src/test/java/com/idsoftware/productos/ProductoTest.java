package com.idsoftware.productos;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
class ProductoTest {

    List<ProductoModel> productos = ProductoProvider.get();

    @Test
    @DisplayName("Collectors - GroupBy")
    void ejercicio1() {
        productos.stream()
                .filter(p -> p.getPrecio() > 20)
                .collect(Collectors.groupingBy(ProductoModel::getNombre))
                .forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
    }

    @Test
    @DisplayName("Counting")
    void ejercicio2() {
        productos.stream()
                .collect(Collectors.groupingBy(ProductoModel::getNombre, Collectors.counting()))
                .forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
    }

    @Test
    @DisplayName("Agrupando por nombre producto y sumando")
    void ejercicio3() {
        productos.stream()
                .collect(Collectors.groupingBy(ProductoModel::getNombre, Collectors.summingDouble(ProductoModel::getPrecio)))
                .forEach((clave, valor) -> System.out.println("Clave: " + clave + " | Valor: " + valor));
    }

    @Test
    @DisplayName("Obteniendo suma y resumen")
    void ejercicio4() {
        DoubleSummaryStatistics estadisticas = productos.stream()
                .collect(Collectors.summarizingDouble(ProductoModel::getPrecio));
        System.out.println(estadisticas);
    }

    @Test
    @DisplayName("reduce")
    void ejercicio5() {
        Optional<Double> sum = productos.stream()
                .map(ProductoModel::getPrecio)
                .reduce(Double::sum);
        System.out.println(sum);
    }
}
