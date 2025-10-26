//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NthOccurrenceSearch {
    public static int findNthOccurrence(int[] arr, int key, int n) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
                if (count == n) {
                    return i; // Return index of nth occurrence
                }
            }
        }

        return -1; // nth occurrence not found
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 2, 5};
        int key = 2;
        int n = 3;

        int index = findNthOccurrence(arr, key, n);
        if (index != -1) {
            System.out.println("The " + n + "rd occurrence of " + key + " is at index: " + index);
        } else {
            System.out.println("The " + n + "rd occurrence of " + key + " was not found.");
        }
    }
}
