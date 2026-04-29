class Solution {
    public boolean hasDuplicate(int[] nums) {

        int len = nums.length-1;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){

            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }
            else
                return true;
    
        }

        return false;
    }
}