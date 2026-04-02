package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_product")
    private Integer id_product;

    @Column(name = "name", nullable = false, length = 255)
    private String name;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "price", nullable = false, precision =  10, scale = 2)
    private BigDecimal price;

    @Column(name = "id_seller", nullable = false)
    private Seller seller;

    @ManyToOne
    @JoinColumn(name = "id_category", nullable = false)
    private Category category;

    @Column(name = "quantity", nullable = false)
    private Integer quantity = 0;

    @Column(name = "unit", length = 50)
    private String unit = "шт";

    @Column(name = "image", length = 10000)
    private String image;

    @Column(name = "composition", length = 10000)
    private String composition;

    @Column(name = "proteins", precision =  4, scale = 1)
    private BigDecimal proteins;

    @Column(name = "fats", precision =  4, scale = 1)
    private BigDecimal fats;

    @Column(name = "carbohydrates", precision =  4, scale = 1)
    private BigDecimal carbohydrates;

    @Column(name = "calories")
    private Integer calories;

    @Column(name = "expiry_date_start")
    private LocalDate expiryDateStart;

    @Column(name = "expiry_date_end")
    private LocalDate expiryDateEnd;

    @Column(name = "temperature", length = 255)
    private String temperature;

    public Product(){}

    public Product(String name, BigDecimal price, Seller seller, Category category){
        this.name = name;
        this.price = price;
        this.seller = seller;
        this.category = category;
    }

    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getComposition() {
        return composition;
    }

    public void setComposition(String composition) {
        this.composition = composition;
    }

    public BigDecimal getProteins() {
        return proteins;
    }

    public void setProteins(BigDecimal proteins) {
        this.proteins = proteins;
    }

    public BigDecimal getFats() {
        return fats;
    }

    public void setFats(BigDecimal fats) {
        this.fats = fats;
    }

    public BigDecimal getCarbohydrates() {
        return carbohydrates;
    }

    public void setCarbohydrates(BigDecimal carbohydrates) {
        this.carbohydrates = carbohydrates;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public LocalDate getExpiryDateStart() {
        return expiryDateStart;
    }

    public void setExpiryDateStart(LocalDate expiryDateStart) {
        this.expiryDateStart = expiryDateStart;
    }

    public LocalDate getExpiryDateEnd() {
        return expiryDateEnd;
    }

    public void setExpiryDateEnd(LocalDate expiryDateEnd) {
        this.expiryDateEnd = expiryDateEnd;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }
}
