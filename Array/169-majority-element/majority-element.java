class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
        int ans =0;
        for(int i=0;i<nums.length;i++){
            h.put(nums[i], h.getOrDefault(nums[i], 0) + 1);
            if(h.get(nums[i]) > nums.length/2){
              ans = nums[i];
              break;
            }
        }
        return ans;
    }
}