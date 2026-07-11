public class OneD {

    public static void main(String[] args) {

        // Declare an array
        int[] numbers = new int[5];

        // Initialize array
        numbers[0] = 10;
        numbers[1] = 22;
        numbers[2] = 13;
        numbers[3] = 40;
        numbers[4] = 35;

        // Print array
        System.out.println("Array Elements:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // Linear Search
        int searchValue = 22;
        boolean found = false;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchValue) {
                found = true;
                index = i;
                break;
            }
        }

        // Result
        if (found) {
            System.out.println("Value " + searchValue + " found at index " + index);
        } else {
            System.out.println("Value " + searchValue + " not found.");
        }
    }
}