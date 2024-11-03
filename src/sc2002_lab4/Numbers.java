package sc2002_lab4;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer[] numbers = new Integer[5];  // Use Integer instead of int
        System.out.println("Enter numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        Sorting.selectionSort(numbers);
        for (Integer num : numbers) {
            System.out.print(num + " ");
        }
    }
}
