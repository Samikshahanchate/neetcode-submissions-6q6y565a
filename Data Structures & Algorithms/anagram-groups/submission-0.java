class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            char[] arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            System.out.println(arr +" " +key);

            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(strs[i]);

        }

        for(Map.Entry<String, List<String>> entry :map.entrySet()){
           // System.out.println(entry.getKey() +" " + entry.getValue());
            ans.add(entry.getValue());
        }

        return ans;
        
    }
}
