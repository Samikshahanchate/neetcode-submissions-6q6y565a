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

        for(int i=0;i<len2; i++){
            if(map.containsKey(t.charAt(i)))
                 map.put(t.charAt(i),map.get(t.charAt(i))-1);
            else
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
