class Solution {
    public String longestCommonPrefix(String[] str) {
       

       String prefix = str[0];
       String temp;
       int checksize;
       for(int i=1;i< str.length;i++){
        checksize = prefix.length() <= str[i].length() ? prefix.length() : str[i].length();
        if(checksize == 0){
            return "";
        }
        temp = "";
        for(int j=0;j<checksize;j++){
            if(prefix.charAt(j) == str[i].charAt(j)){
                temp += prefix.charAt(j) + "";
            }
            else{
                break;
            }
        }
            prefix = temp;
            System.out.println(prefix);
       }
       return prefix;
        
    }
}