package personal.projects;

import java.util.Comparator;

public class PersonAgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        Integer comparedAge = o1.getAge();
        Integer comparedToAge = o2.getAge();
        return comparedAge.compareTo(comparedToAge);
    }
}
