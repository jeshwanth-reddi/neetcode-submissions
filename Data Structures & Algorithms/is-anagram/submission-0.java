class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        
        HashMap<Character, Integer> sstr = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tstr = new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            sstr.put(s.charAt(i), sstr.getOrDefault(s.charAt(i), 0) + 1);
            tstr.put(t.charAt(i), tstr.getOrDefault(t.charAt(i), 0) + 1);
        }
        for(char ele : sstr.keySet()){
            if(!sstr.get(ele).equals(tstr.get(ele))){
                System.out.println(ele + "  " + " = " + " " + sstr.get(ele) + "!= " + tstr.get(ele));
                return false;
            }

        }
        return true;

    }
}
