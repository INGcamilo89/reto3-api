package reto3.api.model;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="boats")
public class barcos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBoats;

    @Column(length = 45)
    private String brand;

    @Column
    private Date year;

    @Column(length = 100)
    private String category;

    @Column(length = 45)
    private String name;


    @Column(length = 250)
    private String description;


    public Integer getIdBoats() {
        return idBoats;
    }

    public void setIdBoats(Integer idBoats) {
        this.idBoats = idBoats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
