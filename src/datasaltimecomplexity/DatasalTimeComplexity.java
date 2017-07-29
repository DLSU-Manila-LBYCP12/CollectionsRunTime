/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasaltimecomplexity;

import java.util.*;

/**
 *
 * @author cobalt
 */
public class DatasalTimeComplexity {

    private final static int NUM_OF_ELEMENTS = 1000000;
    private final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        long start, end;

        Collection<String> collection = new ArrayList<>();
        
        System.out.println("Collection size: " + NUM_OF_ELEMENTS + "\n");        

        
        // ArrayList
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            collection.add(ALPHABET);
        }
        end = System.nanoTime();
        System.out.println("ArrayList " + "construction time:" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((ArrayList<String>) collection).get(NUM_OF_ELEMENTS/2);//get a large random index
        end = System.nanoTime();
        System.out.println("ArrayList " + "getting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        collection.add(ALPHABET);
        end = System.nanoTime();
        System.out.println("ArrayList " + "adding time (last):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((ArrayList<String>) collection).add(1, ALPHABET);
        end = System.nanoTime();
        System.out.println("ArrayList " + "inserting time: (first)" + (end - start) / 1000000000.0 + " seconds."); 
       
        start = System.nanoTime();
        ((ArrayList<String>) collection).add(NUM_OF_ELEMENTS/2, ALPHABET);
        end = System.nanoTime();
        System.out.println("ArrayList " + "inserting time: (middle)" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        collection.remove(NUM_OF_ELEMENTS/2);
        end = System.nanoTime();
        System.out.println("ArrayList " + "deleting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
        System.out.println(" ");

        

        // LinkedList
        collection = new LinkedList<>();
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            collection.add(ALPHABET);
        }
        end = System.nanoTime();
        System.out.println("LinkedList " + "construction time:" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((LinkedList<String>) collection).get(NUM_OF_ELEMENTS/2);//get a large random index
        end = System.nanoTime();
        System.out.println("LinkedList " + "getting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        collection.add(ALPHABET);
        end = System.nanoTime();
        System.out.println("LinkedList " + "adding time (last):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((LinkedList<String>) collection).add(1, ALPHABET);
        end = System.nanoTime();
        System.out.println("LinkedList " + "inserting time (first):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((LinkedList<String>) collection).add(NUM_OF_ELEMENTS/2, ALPHABET);
        end = System.nanoTime();
        System.out.println("LinkedList " + "inserting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        collection.remove(NUM_OF_ELEMENTS/2);
        end = System.nanoTime();
        System.out.println("LinkedList " + "deleting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
        System.out.println(" ");

        

        // Vector
        collection = new Vector<>();
        start = System.nanoTime();
        for (int i = 0; i < NUM_OF_ELEMENTS; i++) {
            collection.add(ALPHABET);
        }
        end = System.nanoTime();
        System.out.println("Vector " + "construction time:" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((Vector<String>) collection).get(NUM_OF_ELEMENTS/2);//get a large random index
        end = System.nanoTime();
        System.out.println("Vector " + "getting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        collection.add(ALPHABET);
        end = System.nanoTime();
        System.out.println("Vector " + "adding time (last):" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((Vector<String>) collection).add(1, ALPHABET);
        end = System.nanoTime();
        System.out.println("Vector " + "inserting time: (first)" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        ((Vector<String>) collection).add(NUM_OF_ELEMENTS/2, ALPHABET);
        end = System.nanoTime();
        System.out.println("Vector " + "inserting time: (middle)" + (end - start) / 1000000000.0 + " seconds.");
        
        start = System.nanoTime();
        collection.remove(NUM_OF_ELEMENTS/2);
        end = System.nanoTime();
        System.out.println("Vector " + "deleting time (middle):" + (end - start) / 1000000000.0 + " seconds.");
    }
}
