class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i:nums){
            if(countdigit(i)%2==0){
                count++;
            }
        }
        return count;
    }
    public int countdigit(int num){
        int count=0;
        while(num>0){
            count++;
            num /=10;
        }
        return count;
    }
}