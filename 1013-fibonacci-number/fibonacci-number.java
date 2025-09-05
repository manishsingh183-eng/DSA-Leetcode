class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }

        int pre=0;
        int current=1;
        for(int i=2;i<=n;i++){
            int next= pre + current;
            pre= current;
            current=next;
        }

        return current;
    }
}