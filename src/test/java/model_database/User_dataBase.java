package model_database;

import business.User;

public class User_dataBase {
    public static void main(String[] args) {
        User user = new User.Builder().setId(1).setFirstName("1").setLastName("Martin")
                .setEmail("paul.martin@mail.com").build();

        user.toString();
    }
}
