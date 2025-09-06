public class Solution {
    public bool IsPalindrome(int x) {
        if(x<0){
            return false;
        }
        int current=x;
        int reversed=0;
        while(x>0){
            reversed= reversed*10 + x % 10;
            x/=10;
        }
        return current==reversed;
    }
}