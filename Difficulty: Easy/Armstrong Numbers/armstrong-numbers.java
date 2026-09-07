class Solution {
    static boolean armstrongNumber(int n) {
        int og = n;
        int sum = 0;
        
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (digit * digit * digit);
            n = n / 10;
        }
        if (og == sum) {
            return true;
        }
        else return false;
    }
}