public class BinarySearchDescending {
    public static int binarySearchDescending(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                // Search left half
                high = mid - 1;
            } else {
                // Search right half
                low = mid + 1;
            }
        }

        return -1; // Key not found
    }

    public static void main(String[] args) {
        int[] arr = {99, 85, 72, 60, 45, 30, 15, 5}; // Descending order
        int key = 45;

        int index = binarySearchDescending(arr, key);
        if (index != -1) {
            System.out.println("Key " + key + " found at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
    }
}
