package business;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Ludovic 
 * @author Tomy
 * Cette classe créé un utilisateur. Ici, un utilisateur est un client
 * qui gère la communication de sa ville
 */

//TODO vérifier la bonne forme d'un nom, mail ect..

@Entity
@Table(name = "TOWN")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToOne
    private Town town;
    //TODO le password ne doit pas être une String
    private String password;

    public User(){}

    public User(Builder builder) {
    }

    public User(long id, String firstName, String lastName, String email, Town town, String password) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.town = town;
        this.password = password;
    }

    public long getId() {
        return id;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }


    public Town getTown() {
        return town;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", town=" + town +
                ", password='" + password + '\'' +
                '}';
    }

    public static class Builder{
        private long id;
        private String firstName;
        private String lastName;
        private String email;
        private Town town;
        private String password;

        public User build(){
            this.setId(id);
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setEmail(email);
            this.setTown(town);
            this.setPassword(password);
            return new User(this);

        }
        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }
        public Builder setLastName(String lastName){
            this.firstName = lastName;
            return this;
        }

        public Builder setEmail(String email){
            this.email = email;
            return this;
        }

        public Builder setTown(Town town){
            this.town = town;
            return this;
        }

        public Builder setPassword(String password){
            this.password = password;
            return this;
        }

    }
}
