package fr.univtln.lducarre365.infoCity.business;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author ludovic et tomy
 * Cette classe est le coeur du projet
 * Basiquement, c'est un simple message qui est destiné aux clients.
 * Il a différentes caractéristiques qui permettent de classifier
 * les messages entre eux. La recherche par type et par ville est la principale
 * source de classification.
 */

@Entity
@Table(name = "ADVERT")
public class Advert implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String message;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String location;
    private String type;
    @ManyToOne(cascade = CascadeType.ALL)
    private Town town;



    public Advert() {
    }

    public Advert(long id){
        this.id = id;
    }

    private Advert(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.message = builder.message;
        this.date = builder.date;
        this.type = builder.type;
        this.location = builder.location;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
    }

    @Override
    public String toString() {

        return title+
                "\nle "+date+
                "\n"+location+
                "\n"+message;
    }



    public static class Builder {
        private long id;
        private String title;
        private String message;
        private Date date;
        private String location;
        private String type;



        public Advert build() {
            this.setId(id);
            this.setMessage(message);
            this.setDate(date);
            this.setTitle(title);
            this.setLocation(location);
            this.setType(type);
            return new Advert(this);
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }


        public Builder setType(String type) {
            this.type = type;
            return this;
        }

        public Builder setDate(Date date) {
            this.date = date;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }
    }
}
