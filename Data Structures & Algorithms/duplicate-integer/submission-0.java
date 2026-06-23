class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i]))
                return true;
            set.add(nums[i]);
        }
        return false;
        
    }
}
// nums = [1, 2, 3, 3]
// true -> any value more than once
// false -> all are unique

// two pointer -> O(n^2), O(1)
// bit man -> if two number are equal then the bit wise ans is zero
// O(n), O(1)

// 1^0 

