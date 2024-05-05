class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
       int n=nums2.length;
        int arr[]= new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                arr[k++]=nums1[i++];
            }
            else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<m){
             arr[k++]=nums1[i++];
        }
        while(j<n){
            arr[k++]=nums2[j++];
        }
        int s= m+n;
        if(s%2==0){
            s/=2;
            return (arr[s]+arr[s-1])/(double) 2;

        }
        else
        return arr[s/2];
        
    }
}