package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cart")
    private Integer id_cart;

    @OneToOne
    @JoinColumn(name = "id_buyer", nullable = false, unique = true)
    private Buyer buyer;

    @Column(name = "amount", precision =  10, scale = 2)
    private BigDecimal amount = BigDecimal.valueOf(0.00);

    @OneToMany(mappedBy = "cart")
    private List<CartItem> catrItems;

    public Cart(){}

    public Cart(Buyer buyer){
        this.buyer = buyer;
    }

    public Integer getId_cart() {
        return id_cart;
    }

    public void setId_cart(Integer id_cart) {
        this.id_cart = id_cart;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<CartItem> getCatrItems() {
        return catrItems;
    }

    public void setCatrItems(List<CartItem> catrItems) {
        this.catrItems = catrItems;
    }
}
