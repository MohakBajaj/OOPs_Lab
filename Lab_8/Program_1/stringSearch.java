// Write a program for searching strings for the first occurrence of a character or substring and for the last occurrence of a character or substring

package Lab_8.Program_1;

public class stringSearch {
    String str;

    stringSearch(String str) {
        this.str = str;
    }

    public void search(String subString) {
        // Search first occurence
        System.out.println("First occurence at " + str.indexOf(subString));
        System.out.println("Last occurence at " + str.lastIndexOf(subString));
    }

    public static void main(String[] args) {
        stringSearch s = new stringSearch("hello this is it. hello");
        s.search("llo");
    }
}
