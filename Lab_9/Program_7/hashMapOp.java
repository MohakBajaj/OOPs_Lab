// Write a program for the following HashSet
// copy another collection object to HashSet object.
// delete all entries at one call from HashSet
// search user defined objects from HashSet

package Lab_9.Program_7;

import java.util.HashSet;

public class hashMapOp {
    HashSet<Integer> set = new HashSet<Integer>(10);

    public void take_input(int noOfElements) {
        for (int i = 0; i < noOfElements; i++) {
            set.add(i);
        }
    }

    public void copyCollection(HashSet<Integer> set) {
        HashSet<Integer> set2 = new HashSet<Integer>(10);
        set2.addAll(set);
        System.out.println("Copied set: " + set2);
    }

    public void deleteAll() {
        set.clear();
        System.out.println("Set after clearing: " + set);
    }

    public void search(int key) {
        if (set.contains(key)) {
            System.out.println("Key " + key + " exists");
        } else {
            System.out.println("Key " + key + " does not exist");
        }
    }

    public static void main(String[] args) {
        hashMapOp h = new hashMapOp();
        h.take_input(10);
        h.copyCollection(h.set);
        h.search(5);
        h.deleteAll();
    }
}
