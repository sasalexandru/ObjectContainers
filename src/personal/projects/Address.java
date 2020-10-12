package personal.projects;

import java.util.Objects;

public class Address {
    private String placeToPracticeHobby;
    private Country country;


    public Address(String placeToPracticeHobby, Country country) {
        this.placeToPracticeHobby = placeToPracticeHobby;
        this.country = country;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getPlaceToPracticeHobby() {
        return placeToPracticeHobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(country, address.country);
    }



    @Override
    public int hashCode() {
        return Objects.hash(country);
    }
}
