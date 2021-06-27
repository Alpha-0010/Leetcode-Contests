class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean used=false;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]<=nums[i-1]){ // Not Strictly Increasing.
                if(used){
                    return false;
                }
                used=true;
                if(i>1 && nums[i]<=nums[i-2]){  // If nums[i]<=nums[i-2] then remove nums[i]. Else remove nums[i-1]
                    nums[i]=nums[i-1];
                }
            }
        }
        
        return true;
    }
}