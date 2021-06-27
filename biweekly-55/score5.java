class Solution {
    public long maxAlternatingSum(int[] nums) {
        // sumEven is the resultant sum if the last value was odd indexed.
        // sumOdd is the resultant sum if the last value was even indexed.
        long sumEven=0,sumOdd=0;
        
        for(int i=0;i<nums.length;i++){
            long tmpEven=Math.max(sumOdd+nums[i],sumEven);
            long tmpOdd=Math.max(sumEven-nums[i],sumOdd);
            sumEven=tmpEven;
            sumOdd=tmpOdd;
        }
        return sumEven;
    }
}