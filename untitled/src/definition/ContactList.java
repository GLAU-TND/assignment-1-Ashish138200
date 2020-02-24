package definition;

import adt.ContactAdt;

import java.util.ArrayList;

public class ContactList<Person> implements ContactAdt {
    ArrayList<String> arrayOfNames = new ArrayList<>();
    ArrayList<String> arrayOfFirstName = new ArrayList<>();
    private Node<Person> head;
    private int size = 0;

    public int getSize() {
        return size;
    }

    private void addFirst(Person personData) {
        head = new Node<>(personData, head);
        size++;
    }

    private void addAfter(Node<Person> personNode, Person personData) {
        personNode.next = new Node<>(personData, personNode.next);
    }

    public void add(int index, Person personData) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(Integer.toString(index));
        } else if (size == 0) {
            addFirst(personData);
        } else {
            Node<Person> node = getNode(index - 1);
            addAfter(node, personData);
        }
    }

    private Node<Person> getNode(int index) {
        Node<Person> response = head;
        for (int i = 0; i < index; i++) {
            response = response.getNext();
        }
        return response;
    }



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
