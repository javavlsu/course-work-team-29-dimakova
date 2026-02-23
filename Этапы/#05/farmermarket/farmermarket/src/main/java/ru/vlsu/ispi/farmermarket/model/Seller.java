package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "seller")
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_seller")
    private Integer id_seller;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "farm", length = 255, nullable = false)
    private String farm;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "address", columnDefinition = "TEXT", nullable = false)
    private String address;

    @Column(name = "certificate", length = 255)
    private String certificate;

    @Column(name = "rating", precision =  2, scale = 1)
    private BigDecimal rating = BigDecimal.valueOf(0.0);

    @OneToMany(mappedBy = "seller")
    private List<Product> products;

    public Seller(){}

    public Seller(User user, String farm, String address){
        this.user = user;
        this.farm = farm;
        this.address = address;
    }

    public Integer getId_seller() {
        return id_seller;
    }

    public void setId_seller(Integer id_seller) {
        this.id_seller = id_seller;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getFarm() {
        return farm;
    }

    public void setFarm(String farm) {
        this.farm = farm;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
