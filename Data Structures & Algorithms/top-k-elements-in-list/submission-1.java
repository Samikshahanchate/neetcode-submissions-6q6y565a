class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        List<Integer> keys = new ArrayList<>(map.keySet());
        keys.sort((a, b) -> map.get(b) - map.get(a));

        for(int i = 0; i < k; i++){
            list.add(keys.get(i));
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
