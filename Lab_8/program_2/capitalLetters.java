// 2)	Write a program that converts all characters of a string in capital letters. (Use StringBuffer to store a string). Don’t use inbuilt function. 

package Lab_8.program_2;

public class capitalLetters {
    StringBuffer str;

    public capitalLetters(StringBuffer str) {
        this.str = str;
    }

    public void capitalize() {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                str.setCharAt(i, (char) (str.charAt(i) - 32));
            }
        }
    }

    public static void main(String[] args) {
        capitalLetters obj = new capitalLetters(new StringBuffer("hello world"));
        obj.capitalize();
        System.out.println(obj.str);
    }
}
