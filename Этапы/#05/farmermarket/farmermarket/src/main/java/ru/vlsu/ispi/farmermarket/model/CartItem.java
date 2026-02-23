package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "cart_item")
public class CartItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart_item")
    private Integer id_cart_item;

    @ManyToOne
    @JoinColumn(name = "id_cart", nullable = false)
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "amount", precision =  10, scale = 2, nullable = false)
    private BigDecimal amount;

    public CartItem(){}

    public CartItem(Cart cart, Product product, Integer quantity, BigDecimal amount){
        this.cart = cart;
        this.product = product;
        this.quantity = quantity;
        this.amount = amount;
    }

    public Integer getId_cart_item() {
        return id_cart_item;
    }

    public void setId_cart_item(Integer id_cart_item) {
        this.id_cart_item = id_cart_item;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
