class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        if(k == 0){
            return nums;
        }
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) +1);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        int minFreq = Integer.MAX_VALUE;
        int minIndex = -1;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<Map.Entry<Integer, Integer>>(k);
        for(Map.Entry<Integer, Integer> ele : map.entrySet()){
            minFreq = Integer.MAX_VALUE;
            minIndex = -1;
            if(list.size() < k){
                list.add(ele);
            }
            else{
                for(int i=0;i<list.size();i++){
                    if(minFreq > list.get(i).getValue()){
                        minFreq = list.get(i).getValue();
                        minIndex = i;  
                    } 
                }
                if(ele.getValue() > minFreq){
                    list.set(minIndex, ele);
                }
            }
        }
        int[] result = new int[list.size()];
        int q =0;
        for(Map.Entry<Integer, Integer> element : list){
            result[q++] = element.getKey();
        }
        return result;
    }
}
