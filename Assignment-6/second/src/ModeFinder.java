import java.util.HashMap;

public class ModeFinder {
    public static int findMode(int[] arr) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        int maxCount = 0;
        int mode = arr[0];

        // Count frequency of each element
        for (int num : arr) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            // Update mode if current count is greater
            if (count > maxCount) {
                maxCount = count;
                mode = num;
            }
        }

        return mode;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 2, 3, 4, 3, 5, 2, 2};
        int mode = findMode(array);
        System.out.println("Mode of the array is: " + mode);
    }
}
