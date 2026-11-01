class Solution {
    public int minPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);
        int n = arr.length;
        int count = 0; int maxCount = 0;
        int i = 0; int j = 0;
        
        while (i < n && j < n) {
                if (arr[i] <= dep[j]) {
                    count = count + 1;
                    i++;
                } else {
                    count = count - 1;
                    j++;
                }
                
            maxCount = Math.max (maxCount, count);
            } return maxCount;
        }
    }

