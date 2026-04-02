package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "order_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_order_item")
    private Integer id_order_item;

    @ManyToOne
    @JoinColumn(name = "id_order", nullable = false)
    private Order order;

    @ManyToOne
    @JoinColumn(name = "id_cart_item", nullable = false)
    private CartItem cartItem;

    @ManyToOne
    @JoinColumn(name = "id_seller", nullable = false)
    private Seller seller;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('В сборке', 'В пути', 'Доставлен', 'Отменён')")
    private OrderItemStatus status = OrderItemStatus.ASSEMBLING;

    public OrderItem(){}

    public OrderItem(Order order, CartItem cartItem, Seller seller){
        this.order = order;
        this.cartItem = cartItem;
        this.seller = seller;
    }

    public Integer getId_order_item() {
        return id_order_item;
    }

    public void setId_order_item(Integer id_order_item) {
        this.id_order_item = id_order_item;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public OrderItemStatus getStatus() {
        return status;
    }

    public void setStatus(OrderItemStatus status) {
        this.status = status;
    }
}
