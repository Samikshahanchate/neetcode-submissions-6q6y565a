class Solution {
    public int longestConsecutive(int[] nums) {

        int res=0;
        
        Set<Integer> store = new HashSet<>();

        for(int num:nums){
            
            store.add(num);
        }

        for(int num: nums){
            
            int count=0, curr = num;
            
            while(store.contains(curr)){
                count++;
                curr++;
            }
            res = Math.max(res,count);

        }
        return res;
        
    }
}
