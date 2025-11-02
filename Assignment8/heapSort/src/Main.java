// Main.java
public class Main {
    public static void main(String[] args) {
        int[] arr = {20, 5, 16, 8, 14, 2};

        System.out.println("Original array:");
        printArray(arr);

        HeapSort sorter = new HeapSort();
        sorter.sortDescending(arr);

        System.out.println("Sorted array in descending order:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int value : arr)
            System.out.print(value + " ");
        System.out.println();
    }
}
