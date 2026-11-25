package flee1son.dev;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args){
        //Data initialization

        //products
        Product product1 = new Product(1L, "Master and Margarita", "books", new BigDecimal("5.99"));
        Product product2 = new Product(2L, "Harry Potter", "books", new BigDecimal("10.99"));
        Product product3 = new Product(3L, "child's table", "Children's products", new BigDecimal("150.20"));
        Product product4 = new Product(4L, "Barbie Fashion Doll", "toys", new BigDecimal("103.90"));
        Product product5 = new Product(5L, "Clean Code", "books", new BigDecimal("9.10"));
        Product product6 = new Product(6L, "Remote Control Off-Road Truck", "toys", new BigDecimal("103.49"));
        Product product7 = new Product(7L, "Philips Avent Baby Bottle", "Children's products", new BigDecimal("249.99"));
        Product product8 = new Product(8L, "Dune", "books", new BigDecimal("20.99"));
        Product product9 = new Product(9L, "LEGO City Fire Station", "toys", new BigDecimal("259.99"));
        Product product10 = new Product(10L, "Fisher-Price Play Gym", "Children's products", new BigDecimal("75.99"));

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

        // Task 1
        System.out.println("---".repeat(100));

        var task1 = customers.stream()
                .flatMap(customer1 -> customer1.getOrderSet().stream())
                .flatMap(orders -> orders.getProductSet().stream())
                .filter(product11 -> product11.getPrice().compareTo(new BigDecimal("100")) > 0)
                .toList();
        System.out.println("Task1:\n" + task1);

        System.out.println("---".repeat(100));

        // Task 2
        System.out.println("---".repeat(100));

        List<Order> orderList2 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .collect(Collectors.toCollection(ArrayList::new));
        Iterator<Order> orderIterator2 = orderList2.iterator();

        while (orderIterator2.hasNext()){
            Set<Product> productSet = orderIterator2.next().getProductSet();
            if(productSet
                    .stream()
                    .noneMatch(product -> product.getCategory().equals("Children's products"))
            ){
                orderIterator2.remove();
            }
        }
        var task2 = orderList2;
        System.out.println("Task 2:\n" + task2);

        System.out.println("---".repeat(100));

        //Task 3
        System.out.println("---".repeat(100));

        List<Product> productList3 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProductSet().stream())
                .filter(product -> product.getCategory().equalsIgnoreCase("toys"))
                .collect(Collectors.toCollection(ArrayList::new));

        for (Product product : productList3) {
            BigDecimal newPrice = product
                    .getPrice()
                    .multiply(
                            BigDecimal.ONE.subtract(new BigDecimal("0.10"))
                    );
            product.setPrice(newPrice);
        }

        var task3 = productList3.stream()
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Task3 sum:\n" + task3);
        System.out.println();
        System.out.println("Task3 list:\n" + productList3);

        System.out.println("---".repeat(100));

        //Task 4
        System.out.println("---".repeat(100));

        List<Product> task4 = customers.stream()
                .filter(customer -> customer.getLevel().equals(2L))
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getOrderDate()
                        .isAfter(LocalDate.of(2021, 2, 1)) &&
                        order.getOrderDate().isBefore(LocalDate.of(2021, 4, 1)))
                .flatMap(order -> order.getProductSet().stream())
                .toList();
        System.out.println("Task 4: \n" + task4);

        System.out.println("---".repeat(100));

        //Task 5
        System.out.println("---".repeat(100));

        List<Product> task5 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProductSet().stream())
                .filter(product -> product.getCategory().equalsIgnoreCase("books"))
                .distinct()
                .sorted(Comparator.comparing(Product::getPrice))
                .limit(2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Task 5: \n" + task5);

        System.out.println("---".repeat(100));

        //Task 6
        System.out.println("---".repeat(100));

        List<Order> orderList6 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .sorted(Comparator.comparing(Order::getOrderDate))
                .collect(Collectors.toCollection(ArrayList::new));

        List<Order> task6 = orderList6.stream()
                .skip(Math.max(0, orderList6.size() - 3))
                .toList();
        System.out.println("Task 6:\n" + task6);

        System.out.println("---".repeat(100));

        //Task 7
        System.out.println("---".repeat(100));

        System.out.println("Task 7: ");
        System.out.println("ID where order date is March 1 2021: ");
        List<Product> task7 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getOrderDate().equals(LocalDate.of(2021, 3, 15)))
                .peek(order ->  System.out.println("\tID: " + order.getId()))
                .flatMap(order -> order.getProductSet().stream())
                .toList();
        System.out.println("Products:\n" + task7);

        System.out.println("---".repeat(100));

        //Task 8
        System.out.println("---".repeat(100));

        BigDecimal task8 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getOrderDate().isAfter(
                        LocalDate.of(2021, 2, 1))
                        && order.getOrderDate().isBefore(LocalDate.of(2021, 2, 28)))
                .flatMap(order -> order.getProductSet().stream())
                .map(Product::getPrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("Task 8:\n\t" + task8);

        System.out.println("---".repeat(100));

        //Task 9
        System.out.println("---".repeat(100));

        List<BigDecimal> productPricesList9 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .filter(order -> order.getOrderDate().equals(LocalDate.of(2021, 3, 14)))
                .flatMap(order -> order.getProductSet().stream())
                .map(Product::getPrice)
                .toList();
        BigDecimal sum = productPricesList9.stream()
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        BigDecimal task9 = sum.divide(
                BigDecimal.valueOf(productPricesList9.size()),
                2,
                RoundingMode.HALF_UP
        );
        System.out.println("Task 9:\n\t" + task9);

        System.out.println("---".repeat(100));

        //Task 10
        System.out.println("---".repeat(100));

        List<BigDecimal> productPricesList10 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap((order -> order.getProductSet().stream()))
                .filter(product -> product.getCategory().equalsIgnoreCase("books"))
                .map(Product::getPrice)
                .toList();
        BigDecimal task10SUM = productPricesList10.stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal task10AVG = sum.divide(
                BigDecimal.valueOf(productPricesList10.size()),
                2,
                RoundingMode.HALF_UP
        );
        BigDecimal task10MAX = productPricesList10.stream()
                .max(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
        BigDecimal task10MIN = productPricesList10.stream()
                .min(BigDecimal::compareTo)
                .orElse(BigDecimal.ZERO);
        Integer task10COUNT = productPricesList10.size();
        System.out.println(
                "Task 10:" +
                        "\n\tSUM: " + task10SUM +
                        "\n\tAVG: " + task10AVG +
                        "\n\tMAX: " + task10MAX +
                        "\n\tMIN: " + task10MIN +
                        "\n\tCOUNT: " + task10COUNT
                );

        System.out.println("---".repeat(100));

        //Task 11
        System.out.println("---".repeat(100));

        List<Order> orderList11 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .toList();
        Map<Long, Integer> task11 = new HashMap<Long, Integer>();

        for (Order nextOrder : orderList11) {
            task11.put(nextOrder.getId(), nextOrder.getProductSet().size());
        }
        System.out.println("Task 11: \n" + task11);

        System.out.println("---".repeat(100));

        //Task 12
        System.out.println("---".repeat(100));

        Map<Customer, List<Order>> task12 = new HashMap<Customer, List<Order>>();
        for (Customer nextCustomer : customers) {
            task12.put(
                    nextCustomer,
                    nextCustomer.getOrderSet().stream().toList()
            );
        }
        System.out.println("Task 12:\n" + task12);

        System.out.println("---".repeat(100));

        //Task 13
        System.out.println("---".repeat(100));

        List<Order> orderList13 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .collect(Collectors.toCollection(ArrayList::new));
        Iterator<Order> orderIterator13 = orderList13.iterator();
        Map<Order, Double> task13 = new HashMap<Order, Double>();
        while (orderIterator13.hasNext()){
            Order nextOrder = orderIterator13.next();
            BigDecimal orderSum = nextOrder.getProductSet().stream()
                    .map(Product::getPrice)
                    .reduce(BigDecimal.ZERO, BigDecimal::add)
                    .setScale(2, RoundingMode.HALF_UP);

            task13.put(nextOrder, orderSum.doubleValue());
        }
        System.out.println("Task 13:\n" + task13);

        System.out.println("---".repeat(100));

        //Task 14
        System.out.println("---".repeat(100));

        List<Product> productList14 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProductSet().stream())
                .collect(Collectors.toCollection(ArrayList::new));
        Map<String, List<String>> task14 = new HashMap<String, List<String>>();

        for (Product nextProduct : productList14) {
            var category = nextProduct.getCategory();
            task14.put(
                    category,
                    productList14.stream()
                            .filter(product -> product.getCategory().equalsIgnoreCase(category))
                            .map(Product::getName)
                            .distinct()
                            .toList()
            );
        }
        System.out.println("Task 14:\n" + task14);

        System.out.println("---".repeat(100));

        //Task 15
        System.out.println("---".repeat(100));

        List<Product> productList15 = customers.stream()
                .flatMap(customer -> customer.getOrderSet().stream())
                .flatMap(order -> order.getProductSet().stream())
                .collect(Collectors.toCollection(ArrayList::new));
        Map<String, Product> task15 = new HashMap<String, Product>();
        for(Product nextProduct: productList15){
            var category = nextProduct.getCategory();
            task15.put(
                    category,
                    productList15.stream()
                            .filter(product -> product.getCategory().equalsIgnoreCase(category))
                            .max(Comparator.comparing(Product::getPrice))
                            .orElseThrow(() -> new IllegalArgumentException("List of products empty"))
            );
        }
        System.out.println("Task 15:\n" + task15);

        System.out.println("---".repeat(100));
    }
}
