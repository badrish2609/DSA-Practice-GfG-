class Solution {
    public boolean canServe(int[] arr) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < arr.length; i++) {
            int bills = arr[i];
        
        
        if (bills == 5) {
            five ++;
        } else if (bills == 10) {
            if (five > 0) {
                five = five - 1;
                ten = ten + 1;
            } else {
                return false;
            }
        } else if (bills == 20) {
            if (five > 0 && ten > 0) {
                five = five - 1;
                ten = ten - 1;
                
            } else if (five >=3) {
                five = five - 3;
            } else {
                return false;
            } }}
            return true;
        }
        
    }
