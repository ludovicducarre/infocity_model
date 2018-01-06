package fr.univtln.lducarre365.infoCity.business;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ludovic et tomy
 * Une ville (town) a un nom, une région et un pays.
 * Elle possede des messages (adverts). Ce sont ces messages
 * qui sont communiqués aux clients
 */

@Entity
@Table(name = "TOWN")
public class Town {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String country;
    private String state;

    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users = new ArrayList<User>();
    //@OneToMany(cascade = CascadeType.ALL)
    //private List<Advert> adverts = new ArrayList<Advert>();

    public Town(){}

    private Town(long id){this.id = id;}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void addUser(User user) {
        this.users.add(user);
    }

//    public void addAdvert(Advert advert) {
//        this.adverts.add(advert);
//    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

//    public void setAdverts(ArrayList<Advert> adverts) {
//        this.adverts = adverts;
//    }

    public List<User> getUsers() {
        return users;
    }


//    public List<Advert> getAdverts() {
//        return adverts;
//    }

    @Override
    public String toString() {
        return "Town{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", users=" + users +
                '}';
    }
}
