class Solution {
    public boolean isPalindrome(String s) {
        int beg = 0;
        int end = s.length() - 1;
        while(beg<end){
            while(beg<end && !alpha(s.charAt(beg))){
                beg++;
            }
            while(beg<end && !alpha(s.charAt(end))){
                end--;
            }
            if(Character.toLowerCase(s.charAt(beg)) != Character.toLowerCase(s.charAt(end)))
            return false;
            beg++;
            end--;
        }
        return true;
    }
}

public Boolean alpha(char c){
    return (c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z' || c >= '0' && c <= '9');
}