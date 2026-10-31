class Solution {
    static int solve(int bt[]) {
    Arrays.sort(bt);
    int n = bt.length;
    int t = 0;
    int wtTime = 0;
    
    for (int i = 0; i < n; i++) {
        wtTime = wtTime + t;
        t = t + bt[i];
    } return (wtTime / n);
        
    }
}
