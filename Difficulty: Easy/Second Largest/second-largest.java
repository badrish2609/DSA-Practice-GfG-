class Solution {
    public int getSecondLargest(int[] arr) {
        int slg = -1; int lg = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > lg ) {
                slg = lg;
                lg = arr[i];
            } else if (arr[i] > slg && arr[i] != lg) {
                slg = arr[i];
            }
            }  return slg; 
        } 
        
    }
