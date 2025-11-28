public class Solution {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        int[] charCounts = new int[26];
        for(int i=0;i<s.length();i++){
            charCounts[s.charAt(i) - 'a']++;
        }
        for(int j=0;j<t.length();j++){
            charCounts[t.charAt(j) - 'a']--;
        }

        for(int count : charCounts){
            if(count != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
    Solution sol = new Solution();
    String s = "pot";
    String t = "top";
    boolean result = sol.isAnagram(s,t);
        System.out.println(result);
    }
}
