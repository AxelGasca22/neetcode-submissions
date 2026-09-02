class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> s = new HashSet<>();
        int count=0;
        while(count < nums.length){

            if(s.contains(nums[count])){
                return true;
            }
            else{
                s.add(nums[count]);
            }
            count++;
        }

        return false;
    }
}