package business;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private Town town;

    public User(Builder builder) {
    }

    public User(int id, String firstName, String lastName, String email, Town town) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.town = town;
    }

    public int getId() {
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


    public static class Builder{
        private int id;
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
        public Builder setId(int id) {
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
