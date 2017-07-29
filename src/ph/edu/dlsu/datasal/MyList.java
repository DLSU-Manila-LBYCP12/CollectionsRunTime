/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.datasal;

import ph.edu.dlsu.datasal.Exception.ListEmptyException;
import ph.edu.dlsu.datasal.Exception.ListFullException;
import ph.edu.dlsu.datasal.Exception.ListIndexOutOfBoundsException;
import java.util.Arrays;

/**
 *
 * @author cobalt mkc 2017
 * @param <E>
 */
public class MyList<E> implements List<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private E[] data;                      // array of list data
    private int numItems;                  // current size of list
    private int initialCapacity;

    public void createList() {
        createList(DEFAULT_CAPACITY);
    }

    public void createList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.initialCapacity = initialCapacity;
        this.data = (E[]) new Object[initialCapacity];
        this.numItems = 0;
    }

    public void add(int index, E item) throws ListIndexOutOfBoundsException {
        rangeCheckForAdd(index);
        ensureCapacity(numItems + 1);
        int j = numItems;
        while (j >= index) {
            data[j] = data[j - 1];
            j--;
        }
        data[index - 1] = item;
        numItems++;
    }

    public void add(E item) throws ListIndexOutOfBoundsException {
        ensureCapacity(numItems + 1);
        data[numItems++] = item;
    }

    private void rangeCheckForAdd(int index) {
        if (index > numItems + 1 || index < 1) {
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
        }
    }

    private void rangeCheckForRemove(int index) {
        if (index > numItems || index < 1) {
            throw new ListIndexOutOfBoundsException("ERROR: List Index Out Of Bounds");
        }
    }
   

    private void ensureCapacity(int minCapacity) {
        int oldCapacity = data.length;
        if (minCapacity > oldCapacity) {
            Object oldData[] = data;
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            if (newCapacity < minCapacity) {
                newCapacity = minCapacity;
            }
            data = Arrays.copyOf(data, newCapacity);
        }
    }

    public void set(int index, E item) throws ListIndexOutOfBoundsException{
        rangeCheckForRemove(index);
        data[index-1] = item;
    }

    public void remove(int index) throws ListIndexOutOfBoundsException {
        rangeCheckForRemove(index);
        for (int i = index; i < numItems; i++) {
            data[i - 1] = data[i];
        }
        numItems--;
    }

    public boolean isEmpty() {
        return (numItems == 0);
    }

    public E get(int index) throws ListIndexOutOfBoundsException {
        rangeCheckForRemove(index);
        return data[index - 1];
    }

    public int size() {
        return numItems;
    }

    public void clear() {
        for (int i = 0; i < numItems; i++) {
            data[i] = null;
        }
        numItems = 0;
    }
}
