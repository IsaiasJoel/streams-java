package com.idsoftware.compras;

import com.idsoftware.compras.modelos.CompraModel;
import com.idsoftware.productos.ProductoModel;
import com.idsoftware.productos.ProductoProvider;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Slf4j
class CompraTest {

    List<ProductoModel> productos = ProductoProvider.get();
    List<CompraModel> compras = CompraProvider.getCompras();

    @Test
    @DisplayName("Obtener la lista de productos con categoria Books y precio mayor a 100")
    void ejercicio1() {
        productos.stream()
                .filter(p -> p.getCategoria().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrecio() > 100)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Obtener la lista de compras cuyos productos pertenezcan a la categoría Baby")
    void ejercicio2() {
        compras.stream()
                .filter(compra -> compra.getProductos().stream().allMatch(producto -> producto.getCategoria().equalsIgnoreCase("Baby")))
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Obtain a list of product with category = “Toys” and then apply 10% discount")
    void ejercicio3() {
        productos.stream()
                .filter(producto -> producto.getCategoria().equals("Toys"))
                .map(producto -> producto.withPrecio(producto.getPrecio() * 0.9))
                .forEach(System.out::println);
    }


    @Test
    @DisplayName("Obtain a list of products ordered by customer of tier 2 between 01-Feb-2021 and 01-Apr-2021")
    void ejercicio4() {
        final LocalDate fechaInicio = LocalDate.of(2021, 2, 1);
        final LocalDate fechaFin = LocalDate.of(2021, 4, 1);

        Predicate<CompraModel> predicate = compra -> (compra.getFechaPedido().isEqual(fechaInicio) || compra.getFechaPedido().isAfter(fechaInicio))
                && (compra.getFechaPedido().isEqual(fechaFin) || compra.getFechaPedido().isBefore(fechaFin));

        compras.stream()
                .filter(predicate)
                .sorted(Comparator.comparing(compra -> compra.getClienteModel().getNombre()))
                .map(CompraModel::getProductos)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Get the cheapest products of “Books” category")
    void ejercicio5() {
        Optional<ProductoModel> optProducto = productos.stream()
                .filter(producto -> producto.getCategoria().equalsIgnoreCase("Books"))
                .min(Comparator.comparing(ProductoModel::getPrecio));
        System.out.println("The cheapest product of the 'Books' category is: " + optProducto.orElseThrow());
    }

    @Test
    @DisplayName("Get the 3 most recent placed order")
    void ejercicio6() {
        compras.stream()
                .sorted(Comparator.comparing(CompraModel::getFechaPedido).reversed())
                .limit(3)
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Get a list of orders which were ordered on 15-Mar-2021,")
    void ejercicio7() {
        compras.stream()
                .filter(x -> x.getFechaPedido().isEqual(LocalDate.of(2021, 3, 15)))
                .forEach(System.out::println);
    }

    @Test
    @DisplayName("Calculate total lump sum of all orders placed in Feb 2021")
    void ejercicio8() {
        Predicate<CompraModel> esFebrero2021 = compra -> {
            LocalDate fechaPedido = compra.getFechaPedido();
            return fechaPedido.getMonth() == Month.FEBRUARY && fechaPedido.getYear() == 2021;
        };

        final double total = compras.stream()
                .filter(esFebrero2021)
                .flatMap(compra -> compra.getProductos().stream())
                .mapToDouble(ProductoModel::getPrecio)
                .sum();

        System.out.println("El total de los productos es: " + total);
    }

    @Test
    @DisplayName("Calculate order average payment placed on 14-Mar-2021. Calcular el pago promedio del pedido realizado el 14 de marzo de 2021")
    void ejercicio9() {
        Predicate<CompraModel> es14DeMarzoDel2021 = compra -> {
            final LocalDate fecha = LocalDate.of(2021, 3, 14);
            return compra.getFechaPedido().equals(fecha);
        };

        OptionalDouble optPromedio = compras.stream()
                .filter(es14DeMarzoDel2021)
                .flatMap(compra -> compra.getProductos().stream())
                .mapToDouble(ProductoModel::getPrecio)
                .average();
        System.out.println("El promedio de venta en 14-Mar-2021 es: " + optPromedio);
    }


    @Test
    @DisplayName("Obtain a collection of statistic figures (i.e. sum, average, max, min, count) for all products of category “Books”")
    void ejercicio10() {
        Predicate<ProductoModel> esCategoriaBooks = producto -> producto.getCategoria().equals("Books");
        DoubleSummaryStatistics resultado = productos.stream()
                .filter(esCategoriaBooks)
                .collect(Collectors.summarizingDouble(ProductoModel::getPrecio));
        System.out.println(resultado);
    }


    @Test
    @DisplayName("Obtain a data map with order id and order’s product count")
    void ejercicio11() {
        compras.stream()
                .collect(Collectors.toMap(
                        CompraModel::getId,
                        compra -> compra.getProductos().size()
                )).forEach((clave, valor) -> System.out.println("Clave: " + clave + " | valor: " + valor));
    }

    @Test
    @DisplayName("Produce a data map with order records grouped by customer")
    void ejercicio12() {
        compras.stream()
                .collect(Collectors.groupingBy(CompraModel::getClienteModel))
                .forEach((clave, valor) -> System.out.println("Clave: " + clave + " | valor: " + valor));
    }

    @Test
    @DisplayName("Produce a data map with order record and product total sum")
    void ejercicio13() {
        compras.stream()
                .collect(Collectors.toMap(
                        CompraModel::getId,
                        compra -> compra.getProductos().stream().map(ProductoModel::getPrecio).reduce(0.0, Double::sum)
                ))
                .forEach((clave, valor) -> System.out.println("Clave: " + clave + " | valor: " + valor));
    }

    @Test
    @DisplayName("Obtain a data map with list of product name by category")
    void ejercicio14() {
        productos.stream()
                .collect(Collectors.toMap(ProductoModel::getCategoria, Function.identity()))
                .forEach((categoria, producto) ->
                        System.out.println("Categoría: " + categoria + ", Producto: " + producto));
    }

    @Test
    @DisplayName("Get the most expensive product by category")
    void ejercicio15() {
        //Agrupar por categoría
        productos.stream()
                .collect(Collectors.toMap(
                        ProductoModel::getCategoria,
                        Function.identity(),
                        BinaryOperator.maxBy(Comparator.comparing(ProductoModel::getPrecio)))
                ).forEach((categoria, producto) ->
                        System.out.println("Categoría: " + categoria + ", Producto más caro: " + producto));
    }
}
