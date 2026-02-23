package ru.vlsu.ispi.farmermarket.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name="buyer")
public class Buyer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_buyer")
    private Integer id_buyer;

    @OneToOne
    @JoinColumn(name = "id_user", nullable = false)
    private User user;

    @Column(name = "address", columnDefinition = "TEXT")
    private String address;

    public Buyer(User user, String address){
        this.user = user;
        this.address = address;
    }

    public Integer getId_buyer() {
        return id_buyer;
    }

    public void setId_buyer(Integer id_buyer) {
        this.id_buyer = id_buyer;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
