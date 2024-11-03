package sc2002_lab4;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = new String[5];
        System.out.println("Enter words:");
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }
        Sorting.insertionSort(words);
        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}

