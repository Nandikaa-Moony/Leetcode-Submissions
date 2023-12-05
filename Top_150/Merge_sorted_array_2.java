class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        
        while (j >= 0) {
            //traverse only till num2 is exhausted
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
                //if nums1 elt is greater place it first and go next
            } else {
                nums1[k--] = nums2[j--];
                //if nums2 elt is greater place it first and go next
            }
        }
    }
}

//O(m+n)
