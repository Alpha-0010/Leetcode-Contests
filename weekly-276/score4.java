class Solution {
    public int minMoves(int target, int maxDoubles) {
        int res=0;
        
        // If the target is even then divide it by 2(1 step), if it is odd then decrement it to make it divisible by 2 and then divide it by 2(1+target%2).
        // target%2 --> Number of decrements...
        while(target>1 && maxDoubles-->0 ){
            res+=1+target%2;
            target/=2;
        }
        
        return res+target-1;
    }
}