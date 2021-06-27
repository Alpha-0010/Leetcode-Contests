class Solution {
    public String removeOccurrences(String s, String part) {
        // If the String s doesnot contain any occurrence of part then retrun s.
        // Else do the recursive call by replace all part with "" in String s.
        if(!s.contains(part)){
            return s;
        }
        return removeOccurrences(s.replaceAll(part,""),part);
    }
}