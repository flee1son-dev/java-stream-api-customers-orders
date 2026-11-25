package flee1son.dev;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Main {
    static void main(String[] args){
        //Data initialization

        //products
        Product product1 = new Product(1L, "Master and Margarita", "books", new BigDecimal("5.99"));
        Product product2 = new Product(2L, "Harry Potter", "books", new BigDecimal("35.99"));
        Product product3 = new Product(3L, "child's table", "Children's products", new BigDecimal("35.99"));
        Product product4 = new Product(4L, "Barbie Fashion Doll", "toys", new BigDecimal("35.99"));
        Product product5 = new Product(5L, "Clean Code", "books", new BigDecimal("35.99"));
        Product product6 = new Product(6L, "Remote Control Off-Road Truck", "toys", new BigDecimal("35.99"));
        Product product7 = new Product(7L, "Philips Avent Baby Bottle", "Children's products", new BigDecimal("35.99"));
        Product product8 = new Product(8L, "Dune", "books", new BigDecimal("35.99"));
        Product product9 = new Product(9L, "LEGO City Fire Station", "toys", new BigDecimal("35.99"));
        Product product10 = new Product(10L, "Fisher-Price Play Gym", "Children's products", new BigDecimal("35.99"));

        //orders------------------------------------------------------------
        Order order1 = new Order(
                1L,
                LocalDate.of(2021, 1, 10),
                LocalDate.of(2021, 1, 15),
                "DELIVERED",
                Set.of(product1, product2)
        );
        Order order2 = new Order(
                2L,
                LocalDate.of(2021, 2, 1),
                LocalDate.of(2021, 2, 5),
                "DELIVERED",
                Set.of(product3, product4)
        );
        Order order3 = new Order(
                3L,
                LocalDate.of(2021, 2, 14),
                LocalDate.of(2021, 2, 20),
                "DELIVERED",
                Set.of(product5, product6, product7)
        );
        Order order4 = new Order(
                4L,
                LocalDate.of(2021, 3, 14),
                LocalDate.of(2021, 3, 18),
                "DELIVERED",
                Set.of(product8, product9)
        );
        Order order5 = new Order(
                5L,
                LocalDate.of(2021, 3, 15),
                LocalDate.of(2021, 3, 20),
                "DELIVERED",
                Set.of(product1, product3, product10)
        );
        Order order6 = new Order(
                6L,
                LocalDate.of(2021, 3, 15),
                LocalDate.of(2021, 3, 22),
                "DELIVERED",
                Set.of(product2, product4)
        );
        Order order7 = new Order(
                7L,
                LocalDate.of(2021, 3, 28),
                LocalDate.of(2021, 4, 2),
                "DELIVERED",
                Set.of(product5, product6)
        );
        Order order8 = new Order(
                8L,
                LocalDate.of(2021, 4, 1),
                LocalDate.of(2021, 4, 5),
                "DELIVERED",
                Set.of(product7, product8)
        );
        Order order9 = new Order(
                9L,
                LocalDate.of(2021, 5, 20),
                LocalDate.of(2021, 5, 25),
                "DELIVERED",
                Set.of(product9, product10)
        );
        Order order10 = new Order(
                10L,
                LocalDate.of(2021, 6, 10),
                LocalDate.of(2021, 6, 15),
                "DELIVERED",
                Set.of(product1, product4, product5)
        );
        Order order11 = new Order(
                11L,
                LocalDate.of(2021, 7, 5),
                LocalDate.of(2021, 7, 10),
                "DELIVERED",
                Set.of(product2, product3)
        );
        Order order12 = new Order(
                12L,
                LocalDate.of(2021, 8, 25),
                LocalDate.of(2021, 8, 30),
                "DELIVERED",
                Set.of(product6, product7)
        );
        Order order13 = new Order(
                13L,
                LocalDate.of(2021, 9, 12),
                LocalDate.of(2021, 9, 18),
                "DELIVERED",
                Set.of(product8, product9, product10)
        );
        Order order14 = new Order(
                14L,
                LocalDate.of(2021, 10, 1),
                LocalDate.of(2021, 10, 7),
                "DELIVERED",
                Set.of(product1, product2)
        );
        Order order15 = new Order(
                15L,
                LocalDate.of(2021, 11, 11),
                LocalDate.of(2021, 11, 15),
                "DELIVERED",
                Set.of(product3, product5)
        );
        Order order16 = new Order(
                16L,
                LocalDate.of(2021, 12, 25),
                LocalDate.of(2021, 12, 30),
                "DELIVERED",
                Set.of(product4, product6)
        );
        Order order17 = new Order(
                17L,
                LocalDate.of(2022, 1, 5),
                LocalDate.of(2022, 1, 10),
                "DELIVERED",
                Set.of(product7, product8)
        );
        Order order18 = new Order(
                18L,
                LocalDate.of(2022, 2, 14),
                LocalDate.of(2022, 2, 19),
                "DELIVERED",
                Set.of(product9, product10)
        );
        Order order19 = new Order(
                19L,
                LocalDate.of(2022, 3, 8),
                LocalDate.of(2022, 3, 12),
                "DELIVERED",
                Set.of(product1, product3, product5)
        );
        Order order20 = new Order(
                20L,
                LocalDate.of(2022, 4, 20),
                LocalDate.of(2022, 4, 25),
                "DELIVERED",
                Set.of(product2, product4)
        );
        Order order21 = new Order(
                21L,
                LocalDate.of(2022, 5, 15),
                LocalDate.of(2022, 5, 20),
                "DELIVERED",
                Set.of(product6, product7, product8)
        );
        Order order22 = new Order(
                22L,
                LocalDate.of(2022, 6, 30),
                LocalDate.of(2022, 7, 5),
                "DELIVERED",
                Set.of(product9, product10)
        );
        Order order23 = new Order(
                23L,
                LocalDate.of(2022, 7, 4),
                LocalDate.of(2022, 7, 9),
                "DELIVERED",
                Set.of(product1, product2, product3)
        );
        Order order24 = new Order(
                24L, LocalDate.of(2022, 8, 15),
                LocalDate.of(2022, 8, 20),
                "DELIVERED",
                Set.of(product4, product5, product6)
        );
        Order order25 = new Order(
                25L, LocalDate.of(2022, 9, 1),
                LocalDate.of(2022, 9, 7),
                "DELIVERED",
                Set.of(product7, product8, product9)
        );

        //customers------------------------------------------------------------
        List<Customer> customers = List.of(
                new Customer(
                        1L,
                        "Alice",
                        1L,
                        Set.of(order1, order2, order3, order4, order5)
                ),
                new Customer(
                        2L,
                        "Bob",
                        2L,
                        Set.of(order6, order7, order8, order9, order10)
                ),
                new Customer(
                        3L,
                        "Charlie",
                        2L,
                        Set.of(order11, order12, order13, order14, order15)
                ),
                new Customer(
                        4L,
                        "Diana",
                        3L,
                        Set.of(order16, order17, order18, order19, order20)
                ),
                new Customer(
                        5L,
                        "Eve",
                        3L,
                        Set.of(order21, order22, order23, order24, order25)
                )
        );

    }
}
