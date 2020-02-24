package adt;

public interface ContactAdt<Person> {
    boolean add(Person person);

    boolean remove(int index);

    void search(String name);

    void viewAll();
}
