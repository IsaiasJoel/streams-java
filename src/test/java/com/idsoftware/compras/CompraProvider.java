package com.idsoftware.compras;

import com.idsoftware.compras.modelos.ClienteModel;
import com.idsoftware.compras.modelos.CompraModel;
import com.idsoftware.productos.ProductoModel;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class CompraProvider {
    public static List<CompraModel> getCompras() {
        return Arrays.asList(
                new CompraModel(1, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-08"), "NEW",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        Arrays.asList(
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49),
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46)
                        )),
                new CompraModel(2, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-05"), "NEW",
                        new ClienteModel(3, "Ariane Rodriguez", 1),
                        Arrays.asList(
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(14, "quos sunt ipsam", "Grocery", 534.64),
                                new ProductoModel(17, "accusamus repellendus minus", "Books", 240.58)
                        )),
                new CompraModel(3, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-18"), "DELIVERED",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        Arrays.asList(
                                new ProductoModel(3, "non nemo iure", "Grocery", 498.02),
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(15, "qui illo error", "Baby", 623.58),
                                new ProductoModel(17, "accusamus repellendus minus", "Books", 240.58)
                        )),
                new CompraModel(4, LocalDate.parse("2021-03-22"), LocalDate.parse("2021-03-27"), "PENDING",
                        new ClienteModel(3, "Ariane Rodriguez", 1),
                        Arrays.asList(
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19),
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),

                new CompraModel(5, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-12"), "NEW",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(5, "animi cum rem", "Games", 458.20)
                        )),
                new CompraModel(6, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "DELIVERED",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        List.of(
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19)
                        )),
                new CompraModel(7, LocalDate.parse("2021-03-05"), LocalDate.parse("2021-03-09"), "PENDING",
                        new ClienteModel(8, "Dino Will", 2),
                        List.of(
                                new ProductoModel(1, "omnis quod consequatur", "Games", 184.83),
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46),
                                new ProductoModel(10, "eos sed debitis", "Baby", 366.90),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46),
                                new ProductoModel(25, "magnam adipisci voluptate", "Grocery", 366.13)
                        )),
                new CompraModel(8, LocalDate.parse("2021-03-27"), LocalDate.parse("2021-04-05"), "NEW",
                        new ClienteModel(4, "Marques Nikolaus", 2),
                        List.of(
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46),
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19)
                        )),
                new CompraModel(9, LocalDate.parse("2021-04-14"), LocalDate.parse("2021-04-18"), "NEW",
                        new ClienteModel(10, "Brisa O Connell", 1),
                        List.of(
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46)
                        )),
                new CompraModel(10, LocalDate.parse("2021-03-10"), LocalDate.parse("2021-03-19"), "NEW",
                        new ClienteModel(8, "Dino Will", 2),
                        List.of(
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46),
                                new ProductoModel(14, "quos sunt ipsam", "Grocery", 534.64)
                        )),


                new CompraModel(11, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-04"), "DELIVERED",
                        new ClienteModel(1, "Stefan Walker", 1),
                        Arrays.asList(
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19),
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46),
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78),
                                new ProductoModel(27, "dolores ipsum sit", "Toys", 786.99)
                        )),
                new CompraModel(12, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-28"), "PENDING",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        Arrays.asList(
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49)
                        )),
                new CompraModel(13, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-21"), "NEW",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        Arrays.asList(
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(23, "non et nulla", "Grocery", 70.49),
                                new ProductoModel(24, "veniam consequatur et", "Books", 893.44),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),
                new CompraModel(14, LocalDate.parse("2021-03-30"), LocalDate.parse("2021-04-07"), "PENDING",
                        new ClienteModel(4, "Marques Nikolaus", 2),
                        Arrays.asList(
                                new ProductoModel(18, "aut accusamus quia", "Baby", 881.38)
                        )),

                new CompraModel(15, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-14"), "DELIVERED",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        List.of(
                                new ProductoModel(7, "aspernatur rerum qui", "Books", 656.42),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(16, "aut ex ducimus", "Books", 551.39)
                        )),
                new CompraModel(16, LocalDate.parse("2021-03-13"), LocalDate.parse("2021-03-21"), "NEW",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(16, "aut ex ducimus", "Books", 551.39),
                                new ProductoModel(18, "aut accusamus quia", "Baby", 881.38),
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78),
                                new ProductoModel(23, "non et nulla", "Grocery", 70.49),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(17, LocalDate.parse("2021-03-31"), LocalDate.parse("2021-03-31"), "DELIVERED",
                        new ClienteModel(6, "Larissa White", 2),
                        List.of(
                                new ProductoModel(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                                new ProductoModel(18, "aut accusamus quia", "Baby", 881.38)
                        )),
                new CompraModel(18, LocalDate.parse("2021-03-25"), LocalDate.parse("2021-03-31"), "PENDING",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        List.of(
                                new ProductoModel(2, "vel libero suscipit", "Toys", 12.66),
                                new ProductoModel(3, "non nemo iure", "Grocery", 498.02),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(27, "dolores ipsum sit", "Toys", 786.99)
                        )),
                new CompraModel(19, LocalDate.parse("2021-02-28"), LocalDate.parse("2021-03-09"), "DELIVERED",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        List.of(
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(14, "quos sunt ipsam", "Grocery", 534.64),
                                new ProductoModel(15, "qui illo error", "Baby", 623.58),
                                new ProductoModel(18, "aut accusamus quia", "Baby", 881.38),
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),
                new CompraModel(20, LocalDate.parse("2021-03-23"), LocalDate.parse("2021-03-30"), "NEW",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        List.of(
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78)
                        )),
                new CompraModel(21, LocalDate.parse("2021-03-19"), LocalDate.parse("2021-03-24"), "DELIVERED",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        Arrays.asList(
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),
                new CompraModel(22, LocalDate.parse("2021-02-27"), LocalDate.parse("2021-03-01"), "NEW",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        Arrays.asList(
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(7, "aspernatur rerum qui", "Books", 656.42)
                        )),
                new CompraModel(23, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-24"), "PENDING",
                        new ClienteModel(4, "Marques Nikolaus", 2),
                        Arrays.asList(
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(7, "aspernatur rerum qui", "Books", 656.42),
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(17, "accusamus repellendus minus", "Books", 240.58)
                        )),
                new CompraModel(24, LocalDate.parse("2021-03-24"), LocalDate.parse("2021-03-24"), "DELIVERED",
                        new ClienteModel(1, "Stefan Walker", 1),
                        Arrays.asList(
                                new ProductoModel(2, "vel libero suscipit", "Toys", 12.66),
                                new ProductoModel(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(24, "veniam consequatur et", "Books", 893.44),
                                new ProductoModel(28, "ut hic tempore", "Toys", 316.09)
                        )),

                new CompraModel(25, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-10"), "NEW",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(2, "vel libero suscipit", "Toys", 12.66),
                                new ProductoModel(17, "accusamus repellendus minus", "Books", 240.58),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49),
                                new ProductoModel(28, "ut hic tempore", "Toys", 316.09),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(26, LocalDate.parse("2021-03-17"), LocalDate.parse("2021-03-26"), "NEW",
                        new ClienteModel(10, "Brisa O Connell", 1),
                        List.of(
                                new ProductoModel(4, "voluptatem voluptas aspernatur", "Toys", 536.80)
                        )),
                new CompraModel(27, LocalDate.parse("2021-03-20"), LocalDate.parse("2021-03-25"), "NEW",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(15, "qui illo error", "Baby", 623.58),
                                new ProductoModel(24, "veniam consequatur et", "Books", 893.44)
                        )),
                new CompraModel(28, LocalDate.parse("2021-04-09"), LocalDate.parse("2021-04-16"), "DELIVERED",
                        new ClienteModel(2, "Daija Von", 1),
                        List.of(
                                new ProductoModel(9, "voluptas ut quidem", "Books", 697.57),
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78)
                        )),
                new CompraModel(29, LocalDate.parse("2021-04-06"), LocalDate.parse("2021-04-08"), "PENDING",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78)
                        )),
                new CompraModel(30, LocalDate.parse("2021-04-19"), LocalDate.parse("2021-04-20"), "DELIVERED",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(31, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-04"), "NEW",
                        new ClienteModel(3, "Ariane Rodriguez", 1),
                        Arrays.asList(
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19),
                                new ProductoModel(16, "aut ex ducimus", "Books", 551.39),
                                new ProductoModel(28, "ut hic tempore", "Toys", 316.09)
                        )),
                new CompraModel(32, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-24"), "DELIVERED",
                        new ClienteModel(2, "Daija Von", 1),
                        Arrays.asList(
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46)
                        )),
                new CompraModel(33, LocalDate.parse("2021-04-18"), LocalDate.parse("2021-04-24"), "PENDING",
                        new ClienteModel(1, "Stefan Walker", 1),
                        Arrays.asList(
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46),
                                new ProductoModel(23, "non et nulla", "Grocery", 70.49),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(34, LocalDate.parse("2021-03-28"), LocalDate.parse("2021-03-28"), "NEW",
                        new ClienteModel(6, "Larissa White", 2),
                        Arrays.asList(
                                new ProductoModel(1, "omnis quod consequatur", "Games", 184.83),
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49),
                                new ProductoModel(22, "itaque ea qui", "Baby", 677.78),
                                new ProductoModel(27, "dolores ipsum sit", "Toys", 786.99)
                        )),

                new CompraModel(35, LocalDate.parse("2021-03-15"), LocalDate.parse("2021-03-17"), "NEW",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(9, "voluptas ut quidem", "Books", 697.57),
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),
                new CompraModel(36, LocalDate.parse("2021-03-04"), LocalDate.parse("2021-03-08"), "DELIVERED",
                        new ClienteModel(2, "Daija Von", 1),
                        List.of(
                                new ProductoModel(7, "aspernatur rerum qui", "Books", 656.42),
                                new ProductoModel(28, "ut hic tempore", "Toys", 316.09)
                        )),
                new CompraModel(37, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-25"), "NEW",
                        new ClienteModel(8, "Dino Will", 2),
                        List.of(
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(15, "qui illo error", "Baby", 623.58)
                        )),
                new CompraModel(38, LocalDate.parse("2021-04-11"), LocalDate.parse("2021-04-20"), "NEW",
                        new ClienteModel(8, "Dino Will", 2),
                        List.of(
                                new ProductoModel(7, "aspernatur rerum qui", "Books", 656.42),
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(14, "quos sunt ipsam", "Grocery", 534.64),
                                new ProductoModel(18, "aut accusamus quia", "Baby", 881.38),
                                new ProductoModel(20, "libero omnis velit", "Baby", 177.61)
                        )),
                new CompraModel(39, LocalDate.parse("2021-04-12"), LocalDate.parse("2021-04-17"), "NEW",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        List.of(
                                new ProductoModel(1, "omnis quod consequatur", "Games", 184.83),
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46)
                        )),


                new CompraModel(40, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-12"), "PENDING",
                        new ClienteModel(3, "Ariane Rodriguez", 1),
                        List.of(
                                new ProductoModel(1, "omnis quod consequatur", "Games", 184.83),
                                new ProductoModel(10, "eos sed debitis", "Baby", 366.90),
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(41, LocalDate.parse("2021-02-24"), LocalDate.parse("2021-02-26"), "NEW",
                        new ClienteModel(5, "Rachelle Greenfelder", 0),
                        Arrays.asList(
                                new ProductoModel(4, "voluptatem voluptas aspernatur", "Toys", 536.80),
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(14, "quos sunt ipsam", "Grocery", 534.64),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(42, LocalDate.parse("2021-04-08"), LocalDate.parse("2021-04-14"), "DELIVERED",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        Arrays.asList(
                                new ProductoModel(2, "vel libero suscipit", "Toys", 12.66)
                        )),
                new CompraModel(43, LocalDate.parse("2021-03-03"), LocalDate.parse("2021-03-11"), "NEW",
                        new ClienteModel(3, "Ariane Rodriguez", 1),
                        Arrays.asList(
                                new ProductoModel(6, "dolorem porro debitis", "Toys", 146.52)
                        )),
                new CompraModel(44, LocalDate.parse("2021-03-12"), LocalDate.parse("2021-03-14"), "DELIVERED",
                        new ClienteModel(4, "Marques Nikolaus", 2),
                        Arrays.asList(
                                new ProductoModel(8, "deleniti earum et", "Baby", 41.46),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(18, "aut accusamus quia", "Baby", 881.38),
                                new ProductoModel(20, "libero omnis velit", "Baby", 177.61),
                                new ProductoModel(24, "veniam consequatur et", "Books", 893.44),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),
                new CompraModel(45, LocalDate.parse("2021-04-01"), LocalDate.parse("2021-04-06"), "DELIVERED",
                        new ClienteModel(1, "Stefan Walker", 1),
                        List.of(
                                new ProductoModel(1, "omnis quod consequatur", "Games", 184.83),
                                new ProductoModel(15, "qui illo error", "Baby", 623.58),
                                new ProductoModel(23, "non et nulla", "Grocery", 70.49),
                                new ProductoModel(25, "magnam adipisci voluptate", "Grocery", 366.13)
                        )),
                new CompraModel(46, LocalDate.parse("2021-03-16"), LocalDate.parse("2021-03-22"), "NEW",
                        new ClienteModel(10, "Brisa O Connell", 1),
                        List.of(
                                new ProductoModel(11, "laudantium sit nihil", "Toys", 95.50),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(16, "aut ex ducimus", "Books", 551.39),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49),
                                new ProductoModel(24, "veniam consequatur et", "Books", 893.44)
                        )),
                new CompraModel(47, LocalDate.parse("2021-04-07"), LocalDate.parse("2021-04-12"), "PENDING",
                        new ClienteModel(2, "Daija Von", 1),
                        List.of(
                                new ProductoModel(20, "libero omnis velit", "Baby", 177.61),
                                new ProductoModel(21, "consectetur cupiditate sunt", "Toys", 95.46),
                                new ProductoModel(23, "non et nulla", "Grocery", 70.49),
                                new ProductoModel(28, "ut hic tempore", "Toys", 316.09)
                        )),
                new CompraModel(48, LocalDate.parse("2021-04-05"), LocalDate.parse("2021-04-06"), "NEW",
                        new ClienteModel(2, "Daija Von", 1),
                        List.of(
                                new ProductoModel(3, "non nemo iure", "Grocery", 498.02),
                                new ProductoModel(7, "aspernatur rerum qui", "Books", 656.42),
                                new ProductoModel(10, "eos sed debitis", "Baby", 366.90),
                                new ProductoModel(15, "qui illo error", "Baby", 623.58),
                                new ProductoModel(19, "doloremque incidunt sed", "Games", 988.49),
                                new ProductoModel(26, "reiciendis consequuntur placeat", "Toys", 359.27)
                        )),
                new CompraModel(49, LocalDate.parse("2021-04-10"), LocalDate.parse("2021-04-13"), "NEW",
                        new ClienteModel(7, "Fae Heidenreich", 1),
                        List.of(
                                new ProductoModel(3, "non nemo iure", "Grocery", 498.02),
                                new ProductoModel(5, "animi cum rem", "Games", 458.20),
                                new ProductoModel(12, "ut perferendis corporis", "Grocery", 302.19),
                                new ProductoModel(13, "sint voluptatem ut", "Toys", 295.37),
                                new ProductoModel(17, "accusamus repellendus minus", "Books", 240.58),
                                new ProductoModel(29, "quas quis deserunt", "Toys", 772.78)
                        )),
                new CompraModel(50, LocalDate.parse("2021-03-18"), LocalDate.parse("2021-03-21"), "NEW",
                        new ClienteModel(9, "Eloy Stroman", 1),
                        List.of(
                                new ProductoModel(15, "qui illo error", "Baby", 623.58),
                                new ProductoModel(16, "aut ex ducimus", "Books", 551.39)
                        ))
        );
    }
}