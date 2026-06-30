class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
        List<String> ele;
        for(String str : strs){
            int arr[] = new int[26];
            for(char ch : str.toCharArray()){
                arr[ch- 'a'] += 1;
            }
            String temp = Arrays.toString(arr);
            if(map.containsKey(temp)){
                map.get(temp).add(str);
            }
            else{

                ele = new ArrayList<String>();
                ele.add(str);
                map.put(temp, ele);
            }
        }
        List<List<String>> ans = new ArrayList<List<String>>();
        for(Map.Entry<String, List<String>> mm : map.entrySet()){
            ans.add(mm.getValue());
        }
        return ans;
    }
}
