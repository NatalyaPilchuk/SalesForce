package utils;

import com.github.javafaker.Faker;

public class FakeMessageGenerator {

    public static String generateAccountName() {
        return new Faker().name().fullName();
    }

    public static String generatePhone() {

        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateFax() {
        return new Faker().phoneNumber().phoneNumber();
    }

    public static String generateWebsite() {

        return new Faker().internet().emailAddress();
    }

    public static String generateEmployees() {

        return new Faker().job().position();
    }

    public static String generateRevenue() {

        return String.valueOf(new Faker().number().randomNumber());
    }

    public static String generateCity() {

        return new Faker().address().city();
    }

    public static String generateZipCode() {

        return new Faker().address().zipCode();
    }

    public static String generateState() {

        return new Faker().address().state();
    }

    public static String generateCountry() {

        return new Faker().address().country();
    }

    public static String generateStreet() {

        return new Faker().address().streetAddress();
    }

    public static String generateDescription() {

        return new Faker().chuckNorris().fact();
    }


}
