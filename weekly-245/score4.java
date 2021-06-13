class Solution {
    public int maximumRemovals(String s, String p, int[] removable) {
        // Can Use Binary Search.
        char[] letters=s.toCharArray();
        int left=0,right=removable.length-1;
        
        while(left<=right){
            int mid=(left+right)/2;
            
            // Mark all the character from 0 to mid as '/'.
            for(int i=0;i<=mid;i++){
                letters[removable[i]]='/';
            }
            
            if(check(letters,p)){ // If after making all the characters from 0 to mid '/' then we can shift our left pointer.
                left=mid+1;
            }else{
                for(int i=0;i<=mid;i++){
                    letters[removable[i]]=s.charAt(removable[i]);
                }
                right=mid-1;
            }
        }
        return left;
    }
    
    public boolean check(char[] letters,String p){
        int idx1=0,idx2=0;
        
        while(idx1<letters.length && idx2<p.length()){
            if(letters[idx1]==p.charAt(idx2)){
                idx2++;
            }
            idx1++;
        }
        return idx2==p.length();
    }
}
