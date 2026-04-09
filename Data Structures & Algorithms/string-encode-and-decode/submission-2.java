class Solution {

    public String encode(List<String> strs) {

       
        StringBuilder sb = new StringBuilder();

        for(String key: strs){
            sb.append(key).append(".");
        }

        System.out.println(sb);
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String> list = new ArrayList<>();

        char[] input = str.toCharArray();
        StringBuilder sb = new StringBuilder ();

        for(char ch: input){
            
                if(ch == '.'){
                    list.add(sb.toString());
                    sb.setLength(0); 
                } 

                else
                    sb.append(ch);               
            }

        return list;

    }
}
