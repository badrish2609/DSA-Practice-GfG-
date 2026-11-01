class Solution {
    public boolean canReach(int[] arr) {
    int maxReach = 0;
    int n = arr.length;
    
    for (int i = 0; i < n ; i++) {
        
        if (i > maxReach) return false;
        maxReach = Math.max(maxReach, i + arr[i]);
    } return true;
        
    }
}