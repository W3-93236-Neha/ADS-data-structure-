public class InsertionSortDescending {
    public static void insertionSortDescending(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Change comparison from arr[j] > key to arr[j] < key
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 56, 17, 8, 99};
        insertionSortDescending(arr);

        System.out.println("Sorted in descending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
