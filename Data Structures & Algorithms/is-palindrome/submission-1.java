class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String frase = "";
        String reverse="";

        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                frase += s.charAt(i); 
            }
        }

        int left = 0;
        int right = frase.length() - 1;

        while(left < right){
            
            if(frase.charAt(left) != frase.charAt(right)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}