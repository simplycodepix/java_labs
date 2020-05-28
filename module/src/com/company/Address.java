package com.company;

public class Address {
    private final String country;
    private final String street;

    public Address(String country, String street) {
        this.country = country;
        this.street = street;
    }

    public String getCountry() {
        return country;
    }

    public String getStreet() {
        return street;
    }
}
