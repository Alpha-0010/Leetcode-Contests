class Solution {
    public boolean makeEqual(String[] words) {
        int n=words.length;
        if(n==0 || n==1){
            return true;
        }
        int[] hash=new int[256];
        for(String str : words){
            for(char ch : str.toCharArray()){
                hash[ch]++;
            }
        }
        for(int i=0;i<256;i++){
            if(hash[i]%n!=0){
                return false;
            }
        }
        return true;
    }
}
