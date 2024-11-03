package sc2002_lab4;

public class Sorting {

    // Selection Sort implementation
    public static void selectionSort(Comparable[] list) {
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (list[j].compareTo(list[minIndex]) < 0) {
                    minIndex = j; 
                }
            }
            Comparable temp = list[minIndex];
            list[minIndex] = list[i];
            list[i] = temp;
        }
    }

    public static void insertionSort(Comparable[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            Comparable key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(key) > 0) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
}
