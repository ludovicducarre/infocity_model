package business;

import javax.persistence.*;
import java.util.Date;

/**
 * @author ludovic & tomy
 * Cette classe est le coeur du projet
 * Basiquement, c'est un simple message qui est destiné aux clients.
 * Il a différentes caractéristiques qui permettent de classifier
 * les messages entre eux. La recherche par type est la principale
 * source de classification.
 */

@Entity
@Table(name = "ADVERT")
public class Advert{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String title;
    private String message;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    private String location;
    private String type;



    private Advert() {
    }

    private Advert(long id){
        this.id = id;
    }

    private Advert(Builder builder) {
        this(builder.id);
        this.title = builder.title;
        this.message = builder.message;

        this.date = builder.date;
        this.time = builder.time;
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

    public Date getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }





    @Override
    public String toString() {
        return "Advert{" +
                "id=" + id +
                ", message='" + message + '\'' +
                ", type=" + type +
                ", date=" + date +
                ", time=" + time +
                '}';
    }

    public static class Builder {
        private long id;
        private String title;
        private String message;
        private Date date;
        private Date time;
        private String location;
        private String type;



        public Advert build() {
            this.setId(id);
            this.setMessage(message);
            this.setTime(time);
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

        public Builder setTime(Date time) {
            this.time = time;
            return this;
        }

        public Builder setLocation(String location) {
            this.location = location;
            return this;
        }
    }


}
