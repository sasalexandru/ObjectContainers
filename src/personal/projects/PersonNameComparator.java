package personal.projects;

import java.util.Comparator;

public class PersonNameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        String comparedName = o1.getName();
        String comparedToName = o2.getName();
        return comparedName.compareTo(comparedToName);
    }
}
