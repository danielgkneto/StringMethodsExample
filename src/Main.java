/*Create a program that will allow users to enter a word, and a character number index. Your program will print out
the size of the word, as well as the substring (starting from 0) to the index the user specified. If the user entered
index is larger than the size of the word, the program will print "Index is larger than length".*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String text;
        int index;

        System.out.println("\nEnter a word: ");
        text = kb.nextLine();
        System.out.println("\nEnter the character index: ");
        index = kb.nextInt();

        System.out.println("Size: " + text.length());

        if (index < text.length())
            System.out.println("Substring until index: " + text.substring(0, index));
        else
            System.out.println("Index is larger than length");
    }
}
