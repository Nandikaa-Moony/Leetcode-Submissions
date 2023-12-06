class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int j = 2;
        //if the element is not same as the prev to prev then the j is incremented and the element pointed by i is copied to j
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        //if the element is same then i alone is incremented (a third duplicate is found)
        //this is done until a unique element is found
        return j;
    }
}
