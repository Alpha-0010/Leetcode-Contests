class Solution {
    public String[] divideString(String s, int k, char fill) {
        List<String> resList=new ArrayList<>();
        for(int i=0;i<s.length();){
            String temp=new String();
            int j=0;
            for(j=0; i+j<s.length() && j<k;j++){
                temp+=s.charAt(i+j);
            }
            i+=j;
            if(temp.length()<k){
                while(temp.length()<k){
                    temp+=fill;
                }
            }
            resList.add(temp);
        }
        String[] res=new String[resList.size()];
        for(int i=0;i<res.length;i++){
            res[i]=resList.get(i);
        }
        return res;
    }
}