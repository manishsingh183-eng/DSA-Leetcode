class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=0;
        int indexnumber=1;
        int i=0;

        while(missing <k){
            if(i<arr.length && arr[i]== indexnumber){
                i++;
            }
            else{
                missing++;
                if(missing==k){
                    return indexnumber;
                }
            }
            indexnumber++;
        }
        return -1;
    }
}