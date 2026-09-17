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

        for(int i = frase.length() -1 ; i >= 0; i--){
            reverse += frase.charAt(i);
        }

        if(frase.equals(reverse)){
            return true;
        }

        return false;
    }
}