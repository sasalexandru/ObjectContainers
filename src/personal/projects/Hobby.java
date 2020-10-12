package personal.projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Hobby {
    private String name;
    private int frequency;
    private List<Address> addresses = new ArrayList<>();

    public Hobby(String name, int frequency) {
        this.name = name;
        this.frequency = frequency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
    public boolean addAddress(Address address){
        if(addresses.contains(address)){
            return false;
        }
        addresses.add(address);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hobby hobby = (Hobby) o;
        return frequency == hobby.frequency &&
                Objects.equals(name, hobby.name) &&
                Objects.equals(addresses, hobby.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, frequency, addresses);
    }
}
