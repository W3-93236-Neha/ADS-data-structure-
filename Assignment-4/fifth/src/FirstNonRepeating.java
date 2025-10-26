import java.util.*;

public class FirstNonRepeating {
    public static int findFirstNonRepeating(int[] arr) {
        Map<Integer, Integer> countMap = new LinkedHashMap<>();

        // Step 1: Count occurrences
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find first element with count 1
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return -1; // No non-repeating element found
    }

    public static void main(String[] args) {
        int[] input = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        int result = findFirstNonRepeating(input);
        System.out.println("First non-repeating element: " + result);
    }
}
