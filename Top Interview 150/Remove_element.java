class Solution {
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                //if not equal to the val to be exempted
                //put the value in the place pointed by index
                nums[index] = nums[i];
                index++;
            }
            //if it is equal to the val then i skips and moves to next element
            //index still points to the previous point where the val is
            //it will be replaced by the next not_val value
            //index ultimately gives the number of valid values in array
        }
        return index;
    }
}
