package flee1son.dev;

import java.time.LocalDate;
import java.util.Set;

public class Order {
    private final Long id;
    private LocalDate orderDate;
    private LocalDate deliveryDate;
    private String status;
    private Set<Product> productSet;

    public Order(Long id, LocalDate orderDate, LocalDate deliveryDate, String status, Set<Product> productSet) {
        this.id = id;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.status = status;
        this.productSet = productSet;
    }

    @Override
    public String toString() {
        return "\nOrder{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", status='" + status + '\'' +
                "}\n";
    }

    public Long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Product> getProductSet() {
        return productSet;
    }

    public void setProductSet(Set<Product> productSet) {
        this.productSet = productSet;
    }
}
