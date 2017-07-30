/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.datasal;

import ph.edu.dlsu.datasal.Exception.ListIndexOutOfBoundsException;

/**
 *
 * @author cobalt mkc
 */
public class MyLinkedListSlow<E> implements List<E> {

    private Node<E> head;
    private int numItems;

    public void createList() {
        numItems = 0;
        head = null;
    }

    public void add(int index, E item) throws ListIndexOutOfBoundsException {
        rangeCheckForAdd(index);
        if (index == 1) { // Create head
            Node<E> newNode = new Node<E>(item);
            newNode.setNext(head);
            head = newNode;
        } else {
            Node<E> newNode = new Node<E>(item);
            Node<E> previous = find(index - 1);
            newNode.setNext(previous.getNext());
            previous.setNext(newNode);
        }
        numItems++;
    }

    public void add(E item) {
        add(numItems + 1, item);
    }

    private void rangeCheckForAdd(int index) {
        if (index > numItems + 1 || index < 1) {
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
        }
    }

    public void remove(int index) throws ListIndexOutOfBoundsException {
        rangeCheckForRemove(index);
        if (index == 1) {
            head = head.getNext();
        } else {
            Node<E> previous = find(index - 1);
            Node<E> current = previous.getNext();
            previous.setNext(current.getNext());
        }
        numItems--;
    }

    private void rangeCheckForRemove(int index) {
        if (index > numItems || index < 1) {
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
        }
    }

    public boolean isEmpty() {
        return numItems == 0;
    }

    public E get(int index) throws ListIndexOutOfBoundsException {
        rangeCheckForRemove(index);
        Node<E> current = find(index);
        E item = current.getItem();
        return item;
    }

    public void set(int index, E item) throws ListIndexOutOfBoundsException {
        rangeCheckForRemove(index);
        Node<E> current = find(index);
        current.setItem(item);
    }

    public int size() {
        return numItems;
    }

    /// Locate a specified node in a linked list:
    private Node<E> find(int index) {
        // precondition: index is the number of the desired node,
        // precondition: assume 1 ≤ index ≤ numItems+1;
        // postcondition: returns a reference to the desired node.
        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.getNext();
        }
        return current;
    } //end find

    public void clear() {
        Node<E> current = head.getNext();
        while (current != null) {
            Node<E> next = current.getNext();
            current.setNext(null);
            current.setItem(null);
            current = next;
        }
        numItems = 0;
        head = null;
    }
}//end class
