class Solution {
    public static int findEquilibrium(int arr[]) {
        int n = arr.length;
        int Tsum = 0; int Lsum = 0;
        for (int i = 0; i < n; i++) {
            Tsum += arr[i];
        } for (int i = 0; i < n; i++) {
            int Rsum = Tsum - Lsum - arr[i];
         if (Lsum == Rsum) {
            return i;
         }
        Lsum = Lsum + arr[i];
        }
        return -1;
        } 
        
    }

