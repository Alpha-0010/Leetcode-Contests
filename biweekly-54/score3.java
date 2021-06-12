class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        boolean[] visited=new boolean[right+1];
        for(int[] arr : ranges){
            int start=arr[0];
            int end=arr[1];
            start=Math.max(start,left);
            end=Math.min(end,right);
            for(int i=start;i<=end;i++){
                visited[i]=true;
            }
        }
        for(int i=left;i<right+1;i++){
            if(!visited[i]){
                return false;
            }
        }
        return true;
    }
}
