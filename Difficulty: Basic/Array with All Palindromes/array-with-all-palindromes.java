class Solution {
    public static boolean isPalinArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int nums = arr[i];
            int og = nums;
            int rev = 0;
       
            while (nums > 0) {
                  
                int digit = nums % 10;
                 rev = rev * 10 + digit;
                nums = nums / 10;
            } if (og != rev) return false;
        } return true; 
    } 
}                                                              