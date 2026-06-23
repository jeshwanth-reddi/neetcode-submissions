class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int ans[]= new int[2*n];
        for(int i=0;i<n;i++){
            ans[i] = nums[i];
            ans[i+n] = nums[i];
        }
        return ans;
    }
}


// [1,4,1,2] = n
// ans => [1,4,1,2,1,4,1,2] =2n
// O(2n)
// O(2n)
// O(n), O(2n)