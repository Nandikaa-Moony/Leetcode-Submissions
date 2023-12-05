class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
            //if both values are equal then the j is pointed at the position of the first duplicate
            //as a result when a unique value is encountered - the first duplicate is replaced with the unique value
        }
        return j;
    }
}
