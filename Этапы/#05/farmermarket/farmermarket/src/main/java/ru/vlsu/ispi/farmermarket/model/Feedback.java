package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "feedback")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_feedback")
    private Integer id_feedback;

    @ManyToOne
    @JoinColumn(name = "id_buyer", nullable = false)
    private Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "id_product", nullable = false)
    private Product product;

    @Column(name = "rating")
    private Integer rating;

    @Column(name = "comment", columnDefinition = "TEXT")
    private String comment;

    @Column(name = "date")
    private LocalDate date;

    public Feedback(){}

    public Feedback(Buyer buyer, Product product, Integer rating, String comment){
        this.buyer = buyer;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.date = LocalDate.now();
    }

    public Integer getId_feedback() {
        return id_feedback;
    }

    public void setId_feedback(Integer id_feedback) {
        this.id_feedback = id_feedback;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
