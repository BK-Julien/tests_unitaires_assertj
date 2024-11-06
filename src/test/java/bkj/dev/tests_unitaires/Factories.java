package bkj.dev.tests_unitaires;

import com.github.javafaker.Faker;

public class Factories {
    private static Faker faker = new Faker();
    public static User createUser(){
        return new User(
                faker.lordOfTheRings().character(),
                faker.name().username(),
                faker.internet().emailAddress(),
                faker.internet().password()
        );
    }
}
