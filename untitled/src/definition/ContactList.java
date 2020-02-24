package definition;

import adt.ContactAdt;

import java.util.ArrayList;

public class ContactList<Person> implements ContactAdt {
    ArrayList<String> arrayOfNames = new ArrayList<>();
    ArrayList<String> arrayOfFirstName = new ArrayList<>();
    private Node<Person> head;
    private int size = 0;
    private int counter;

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(int index) {
        return false;
    }

    @Override
    public void search(String name) {

    }

    @Override
    public void viewAll() {

    }
}
