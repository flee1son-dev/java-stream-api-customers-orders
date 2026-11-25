package flee1son.dev;

import java.util.Set;

public class Customer {
    private final Long id;
    private String name;
    private Long level;
    private Set<Order> orderSet;

    public Customer(Long id, String name, Long level, Set<Order> orderSet) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.orderSet = orderSet;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Set<Order> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<Order> orderSet) {
        this.orderSet = orderSet;
    }
}
