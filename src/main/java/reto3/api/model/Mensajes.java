package reto3.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="messages")

public class Mensajes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMessage;


    @Column(length = 250)
    private String messageText;



    @ManyToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties({"message","client","reservation"})
    private barcos boat;

    @ManyToOne
    @JoinColumn(name = "clientId")
    @JsonIgnoreProperties({"message","reservations","client"})
    private Clientes client;

    public barcos getBoat() {
        return boat;
    }

    public void setBoat(barcos boat) {
        this.boat = boat;
    }

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public Clientes getClient() {
        return client;
    }

    public void setClient(Clientes client) {
        this.client = client;
    }
}
