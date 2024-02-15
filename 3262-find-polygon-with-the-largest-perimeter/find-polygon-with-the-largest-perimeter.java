class Solution {
    public long largestPerimeter(int[] nums) {
        
        Arrays.sort(nums);
        int n  = nums.length;
        long sum = 0;
        long ans = -1;

        for(int i=0; i<n; i++){
            
            if(nums[i] < sum){
                ans = nums[i] + sum;
            }
            sum += nums[i];
        }
        return ans;
    }
}