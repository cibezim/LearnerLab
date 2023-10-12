package learnerlab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class People<E extends Person> implements Iterable<E> {
    private List<E> personList = new ArrayList<>();

    public void add(E person) {
        personList.add(person);
    }

    public E findById(long id) {
        for (E person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public boolean contains(E person) {
        return personList.contains(person);
    }

    public void remove(E person) {
        personList.remove(person);
    }

    public void remove(long id) {
        E personToRemove = findById(id);
        if (personToRemove != null) {
            personList.remove(personToRemove);
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public E[] toArray() {
        return personList.toArray((E[]) new Person[personList.size()]);
    }

    @Override
    public Iterator<E> iterator() {
        return personList.iterator();
    }
}
