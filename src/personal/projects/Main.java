package personal.projects;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Compare by age ----------------------------------------------");
        Set<Person> personsAge = new TreeSet<>(new PersonAgeComparator());
        personsAge.add(new Person("Mihai", 60));
        personsAge.add(new Employee("Ioana", 22));
        personsAge.add(new Unemployed("Alexandru", 45));
        personsAge.add(new Student("Sebastian", 33));
        for (Person personAge : personsAge) {
            System.out.println(personAge.getName() + " " + personAge.getAge());
        }
        System.out.println("Compare by name ----------------------------------------------");
        Set<Person> personsName = new TreeSet<>(new PersonNameComparator());
        personsName.add(new Person("Mihai", 60));
        personsName.add(new Employee("Ioana", 22));
        personsName.add(new Unemployed("Alexandru", 45));
        personsName.add(new Student("Sebastian", 33));
        for (Person personName : personsName) {
            System.out.println(personName.getName() + " " + personName.getAge());
        }

        System.out.println("=============");
        Map<Person, List<Hobby>> peopleHobbies = new HashMap<>();
        Country romania = new Country("Romania");
        Country switzerland = new Country ("Switzerland");
        Country italy = new Country ("Italy");
        Address address = new Address( "Apuseni" , romania);
        Address address1 = new Address( "Alps", switzerland);
        Address address2 = new Address("Florence" , italy);

        Hobby snowboarding = new Hobby("Snowboarding", 1);
        snowboarding.addAddress(address1);
        Hobby cycling = new Hobby("Cycling" , 2);
        cycling.addAddress(address2);
        Hobby hiking = new Hobby("Hiking" , 3);
        hiking.addAddress(address);

        Person mihai = new Person("Mihai" , 20);
        mihai.addHobby(snowboarding);
        Person ioana = new Person ("Ioana", 35);
        ioana.addHobby(hiking);
        Person andrei = new Person("Andrei", 28);
        andrei.addHobby(cycling);

        peopleHobbies.put(mihai,mihai.getHobbies());
        peopleHobbies.put(ioana,ioana.getHobbies());
        peopleHobbies.put(andrei, andrei.getHobbies());
        printHobbiesAndPlace(peopleHobbies, mihai);
        printHobbiesAndPlace(peopleHobbies, ioana);
        printHobbiesAndPlace(peopleHobbies, andrei);
    }

    public static void printHobbiesAndPlace (Map<Person, List<Hobby>> peopleHobbies, Person person) {
        List<Hobby> hobbies = peopleHobbies.get(person);
        for (Hobby hobby : hobbies) {
            Set<String> placeToPracticeHobby = new HashSet<>();
            Set<String> countryName = new HashSet<>();
            List<Address> addresses = hobby.getAddresses();
            for (Address address : addresses) {
                countryName.add(address.getCountry().getName());
                placeToPracticeHobby.add(address.getPlaceToPracticeHobby());
            }
            for(String country : countryName) {

                System.out.println("Hobby name:" + hobby.getName() + ", place to practice hobby: " +
                        placeToPracticeHobby + " and the country is: " +country);
            }
        }
    }

}
