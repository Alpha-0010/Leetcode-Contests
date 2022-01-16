class Solution {
    public long mostPoints(int[][] questions) {
        // Similar to House Robber...
        /*
        Take: points[i] + dp[i + 1 + brainpower[i]],
        Skip: dp[i + 1].
        */
        long[] dp=new long[200001];
        Arrays.fill(dp,0);
        for(int i=questions.length-1;i>=0;i--){
            dp[i]=Math.max(questions[i][0]+dp[questions[i][1]+i+1],dp[i+1]);
        }
        return dp[0];
    }
}