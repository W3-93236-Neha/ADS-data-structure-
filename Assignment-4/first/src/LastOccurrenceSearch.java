public class LastOccurrenceSearch {
    public static int findLastIndex(int[] arr, int key) {
        int lastIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                lastIndex = i; // Update whenever key is found
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 3, 9, 3, 2};
        int key = 3;

        int index = findLastIndex(arr, key);
        if (index != -1) {
            System.out.println("Last occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println("Key not found.");
        }
    }
}
