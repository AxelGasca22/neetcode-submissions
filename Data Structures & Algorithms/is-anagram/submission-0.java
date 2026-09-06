class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length() != t.length()){
            return false;
        }

        Map <Character, Integer> sfrequency = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char actuals = s.charAt(i);

            if(sfrequency.containsKey(actuals)){
                sfrequency.put(actuals,sfrequency.getOrDefault(actuals,0)+1);
            }else{
                sfrequency.put(actuals, 1);
            }
        }

        for(int i = 0; i < t.length(); i++){
            char actuals = t.charAt(i);

            if(sfrequency.containsKey(actuals)){
                sfrequency.put(actuals,sfrequency.getOrDefault(actuals,0)-1);
            }
        }

        for(int valores : sfrequency.values()){
            if(valores != 0){
                return false;
            }
        }

        return true;

    }
}
