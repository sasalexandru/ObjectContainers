package personal.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Address {
    private Country placeToPracticeHobby;


    public Address(Country placeToPracticeHobby) {
        this.placeToPracticeHobby = placeToPracticeHobby;
    }

    public Country getPlaceToPracticeHobby() {
        return placeToPracticeHobby;
    }

    public void setPlaceToPracticeHobby(Country placeToPracticeHobby) {
        this.placeToPracticeHobby = placeToPracticeHobby;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(placeToPracticeHobby, address.placeToPracticeHobby);
    }



    @Override
    public int hashCode() {
        return Objects.hash(placeToPracticeHobby);
    }
}
