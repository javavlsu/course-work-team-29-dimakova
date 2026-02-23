package ru.vlsu.ispi.farmermarket.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "complaints")
public class Complaint {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_complaint")
    private Integer id_feedback;

    @ManyToOne
    @JoinColumn(name = "id_buyer", nullable = false)
    private Buyer buyer;

    @ManyToOne
    @JoinColumn(name = "id_seller", nullable = false)
    private Seller seller;

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "comment", columnDefinition = "TEXT", nullable = false)
    private String comment;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('Новая', 'На рассмотрении', 'Рассмотрена', 'Отклонена')")
    private ComplaintStatus status = ComplaintStatus.NEW;


    public Complaint(){}

    public Complaint(Buyer buyer, Seller seller, String comment){
        this.buyer = buyer;
        this.seller = seller;
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

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ComplaintStatus getStatus() {
        return status;
    }

    public void setStatus(ComplaintStatus status) {
        this.status = status;
    }
}
