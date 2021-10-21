package reto3.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Entity
@Table(name="boat")
public class barcos implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBoat;


    @Column(length = 45)
    private String brand;

    @Column
    private Date year;


    @Column(length = 45)
    private String name;


    @Column(length = 250)
    private String description;

    @ManyToOne
    @JoinColumn(name ="categoryId")
    @JsonIgnoreProperties("boats")
    private Categorias category;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "boat")
    @JsonIgnoreProperties({"boat", "client"})
    private List<Reservas> reservations;

    @OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "boat")
    @JsonIgnoreProperties({"boat", "client"})
    private List<Reservas> reservation;

    public Integer getIdBoat() {
        return idBoat;
    }

    public void setIdBoat(Integer idBoat) {
        this.idBoat = idBoat;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
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

    public Categorias getCategory() {
        return category;
    }

    public void setCategory(Categorias category) {
        this.category = category;
    }


    public List<Reservas> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservas> reservations) {
        this.reservations = reservations;
    }
}
