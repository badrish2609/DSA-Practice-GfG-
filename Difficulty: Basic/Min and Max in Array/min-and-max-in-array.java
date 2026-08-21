class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int lg = arr[0];
        int sm = arr[0];
        int n = arr.length;
        for (int i = 0; i< n ; i++) {
            if (arr[i] > lg) {
                lg = arr[i];
            } else if (arr[i] < sm) {
                sm = arr[i];
            }
        } ArrayList <Integer> ans = new ArrayList<>();
        ans.add(sm);
        ans.add(lg);
        
        return ans;
        
    }
}
