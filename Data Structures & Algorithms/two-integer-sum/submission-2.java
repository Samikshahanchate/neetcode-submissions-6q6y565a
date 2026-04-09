class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){

            map.put(nums[i],i);

        }
        int i=0, j=0;
        while(i<nums.length){
            if(map.containsKey(target-nums[i]) && (map.get(target-nums[i]) != i) ){
                j= map.get(target-nums[i]);
                return new int[]{i,j};
            }

            i++;
        }

        return new int[]{};
        
    }
}
