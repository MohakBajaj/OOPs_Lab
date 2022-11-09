// Write a program for the following HashMap
// find whether specified key exists or not.
// find whether specified value exists or not
// get all keys from the given HashMap
// get all key-value pair as Entry objects

package Lab_9.Program_6;

import java.util.HashMap;

public class hashMap {
    HashMap<Integer, String> map = new HashMap<Integer, String>(10);

    public void take_input(int noOfElements) {
        for (int i = 0; i < noOfElements; i++) {
            map.put(i, "Value " + i);
        }
    }

    public void findKey(int key) {
        if (map.containsKey(key)) {
            System.out.println("Key " + key + " exists");
        } else {
            System.out.println("Key " + key + " does not exist");
        }
    }

    public void findValue(String value) {
        if (map.containsValue(value)) {
            System.out.println("Value " + value + " exists");
        } else {
            System.out.println("Value " + value + " does not exist");
        }
    }

    public void getKeys() {
        System.out.println("Keys: " + map.keySet());
    }

    public void getKeyValuePairs() {
        System.out.println("Key-Value pairs: " + map.entrySet());
    }

    public static void main(String[] args) {
        hashMap h = new hashMap();
        h.take_input(10);
        h.findKey(5);
        h.findValue("Value 5");
        h.findValue("Value 11");
        h.getKeys();
        h.getKeyValuePairs();
    }
}
