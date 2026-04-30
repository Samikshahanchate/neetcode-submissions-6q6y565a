class Solution {
    public boolean isAnagram(String s, String t) {

        int len1 = s.length();
        int len2 = t.length();

        HashMap<Character, Integer> map = new HashMap<>();

        if(len1!=len2)
            return false;

        for(int i=0;i<len1; i++){

            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }

      
            
for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!map.containsKey(c))
                return false;

            map.put(c, map.get(c) - 1);

            if (map.get(c) < 0)
                return false;
        }

        

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            System.out.println(entry.getKey()+" " + entry.getValue());
        }

        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if (entry.getValue()>0)
                return false;
        }

        return true;
    }
}
