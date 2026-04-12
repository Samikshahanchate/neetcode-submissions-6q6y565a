class Solution {
    public boolean isPalindrome(String s) {

        char arr[] = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        for(char ch: arr){
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
        }

       StringBuilder copy = new StringBuilder(sb);
       String rev = copy.reverse().toString().toLowerCase();
    System.out.println(sb + " " +rev);
return sb.toString().toLowerCase().equals(rev);
       // 
        //return sb.toString().equals(rev);
        
    }
}
