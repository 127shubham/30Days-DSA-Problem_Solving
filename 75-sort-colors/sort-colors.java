class Solution {
    public void sortColors(int[] nums) {

        Arrays.sort(nums);
       
        
    }
}
// using Three-Pointer Approach
class Solution {
    public void sortColors(int[] nums) {

        int zero = 0;
        int two = nums.length;
        int temp = 0;
        int n = nums.length;

        while(temp < n && temp <= two){
            if(nums[temp] == 0){
                swap(nums, temp++, zero++);
            }
            else if(nums[temp] == 2){
                swap(nums, temp, two--)
            }
            else
            temp++;
        }
        
    }
}
