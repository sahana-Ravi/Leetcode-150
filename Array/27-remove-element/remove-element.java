class Solution {
    public int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];  // swap with last element
                right--; // reduce array size
            } else {
                left++;
            }
        }
        return right;
    }
}