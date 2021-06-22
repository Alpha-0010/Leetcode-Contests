class Solution {
    public String largestOddNumber(String num) {
        String res=new String();
        
        int idx=-1;
        int i=num.length()-1;
        while(i>=0){
            if((num.charAt(i)-'0')%2!=0){
                idx=i;
                break;
            }else{
                i--;
            }
        }
        if(idx==-1){
            return "";
        }
        res=num.substring(0,idx+1);
        return res;
    }
}
