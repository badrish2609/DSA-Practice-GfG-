
class Solution {
    int findHours(int[] arr, int speed) {

        int totalHours = 0;

        for (int i = 0; i < arr.length; i++) {

            int hours = (arr[i] + speed - 1) / speed;

            totalHours = totalHours + hours;
        }

        return totalHours;
    }

    // Second function: Find minimum eating speed
    public int kokoEat(int[] arr, int k) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > high) {
                high = arr[i];
            }
        }

        // Binary Search
        while (low <= high) {

            int mid = (low + high) / 2;

            int totalHours = findHours(arr, mid);

            if (totalHours <= k) {

                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return low;
    }
}
