class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        int [] result = new int[2];
        int complement = 0;
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if(map.containsKey(complement)){
                int valor = map.get(complement);
                result[0] = valor;
                result[1] = i;
            }
            else{
                map.put(nums[i],i);
            }
        }

        return result;
       
}
}
