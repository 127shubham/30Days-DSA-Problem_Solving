class Solution {
   
     static void reverse(int nums[], int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

     public void rotate(int[] nums, int k) { 
         
        int n = nums.length;
        if (nums.length == 0) return;

        // Get the effective number of rotations:
        k = k % n;

        //step 1:
        reverse(nums, 0, n - 1);

        //step 2:
        reverse(nums, 0, k - 1);

        //step 3:
        reverse(nums, k, n - 1);
    }
}