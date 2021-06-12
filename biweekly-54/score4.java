class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        for(int elem : chalk){
            sum+=elem;
        }
        long res=k;
        res=res%sum;
        for(int i=0;i<chalk.length;i++){
            if(res<chalk[i]){
                return i;
            }
            res-=chalk[i];
        }
        return chalk.length-1;
    }
}
