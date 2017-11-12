package business;

import javax.persistence.*;

/**
 * @author Ludovic 
 * @author Tomy
 * Cette classe créé un utilisateur. Ici, un utilisateur est un client
 * qui gère la communication de sa ville
 */

// TODO: 09/11/17 ajouter la surcouche jpa pour la persistance
// TODO: 09/11/17 ajouter un mot de passe à un user 
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    @ManyToOne(cascade = CascadeType.ALL)
    private Town town;

    public User(Builder builder) {
    }

    public User(long id, String firstName, String lastName, String email, Town town) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.town = town;
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
        return super.toString();
    }

    public static class Builder{
        private long id;
        private String firstName;
        private String lastName;
        private String email;
        private Town town;

        public User build(){
            this.setId(id);
            this.setFirstName(firstName);
            this.setLastName(lastName);
            this.setEmail(email);
            this.setTown(town);
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

    }
}
