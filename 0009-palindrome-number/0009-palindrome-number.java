class Solution {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        String reStrX = "";
        for(int i=strX.length()-1; i>=0; i--) {
            reStrX += strX.charAt(i);
        }

        if (strX.equals(reStrX)){
            return true;
        }    
        else return false;
    }
}