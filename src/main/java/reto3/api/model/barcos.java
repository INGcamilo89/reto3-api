package reto3.api.model;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="Boat")
public class barcos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idBoat;


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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
