class Solution {
    boolean twoSum(int arr[], int target) {
        int n = arr.length;
        HashSet <Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int req = target - arr[i];
            
            if (set.contains(req)) {
                return true;
            } set.add(arr[i]);
        } return false;
    }
}