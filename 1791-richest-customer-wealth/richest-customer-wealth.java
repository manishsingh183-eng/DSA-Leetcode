class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        
        for (int person=0; person<accounts.length;person++){
            int sum=0;
            for(int acc=0;acc<accounts[person].length;acc++){
                sum+=accounts[person][acc];
            }
            if(max<sum){
            max=sum;
            }
        }
        
        return max;
    }
}