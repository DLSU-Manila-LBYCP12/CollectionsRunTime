/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.edu.dlsu.datasal.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import ph.edu.dlsu.datasal.Exception.ListIndexOutOfBoundsException;
import ph.edu.dlsu.datasal.MyLinkedList;

/**
 *
 * @author cobalt
 */
public class MyLinkedListTest {

    private MyLinkedList<String> list;

    @Before
    public void setUp() {
        list = new MyLinkedList<>();
        list.createList();
    }

    @After
    public void tearDown() {
        list = null;
    }

    @Test
    public void createListTest() {
        assertTrue(list.isEmpty());
        assertTrue(list.size() == 0);
    }

    @Test(expected = ListIndexOutOfBoundsException.class)
    public void removeWithEmptyListTest() {
        list.remove(1);
    }

    @Test(expected = ListIndexOutOfBoundsException.class)
    public void invalidAddTest1() {
        list.add(0, "Zero");
    }

    @Test(expected = ListIndexOutOfBoundsException.class)
    public void invalidAddTest2() {
        list.add(2, "Two");
    }

    @Test
    public void addTest() {
        list.add(1, "Alpha");
        list.add(2, "Beta");
        list.add(3, "Gamma");

        assertEquals("Alpha", list.get(1));
        assertEquals("Beta", list.get(2));
        assertEquals("Gamma", list.get(3));

        list.add(1, "Omega");

        assertEquals("Omega", list.get(1));
        assertEquals("Alpha", list.get(2));
        assertEquals("Beta", list.get(3));
        assertEquals("Gamma", list.get(4));

        assertTrue(list.size() == 4);

        list.add("Kappa");
        assertEquals("Kappa", list.get(5));
        assertTrue(list.size() == 5);
        
        list.clear();

        char alphabet = 'A';
        for (int i = 0; i < 26; ++i) {
            String element = Character.toString(alphabet++);
            list.add(element);
            assertEquals(element, list.get(i + 1));
        }
    }

    @Test
    public void testSetElement() {
        list.add(1, "Alpha");
        list.add(2, "Beta");
        list.add(3, "Gamma");

        list.set(1, "Omega");

        assertEquals("Omega", list.get(1));
        assertEquals("Beta", list.get(2));
        assertEquals("Gamma", list.get(3));
    }

    @Test
    public void removeElementTest() {
        list.add(1, "Alpha");
        list.add(2, "Beta");
        list.add(3, "Gamma");

        list.remove(2);

        assertEquals("Gamma", list.get(2));
        assertTrue(list.size() == 2);
    }

    @Test
    public void clearTest() {
        list.add(1, "Alpha");
        list.add(2, "Beta");
        list.add(3, "Gamma");

        list.clear();
        assertTrue(list.size() == 0);
    }
}
