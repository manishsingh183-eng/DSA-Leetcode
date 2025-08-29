class Solution {
    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (n == 4) return false;
        return isHappy(getNext(n));
    }

    private int getNext(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
