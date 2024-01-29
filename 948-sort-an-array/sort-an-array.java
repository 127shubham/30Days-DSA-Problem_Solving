class Solution {

    private void merged(int[] nums, int start, int mid, int end){
        int n = mid-start+1, m = end-mid;
        int [] left = new int [n];
        int [] right = new int[m];

     
        int i =0,j=0;
        for(i=0;i<n;i++)
            left[i] = nums[start+i];
        
        for(i=0;i<m;i++)
            right[i] = nums[i+mid+1];
        
        i=0;
        j=0;
        int k = start;
        while(i<n && j<m){
            if(left[i]<right[j])
                nums[k++] = left[i++];
            else
                nums[k++] = right[j++];
        }
        
        while(i<n)
            nums[k++] = left[i++];
        
        while(j<m)
            nums[k++] = right[j++];
        
    }
    private void sort(int[] nums, int start,int end){
        if(start < end){
            int mid = start + (end-start)/2;
            sort(nums, start, mid);
            sort(nums, mid+1, end);
            merged(nums, start, mid, end);
        }
    }
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums;
    }
}