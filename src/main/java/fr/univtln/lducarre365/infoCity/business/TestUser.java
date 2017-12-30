package fr.univtln.lducarre365.infoCity.business;


import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
import java.util.logging.Logger;

public class TestUser {

    final static Logger LOGGER = Logger.getLogger(TestUser.class.getName());

    public static void main(String[] args) {
        User user = new User.Builder().setEmail("monmail@mail.com").setFirstName("Jean")
                .setLastName("Strauss").setId(952).setPassword("azerty").build();
        System.out.println(user.toString());

        User user2 = new User.Builder().setEmail("monmail@mail.com").setFirstName("")
                .setLastName("Strauss").setId(955).setPassword("azerty").build();
        System.out.println(user2.toString());
        final ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        final Validator validator = validatorFactory.getValidator();
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);
        Set<ConstraintViolation<User>> constraintViolations2 = validator.validate(user);

        for(ConstraintViolation<User> violation : constraintViolations2){
            LOGGER.warning(violation.getMessage());
       }
    }
}
