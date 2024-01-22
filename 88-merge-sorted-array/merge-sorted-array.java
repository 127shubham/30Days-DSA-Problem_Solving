class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int[] result = new int [m+n];
        int i=0, j=0, index=0;
        
        while(i<m && j<n){
            if(nums1[i] < nums2[j]){
                result[index++]=nums1[i];
                i++;
                
            }
            else{
                result[index++]=nums2[j];
                j++;
            }
        }
        
        while(i<m){
            result[index++]=nums1[i++];

        }
        while(j<n){
            result[index++]=nums2[j++];
            
        }
        
        for(int k=0;k<result.length;k++){
            nums1[k]=result[k];
        }
    }
}