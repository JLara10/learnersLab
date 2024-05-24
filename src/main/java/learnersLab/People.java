package learnersLab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    private List<Person> personList;

    public People() {
        personList = new ArrayList<>();
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void add(Person person){
        personList.add(person);
    }
    public Person findById(long id){
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    public boolean contains(Person person) {
        return personList.contains(person);
    }
    public boolean removePerson(Person person) {
        return personList.remove(person);
    }
    public boolean removeId(long id) {
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            Person person = iterator.next();
            if (person.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public void removeAll() {
        personList.clear();
    }
    public int count() {
        return personList.size();
    }
    public Person[] toArray() {
        return personList.toArray(new Person[0]);
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }
}
